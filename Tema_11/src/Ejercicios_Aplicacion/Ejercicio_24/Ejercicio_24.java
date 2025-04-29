package Ejercicios_Aplicacion.Ejercicio_24;
import java.io.*;
import java.util.List;
import java.util.Collections;

public class Ejercicio_24 {

        public static void main(String[] args) {
            fusionar("src/Ejercicios_Aplicacion/Ejercicio_24/ficheroBase.dat", "src/Ejercicios_Aplicacion/Ejercicio_24/ficheroNuevo.dat");
        }
        
    public static void fusionar(String ficheroBase, String ficheroNuevo) {
        List<String> listaBase = leerFichero(ficheroBase);
        List<String> listaNueva = leerFichero(ficheroNuevo);

        listaBase.addAll(listaNueva);
        Collections.sort(listaBase);
        guardarFichero(ficheroBase, listaBase);
    }

    private static List<String> leerFichero(String ruta) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta))) {
            return (List<String>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return null;
        }
    }

    private static void guardarFichero(String archivo, List<String> lista) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}