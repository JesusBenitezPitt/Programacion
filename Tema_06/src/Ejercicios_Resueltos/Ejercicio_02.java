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
public class Ejercicio_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Frase 1: ");
        String frase1 = sc.nextLine();
        System.out.print("Frase 2: ");
        String frase2 = sc.nextLine();
        
        if(frase1.length() < frase2.length()){
            System.out.println("La frase 1 es mas corta que la frase 2");
        } else if(frase1.length() > frase2.length()){
            System.out.println("La frase 2 es mas corta que la frase 1");
        } else if(frase1.length() == frase2.length()){
            System.out.println("Las 2 frases son del mismo tamaño");
        }
    }
    
}
