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
public class Ejercicio_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        System.out.print("Introduce una frase: ");
        frase = sc.nextLine();
        frase = frase.toLowerCase();
        
        if(esPalindroma(frase)){
            System.out.println("La frase es polindroma.");
        } else {
            System.out.println("La frase no es polindroma.");
        }
    }

    private static boolean esPalindroma(String frase) {
        String[] frase_dividida = frase.split(" ");
        frase = "";
        for(int i = 0; i < frase_dividida.length; i ++){
            frase += frase_dividida[i];
        }
        
        String frase_al_reves = "";
        for (int i = frase.length() - 1; i >= 0; i--) {
	frase_al_reves = frase_al_reves + frase.charAt(i);
        }
        
        if(frase.equals(frase_al_reves)){
            return true;
        } else {
            return false;
        }
    }
    
}
