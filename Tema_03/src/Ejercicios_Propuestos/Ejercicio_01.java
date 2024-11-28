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
public class Ejercicio_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max, min, edad;
        
        System.out.println("Introduce una edad: ");
        edad = sc.nextInt();
        max = edad;
        min = edad;
        
        while(edad != -1){
            if (edad > max){
                max = edad;
            }
            if(edad < min){
                min = edad;
            }
            
            System.out.println("Introduce una edad: ");
            edad = sc.nextInt();
            
        }
        
        System.out.println("Edad maxima: " + max + ", Edad minima: " + min);
        
    }
    
}
