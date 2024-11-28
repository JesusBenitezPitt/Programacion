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
public class EJ3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int altura;

        System.out.print("Ingrese la altura del reloj de arena (número impar y mayor o igual a 3): ");
        altura = scanner.nextInt();

        // Verificar que la altura sea un número impar y mayor o igual a 3
        if (altura < 3 || altura % 2 == 0) {
            System.out.println("Error: La altura debe ser un número impar mayor o igual a 3.");
        } else {
            // Pintar el reloj de arena
            pintarRelojDeArena(altura);
        }

        scanner.close();
    }

    public static void pintarRelojDeArena(int altura) {
        int ancho = altura; // Ancho igual a la altura para que sea simétrico

        // Parte superior del reloj de arena
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < ancho - 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Parte inferior del reloj de arena (sin líneas vacías)
        for (int i = altura - 2; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < ancho - 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}