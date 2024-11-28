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
public class Ejercicio_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        double fact = 1;
        
        System.out.print("Escribe un numero: ");
        num = sc.nextInt();
        
        for(int cont = num; cont > 0; cont--){
            fact = fact * cont;
        }
        
        System.out.println("El factorial de " + num + " es: " + fact);
        
    }
    
}
