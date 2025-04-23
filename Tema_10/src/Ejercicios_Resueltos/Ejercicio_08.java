package Ejercicios_Resueltos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio_08 {
    public static void main(String[] args) {
        BufferedWriter escritor = null;
        try {
            escritor = new BufferedWriter(new FileWriter("quijote.txt"));
            String cadena = "En un lugar de la mancha,";
            for (int i = 0; i < cadena.length(); i++) {
                escritor.write(cadena.charAt(i));
            }
            cadena = "de cuyo nombre no quiero acordarme.";
            escritor.newLine();
            escritor.write(cadena);
        } catch (IOException excepcion) {
            System.out.println(excepcion.getMessage());
        } finally {
            if (escritor != null) {
                try {
                    escritor.close();
                } catch (IOException excepcion) {
                    System.out.println(excepcion);
                }
            }
        }
    }
}
