package proyecto2fada;

import java.util.ArrayList;
import static proyecto2fada.Clases.LeerArchivoPlano.varillasArchivo;
import proyecto2fada.Clases.Varilla;

public class metodoSolucion {

    public static ArrayList<ArrayList> seleccionadaV = new ArrayList<>();
    public static ArrayList<Varilla> selectVarillasM = new ArrayList<>();

    public static String procesar(int longitudVarilla) {
        seleccionadaV.clear();
        selectVarillasM.clear();
        String resultado="";
        ArrayList<Varilla> vectorAux = new ArrayList<>();
        vectorAux.addAll(varillasArchivo);
        guardarPosibilidades(vectorAux, longitudVarilla);

        resultado+="maxima combinaciones: " + nmaximoCombinaciones()+ "\n";
        resultado+="minimo varillas: " + nminimovarillas()+ "\n";
        resultado+="valor minimo: " + pmenorVarillas()+ "\n";
        resultado+="Combinaciones posibles: " + ncombinaciones()+ "\n";
        return resultado;
    }

    private static int guardarPosibilidades(ArrayList<Varilla> vectorV, int lv) {
        ArrayList<Varilla> vectorAux = new ArrayList<>();
        vectorAux.clear();
        vectorAux.addAll(vectorV);
        int respuesta = 0;
        while (!vectorV.isEmpty()) {
            funcionAux(vectorAux, lv);
            vectorV.remove(vectorV.size() - 1);
            vectorAux.clear();
            vectorAux.addAll(vectorV);
        }
        return respuesta;
    }

    private static boolean funcionAux(ArrayList<Varilla> vectorV, int longitudVarilla) {
        boolean respuesta = false;
        int contador = vectorV.size() - 1;

        if ((longitudVarilla - vectorV.get(contador).getLongitud()) >= 0) {
            while (longitudVarilla > 0) {
                if ((contador == 0) && ((longitudVarilla - vectorV.get(contador).getLongitud()) != 0)) {
                    selectVarillasM.clear();
                    longitudVarilla = -1;
                } else {
                    int restalv = longitudVarilla - vectorV.get(contador).getLongitud();
                    if (restalv >= 0) {
                        longitudVarilla = restalv;
                        selectVarillasM.add(vectorV.get(contador));
                        if (contador != vectorV.size() - 1) {
                            vectorV.remove(contador);
                        }
                        contador--;
                    } else {
                        contador--;
                    }
                }
            }
        }
        if (selectVarillasM.size() > 0) {
            seleccionadaV.add((ArrayList<Varilla>) selectVarillasM.clone());
            selectVarillasM.clear();
            respuesta = true;
        } else {
            selectVarillasM.clear();
        }
        return respuesta;
    }

    public static int nmaximoCombinaciones() {
        return seleccionadaV.size();
    }

    public static int nminimovarillas() {
        int respuesta1 = 0;
        if (seleccionadaV.size() > 0) {
            selectVarillasM = (ArrayList<Varilla>) seleccionadaV.get(0);
            respuesta1 = selectVarillasM.size();
            int respuesta2 = 0;
            for (int i = 1; i < seleccionadaV.size(); i++) {
                selectVarillasM = (ArrayList<Varilla>) seleccionadaV.get(i);
                respuesta2 = selectVarillasM.size();
                if (respuesta1 > respuesta2) {
                    respuesta1 = respuesta2;
                }
            }
        }
        return respuesta1;
    }
    
    
    public static int pmenorVarillas() {
        int respuesta1 = 10000;
        int respuesta2 = 0;
        for (int i = 0; i < seleccionadaV.size(); i++) {
            selectVarillasM = (ArrayList<Varilla>) seleccionadaV.get(i);
            for (int j = 0; j < selectVarillasM.size(); j++) {
                respuesta2 += selectVarillasM.get(j).getValor();
            }
            if (respuesta1 > respuesta2) {
                respuesta1 = respuesta2;
                respuesta2=0;
            }
        }
        if (respuesta1 == 10000) {
            respuesta1 = 0;
        }
        return respuesta1;
    }

    public static String ncombinaciones() {
        String resultado = "";
        int Valor = 0;
        if (seleccionadaV.size() > 0) {
            for (int i = 0; i < seleccionadaV.size(); i++) {
                String combi = "\nLongitud: ";
                selectVarillasM = (ArrayList<Varilla>) seleccionadaV.get(i);
                for (int j = 0; j < selectVarillasM.size(); j++) {
                    combi += selectVarillasM.get(j).getLongitud() + " ";

                }
                for (int j = 0; j < selectVarillasM.size(); j++) {

                    Valor += (selectVarillasM.get(j).getValor());
                }
                combi += " Valor: " + String.valueOf(Valor);
                combi += "";
                resultado += combi;
                combi = "";
                Valor = 0;
            }
        }else{
        resultado+="\nNO SE PUEDE OBTENER LA LONGITUD DE LA VARILLA";
        }
        return resultado;
    }

}
