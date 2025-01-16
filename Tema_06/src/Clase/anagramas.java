/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clase;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class anagramas {

    /**
     * @param args the command line arguments
     */
    
    /*
    Leer 2 palabras y si no son anagramas, decir cuantos cambios se necesitan para que lo sean.
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra1, palabra2;
        System.out.print("Introduce la primera palabra: ");
        palabra1 = sc.next();
        System.out.print("Introduce la segunda palabra: ");
        palabra2 = sc.next();
        
        palabra1 = palabra1.toLowerCase();
        palabra2 = palabra2.toLowerCase();
        
        if(palabra1.length() != palabra2.length()){
            System.out.println("Para que sean anagramas primero tienen que tener la misma longitud.");
        } else if(sonAnagramas(palabra1, palabra2)){
            System.out.println("Las dos palabras son anagramas.");
        } else {
            int cambios = numeroCambios(palabra1, palabra2);
            System.out.println("Se necesitan " + cambios + " cambios para que las palabras sean anagramas.");
        }
    }

    private static boolean sonAnagramas(String palabra1, String palabra2) {
        char[] p1, p2;
        p1 = palabra1.toCharArray();
        p2 = palabra2.toCharArray();

        Arrays.sort(p1);
        Arrays.sort(p2);

        return Arrays.equals(p1, p2);
    }
    
    private static int numeroCambios(String palabra1, String palabra2){
        int[] frecuencia1 = new int[26];
        int[] frecuencia2 = new int[26];
        
        for(char c : palabra1.toCharArray()){
            frecuencia1[c - 'a']++;
        }
        
        for(char c : palabra2.toCharArray()){
            frecuencia2[c - 'a']++;
        }
        
        int cambios = 0;
        for(int i = 0; i < 26; i++){
            cambios += Math.abs(frecuencia1[i] - frecuencia2[i]);
        }
        
        return cambios;
    }
    
}
