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
public class Ejercicio_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        int cont = 0;
        System.out.print("Escribe una frase: ");
        frase = sc.nextLine();
        for(int i = 0; i < frase.length(); i++){
            if(Character.isSpaceChar(frase.charAt(i))){
                cont ++;
            }
        }
        System.out.println("La frase tiene " + cont + " espacios en blanco");
    }
    
}
