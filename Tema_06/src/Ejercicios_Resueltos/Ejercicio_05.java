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
public class Ejercicio_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase, invertida;
        System.out.print("Introduce una frase: ");
        frase = sc.nextLine();
        invertida = InvertirFrase(frase);
        System.out.println("La frase original es: " + frase);
        System.out.println("La frase invertida es: " + invertida);
    }
    
    public static String InvertirFrase(String original){
        String nueva_frase = "";
        for(int i = 0; i < original.length(); i++){
            nueva_frase = original.charAt(i) + nueva_frase;
        }
        return nueva_frase;
    }
    
}
