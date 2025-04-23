package Ejercicios_Aplicacion;

import java.io.*;
import java.util.*;

public class Ejercicio_13 {
    public static void main(String[] args) {
        String archivo1 = "src/Ejercicios_Aplicacion/lista1.txt";
        String archivo2 = "src/Ejercicios_Aplicacion/lista2.txt";
        String archivoSalida = "src/Ejercicios_Aplicacion/lista_ordenada.txt";

        try {
            List<Integer> numeros = new ArrayList<>();
            leerNumerosDesdeArchivo(archivo1, numeros);
            leerNumerosDesdeArchivo(archivo2, numeros);

            Collections.sort(numeros);

            escribirNumerosEnArchivo(archivoSalida, numeros);
            System.out.println("Listas combinadas y ordenadas guardadas en: " + archivoSalida);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void leerNumerosDesdeArchivo(String nombreArchivo, List<Integer> numeros) throws IOException {
        try (BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                numeros.add(Integer.parseInt(linea));
            }
        }
    }

    private static void escribirNumerosEnArchivo(String nombreArchivo, List<Integer> numeros) throws IOException {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (int numero : numeros) {
                escritor.write(Integer.toString(numero));
                escritor.newLine();
            }
        }
    }
}
