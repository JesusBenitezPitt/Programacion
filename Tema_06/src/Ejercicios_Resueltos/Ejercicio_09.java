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
public class Ejercicio_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una palabra: ");
        String palabra = sc.next();
        String frase = "";
        
        while(!palabra.equals("fin")){
            if(frase.isEmpty()){
                char[] letras = palabra.toCharArray();
                if(Character.isLowerCase(letras[0])){
                    letras[0] = Character.toUpperCase(letras[0]);
                }
                frase += String.valueOf(letras);
                System.out.println(frase);
            } else {
                frase += " " + palabra;
                System.out.println(frase);
            }
            
            System.out.print("Introduce una palabra: ");
            palabra = sc.next();
        }
        
        System.out.println(frase);
        
    }
    
}
