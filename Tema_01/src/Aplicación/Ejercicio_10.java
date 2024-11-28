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
public class Ejercicio_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        double raiz;

        System.out.print("Escribe un numero entero: ");
        num = sc.nextInt();

        sc.close();
        
        raiz = Math.sqrt(num);

        System.out.println("La raiz cuadrada de " + num + " es: " + raiz);
    }
    
}