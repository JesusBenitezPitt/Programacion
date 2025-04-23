/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_Aplicacion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio_14 {
    
    public static void main(String[] args) {
        String archivo = "src/Ejercicios_Aplicacion/carta.txt";
        System.out.println("Tiene " + contarCaracteres(archivo) + " caracteres.");
        System.out.println("Tiene " + contarPalabras(archivo) + " palabras.");
        System.out.println("Tiene " + contarLineas(archivo) + " lineas.");
    }
    
    public static int contarCaracteres(String archivo) {
        int caracteres = 0;
        try(BufferedReader lector = new BufferedReader(new FileReader(archivo))){
            String linea = lector.readLine();
            while(linea != null){
                String sin_espacios = linea.trim().replaceAll(" ", "");
                caracteres += sin_espacios.length();
                linea = lector.readLine();
            }
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
        return caracteres;
    }
    
    public static int contarPalabras(String archivo){
        int palabras = 0;
        try(BufferedReader lector = new BufferedReader(new FileReader(archivo))){
            String linea = lector.readLine();
            while(linea != null){
                String[] p = linea.split(" ");
                palabras += p.length;
                linea = lector.readLine();
            }
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
        return palabras;
    }
    
    public static int contarLineas(String archivo){
        int lineas = 0;
        try(BufferedReader lector = new BufferedReader(new FileReader(archivo))){
            String linea = lector.readLine();
            while(linea != null){
                lineas ++;
                linea = lector.readLine();
            }
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
        return lineas;
    }
    
}
