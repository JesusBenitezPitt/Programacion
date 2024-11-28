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
public class Comprobar_Par {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Escribe un numero: ");
        num = sc.nextInt();

        System.out.println(esPar(num));

    }

    static boolean esPar(int n) {
        boolean par;
        if (n % 2 == 0) {
            par = true;
        } else {
            par = false;
        }
        return par;
    }

}
