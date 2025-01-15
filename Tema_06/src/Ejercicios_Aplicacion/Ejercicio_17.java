/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_Aplicacion;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra;
        System.out.print("Introduce una palabra: ");
        palabra = sc.next();
        int n;
        System.out.print("Introduce el valor de n: ");
        n = sc.nextInt();
        
        for(int i = 0; i < palabra.length(); i+= n){
            if( i + n < palabra.length()){
                System.out.println(palabra.substring(i, i + n));
            } else {
                System.out.println(palabra.substring(i));
            }
        }
        
    }
    
}
