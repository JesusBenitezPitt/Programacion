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
public class Ejercicio_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, x;
        double y;
        
        System.out.print("Introduce el numero A: ");
        a = sc.nextInt();
        
        System.out.print("Introduce el numero B: ");
        b = sc.nextInt();

        System.out.print("Introduce el numero C: ");
        c = sc.nextInt();

        System.out.print("Introduce el numero X: ");
        x = sc.nextInt();

        sc.close();
        
        y = a*(x^2) + b*x + c;
        
        System.out.println("El valor correspondiente de Y es: " + y);
    }
    
}
