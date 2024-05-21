package proyecto2fada;

import java.util.ArrayList;
import proyecto2fada.Clases.Varilla;
import static proyecto2fada.metodoSolucion.ncombinaciones;
import static proyecto2fada.metodoSolucion.nmaximoCombinaciones;
import static proyecto2fada.metodoSolucion.nminimovarillas;
import static proyecto2fada.metodoSolucion.pmenorVarillas;

public class metodoSolucionDinamico {

    public static int totalCombinaciones = 0;
    public static ArrayList<Varilla> varillasArchivo = new ArrayList<>();
    private static final ArrayList<Varilla> vectorAux = new ArrayList<>();

    public static ArrayList<ArrayList> seleccionadaV = new ArrayList<>();
    public static ArrayList<Varilla> selectVarillasM = new ArrayList<>();

    public static String dinamico(int longitudVarilla) {
        boolean bandera1 = true;
        vectorAux.addAll(varillasArchivo);
        for (int p = 0; p < vectorAux.size();) {
            varillasArchivo.clear();
            varillasArchivo.addAll(vectorAux);

            bandera1 = true;
            while (bandera1) {
                Cambio(12, varillasArchivo);
                for (int j = 0; j < vectorSeleccion.length; j++) {
                    if ((getVectorSeleccion()[j] > 1) || (getVectorSeleccion()[0] == 0)) {
                        bandera1 = false;
                    }
                }
                if (bandera1 == true) {
                    mostrar(varillasArchivo);
                    if (getVectorSeleccion()[0] > 0) {
                        totalCombinaciones++;
                        int tamano = varillasArchivo.size();
                        int b = 0;
                        for (int i = 0; i < varillasArchivo.size(); i++) {
                            if ((i != 0) && (getVectorSeleccion()[i + b] > 0)) {
                                varillasArchivo.remove(i);
                                b++;
                                i -= b;
                            }
                        }
                        System.out.println("");
                        if (tamano == varillasArchivo.size()) {
                            bandera1 = false;
                        }
                    } else {
                        bandera1 = false;
                    }
                } else {
                    bandera1 = false;
                }
            }
            vectorAux.remove(0);
        }
        return metodoSolucion.procesar(longitudVarilla);
    }

    public static String mostrar(ArrayList<Varilla> ve) {
        String respuesta = "";
        for (int i = 0; i < ve.size(); i++) {
            respuesta += "maxima combinaciones: " + nmaximoCombinaciones() + "\n";
            respuesta += "minimo varillas: " + nminimovarillas() + "\n";
            respuesta += "valor minimo: " + pmenorVarillas() + "\n";
            respuesta += "Combinaciones posibles: " + ncombinaciones() + "\n";
        }
        return respuesta;
    }

    private static int[][] matrizObtener;
    private static ArrayList<Varilla> vectorVarillas;
    private static int cantidad;
    private static int[] vectorSeleccion;

    public static void Cambio(int cantidad, ArrayList<Varilla> varillas) {
        vectorVarillas = varillas;
        matrizObtener = calcularCombinaciones(cantidad, varillas);
        vectorSeleccion = seleccionarVarillas(cantidad, varillas, matrizObtener);
    }

    public static int[] getVectorSeleccion() {
        return vectorSeleccion;
    }

    private static int[][] calcularCombinaciones(int cantidad, ArrayList<Varilla> varillas) {

        int[][] matrizObtener = new int[varillas.size() + 1][cantidad + 1];

        for (int i = 0; i < varillas.size(); i++) {
            matrizObtener[i][0] = 0;
        }

        for (int j = 1; j <= cantidad; j++) {
            matrizObtener[0][j] = 99;
        }

        for (int i = 1; i <= varillas.size(); i++) {
            for (int j = 1; j <= cantidad; j++) {
                if (j < varillas.get(i - 1).getLongitud()) {

                    matrizObtener[i][j] = matrizObtener[i - 1][j];
                } else {

                    int minimo = 0;

                    minimo = min(matrizObtener[i - 1][j], matrizObtener[i][j - varillas.get(i - 1).getLongitud()] + 1);
                    matrizObtener[i][j] = minimo;

                }
            }
        }

        return matrizObtener;
    }

    private static int[] seleccionarVarillas(int c, ArrayList<Varilla> varillas, int[][] tabla) {
        int i, j;
        int[] seleccion = new int[varillas.size()];
        for (i = 0; i < varillas.size(); i++) {
            seleccion[i] = 0;
        }
        i = varillas.size();
        j = c;
        while (j > 0) {
            if (i > 1 && tabla[i][j] == tabla[i - 1][j]) {
                i--;
            } else {
                seleccion[i - 1]++;
                j = j - varillas.get(i - 1).getLongitud();
            }
        }

        return seleccion;
    }

    private static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

}
