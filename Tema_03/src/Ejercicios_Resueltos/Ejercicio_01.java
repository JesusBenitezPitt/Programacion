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
public class Ejercicio_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Introduce un numero: ");
        num = sc.nextInt();

        while (num != 0) {
            if ((num % 2) == 0) {
                System.out.println("Es par.");
            } else {
                System.out.println("No es par.");
            }
            if (num > 0) {
                System.out.println("Es positivo.");
            } else {
                System.out.println("Es negativo.");
            }
            System.out.println("Su cuadrado es: " + (Math.pow(num, 2)));

            System.out.print("Introduce otro numero: ");
            num = sc.nextInt();
        }

    }

}
