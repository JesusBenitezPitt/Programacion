package Ejercicios_Propuestos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio_04 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        String nombreArchivo = "src/Ejercicios_Propuestos/salida.txt";

        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreArchivo))) {
            System.out.println("Introduce líneas de texto. Escribe 'fin' para terminar.");
            while (true) {
                String linea = escaner.nextLine();
                if (linea.equalsIgnoreCase("fin")) {
                    break;
                }
                escritor.write(linea);
                escritor.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            escaner.close();
        }

        System.out.println("Texto guardado en el archivo: " + nombreArchivo);
    }
}
