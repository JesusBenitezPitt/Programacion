package Ejercicios_Resueltos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio_07 {
    public static void main(String[] args) {
        System.out.println("Nombre del fichero: ");
        String ficheroOriginal = new Scanner(System.in).nextLine();
        String ficheroCopia = "copia_de_" + ficheroOriginal;

        try (BufferedReader lector = new BufferedReader(new FileReader(ficheroOriginal));
             BufferedWriter escritor = new BufferedWriter(new FileWriter(ficheroCopia))) {
            int caracter = lector.read();
            while (caracter != -1) {
                escritor.write(caracter);
                caracter = lector.read();
            }
        } catch (IOException excepcion) {
            System.out.println(excepcion.getMessage());
        }
    }
}
