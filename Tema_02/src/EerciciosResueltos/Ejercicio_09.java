/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EerciciosResueltos;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        
        System.out.print("Introduce un numero entre 0 y 99.9999: ");
        num = sc.nextInt();
        
        if (num < 10){
            System.out.println("Tiene 1 cifra");
        } else if (num < 100){
            System.out.println("Tiene 2 cifras");
        } else if (num < 1000){
            System.out.println("Tiene 3 cifras");
        } else if (num < 10000){
            System.out.println("Tiene 4 cifras");
        } else if (num < 100000){
            System.out.println("Tiene 5 cifras");
        }
        
    }
    
}
