/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aplicacion;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Introduce un numero:");
        n = sc.nextInt();

        mostrarpares(n);

    }

    static void mostrarpares(int n) {
        int j = 2;
        for (int i = 0; i < n; i++) {
            System.out.println(j);
            j += 2;
        } 
    }

}
