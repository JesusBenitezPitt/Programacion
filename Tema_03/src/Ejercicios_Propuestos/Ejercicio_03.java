/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_Propuestos;

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
        int num, division, guarismo;

        do {
            System.out.print("Escribe un numero positivo: ");
            num = sc.nextInt();
        } while (num < 0);

        division = num / 10;
        guarismo = num % 10;
        System.out.print(guarismo);
        
        while(division != 0){
            guarismo = division % 10;
            division = division / 10;
            System.out.print(" " + guarismo);
        }
        
    }

}
