/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aplicación;

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
        int num1, num2;
        boolean comprobarIgual;
        
        System.out.print("Escribe el primer numero: ");
        num1 = sc.nextInt();
        
        System.out.print("Escribe el segundo numero: ");
        num2 = sc.nextInt();

        sc.close();
        
        comprobarIgual = num1 == num2;
        
        System.out.println("Los numeros son iguales: " + comprobarIgual);
    }
    
}
