package proyecto2fada.Clases;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LeerArchivoPlano {
     public static ArrayList<Varilla> varillasArchivo = new ArrayList<>();
    public boolean leerArchivo() throws FileNotFoundException, IOException {
        varillasArchivo.clear();
        boolean respuesta = false;
        Varilla va;
        String ruta = "D:\\Programacion\\Java\\archivo.txt";
        String cadena;
        FileReader f = new FileReader(ruta);
        try (BufferedReader b = new BufferedReader(f)) {
            while ((cadena = b.readLine()) != null) {
                String[] parts = cadena.split(",");
                va=  new Varilla(Integer.valueOf(parts[0]), Integer.valueOf(parts[1]));
                varillasArchivo.add(va);
            }
        }
        if (varillasArchivo.size() > 0) {
            respuesta = true;
        }
        return respuesta;
    }
}
