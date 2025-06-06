package Ejercicios_Aplicacion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio_16 {

    public static void main(String[] args) {
        String libro_de_firmas = "src/Ejercicios_Aplicacion/firmas.txt";
        int op = -1;
        while(op != 0){
            Scanner sc = new Scanner(System.in);
            System.out.println("1. Mostrar libro de firmas.");
            System.out.println("2. Insertar nueva firma.");
            System.out.println("0. Salir.");
            System.out.print("\nElige una opcion: ");
            op = sc.nextInt();
            switch(op){
                case 1 -> mostrarLibro(libro_de_firmas);
                case 2 -> {
                    System.out.print("Escribe tu nombre: ");
                    String nombre = sc.next();
                    insertarNombre(libro_de_firmas, nombre, sc);
                }
            }
        }
    }
    
    public static void mostrarLibro(String libro){
        try(BufferedReader lector = new BufferedReader(new FileReader(libro))){
            String linea = lector.readLine();
            System.out.println("Firmas existentes:");
            System.out.println();
            while(linea != null){
                System.out.println("- " + linea);
                linea = lector.readLine();
            }
            System.out.println();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    
    public static void insertarNombre(String libro, String nombre, Scanner scanner){
        try(BufferedReader lector = new BufferedReader(new FileReader(libro)); BufferedWriter escritor = new BufferedWriter(new FileWriter(libro, true))){
            String linea = lector.readLine();
            if(linea == null){
                escritor.write(nombre);
                escritor.newLine();
                System.out.println("Nombre agregado al libro de firmas.\n");
            }
            boolean nombreAgregado = false;
            while(linea != null && !nombreAgregado){
                if(verificarNombre(nombre, linea)){
                    System.out.println("Tu nombre ya esta en la lista.\n");
                    break;
                } else {
                    escritor.write(nombre);
                    escritor.newLine();
                    System.out.println("Nombre agregado al libro de firmas.");
                    nombreAgregado = true;
                }
                linea = lector.readLine();
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    
    public static boolean verificarNombre(String nombre, String linea){
        return linea.toLowerCase().equals(nombre.toLowerCase());
    }
    
}
