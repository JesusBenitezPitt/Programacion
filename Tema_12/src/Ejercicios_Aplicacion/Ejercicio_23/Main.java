/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_Aplicacion.Ejercicio_23;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String palabra;
        Set<String> palabras = new TreeSet<>();
        do{
            System.out.print("Introduce una palabra ('fin' para terminar): ");
            palabra = new Scanner(System.in).next();
            if(!palabra.toLowerCase().equals("fin")){
                palabras.add(palabra);
            }
        }while(!palabra.toLowerCase().equals("fin"));
        System.out.println(palabras);
    }
    
}
