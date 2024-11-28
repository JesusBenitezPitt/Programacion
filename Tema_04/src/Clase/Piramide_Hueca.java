/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clase;

import java.util.Scanner;

/**
 *
 * @author usuario
 */

/*
 * Realiza un metodo que reciba un numero de filas y dibuje la piramide hueca.
 */
public class Piramide_Hueca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas;

        System.out.print("Escribe un numero de filas: ");
        filas = sc.nextInt();

        dibujarPiramideHueca(filas);

    }

    static void dibujarPiramideHueca(int filas) {
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= filas - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1 || i == filas) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
