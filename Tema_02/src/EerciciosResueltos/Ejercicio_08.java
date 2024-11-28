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
public class Ejercicio_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, num;
        double s1, s2;
        
        System.out.print("Escribe el valor de a: ");
        a = sc.nextInt();
        
        System.out.print("Escribe el valor de b: ");
        b = sc.nextInt();
        
        System.out.print("Escribe el valor de c: ");
        c = sc.nextInt();
        
        num = (b*b)-(4*a*c);
        
        if (num < 0){
            System.out.println("No hay soluciones");
        } else {
            if (a == 0){
                System.out.println("No es una ecuacion de segundo grado");
            } else {
                s1 = (-b + Math.sqrt((b*b)-(4*a*c)/(2*a)));
                s2 = (-b - Math.sqrt((b*b)-(4*a*c)/(2*a)));
                
                System.out.println("Solucion 1: " + s1);
                System.out.println("Solucion 2: " + s2);
                
            }
        }
        
    }
    
}
