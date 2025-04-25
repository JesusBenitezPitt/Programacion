package Ejercicios_Ampliacion.Ejercicio_28;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio_28 {

    public static void main(String[] args) {
        String archivo, cadena;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ruta del archivo: ");
        archivo = sc.next();
        System.out.println();
        System.out.print("Cadena que quieres buscar: ");
        cadena = sc.next();
        buscarCadena(archivo, cadena);
    }

    private static void buscarCadena(String archivo, String cadena) {
        try(BufferedReader lector = new BufferedReader(new FileReader(archivo))){
            String linea = lector.readLine();
            boolean cadenaEncontrada = false;
            int num_linea = 0;
            while(linea != null && !cadenaEncontrada){
                num_linea++;
                if(linea.contains(cadena)){
                    System.out.println("Cadena " + cadena + " encontrada en la linea " + num_linea);
                    cadenaEncontrada = true;
                }
            }
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    
}
