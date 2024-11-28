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
public class EJ3 {

    /**
     * Realiza un programa que pinte un reloj de arena relleno hecho de
     * asteriscos. El programa debe pedir la altura. Se debe comprobar que la
     * altura sea un número impar mayor o igual a 3, en caso contrario se debe
     * mostrar un mensaje de error.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura;

        do {
            System.out.print("Introduce la altura del reloj (Impar >= 3): ");
            altura = sc.nextInt();
            if(altura % 2 == 0){
                System.out.println("Introduce un numero valido");
            }
        } while (altura % 2 == 0 || altura < 3);

        dibujarReloj(altura);

    }

    static void dibujarReloj(int a) {
        for (int i = 1; i <= (a+4)/2; i+=2) {
            for (int j = 1; j <= i; j += 2) {
                System.out.print(" ");
            }
            for (int k = i; k <= a; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= a + 2 / 2; i += 2) {
            for (int j = a; j >= i; j -= 2) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
