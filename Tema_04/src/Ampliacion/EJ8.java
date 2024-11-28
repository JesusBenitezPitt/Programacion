/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ampliacion;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EJ8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la altura del rombo (número impar): ");
        int n = scanner.nextInt();

        // Verificar que el número es impar
        if (n % 2 == 0) {
            System.out.println("Por favor, introduce un número impar.");
            return;
        }

        int espacios = n / 2;
        int mitad = n / 2 + 1;

        // Parte superior del rombo
        for (int i = 1; i <= mitad; i++) {
            for (int j = 1; j <= espacios; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            if (i > 1) {
                for (int j = 1; j <= (2 * (i - 1) - 1); j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
            espacios--;
        }

        // Parte inferior del rombo
        espacios = 1;
        for (int i = 1; i < mitad; i++) {
            for (int j = 1; j <= espacios; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            if (mitad - i > 1) {
                for (int j = 1; j <= (2 * (mitad - i - 1) - 1); j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
            espacios++;
        }

        scanner.close();
    }
    
}
