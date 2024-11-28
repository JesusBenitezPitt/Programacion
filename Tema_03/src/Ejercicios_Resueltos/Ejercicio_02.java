/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_Resueltos;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  edad, mayorEdad = 0, media, total = 0, cont = 0;
        
        System.out.print("Introduce una edad: ");
        edad = sc.nextInt();
        
        while(edad >= 0){
            total += edad;
            cont++;
            if(edad >= 18){
                mayorEdad++;
            }
            
            System.out.print("Introduce una edad: ");
            edad = sc.nextInt();
        }
        
        media = total / cont;
        
        System.out.println("Hay " + mayorEdad + " personas mayores de edad.");
        System.out.println("Hay una media de " + media + " años.");
        System.out.println("Hay " + total + " años en total.");
        
        
    }
    
}
