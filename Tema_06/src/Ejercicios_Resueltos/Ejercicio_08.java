/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_Resueltos;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String prefijo = "Javalin, javalon";
        String sufijo = "javalen, len, len";
        boolean idiomaJava = false;
        
        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();
        if(frase.startsWith(prefijo)){
            frase = frase.substring(prefijo.length());
            idiomaJava = true;
        } else if (frase.endsWith(sufijo)){
            frase = frase.substring(0, frase.length() - sufijo.length());
            idiomaJava = true;
        }
        
        if(idiomaJava){
            frase = frase.strip();
            System.out.println("Frase traducida: " + frase);
        } else {
            System.out.println("La frase no esta en el idioma Javalandes.");
        }
    }
    
}
