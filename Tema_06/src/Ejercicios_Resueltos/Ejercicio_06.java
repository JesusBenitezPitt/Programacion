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
public class Ejercicio_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, sin_vocales = " ";
        char c;
        System.out.print("Introduce un nombre completo: ");
        nombre = sc.nextLine();
        for(int i = 0; i < nombre.length(); i++){
            c = nombre.charAt(i);
            if(!esVocal(c)){
                sin_vocales += c;
            }
        }
        System.out.println("Este es el nombre completo sin vocales: " + sin_vocales);
    }
    
    public static boolean esVocal(char c){
        String vocales = "aeiou";
        boolean result;
        c = Character.toLowerCase(c);
        if(vocales.indexOf(c) == -1){
            result = false;
        } else {
            result = true;
        }
        return result;
    }
    
}
