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
public class Ejercicio_09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grado;
        double radian;
        
        System.out.print("Introduce un numero para el grado: ");
        grado = sc.nextInt();
        if (!(grado <= 0) && !(grado >= 360)){
            radian = grado * (Math.PI/180);
            
            System.out.println("El radian correspondiente a " + grado + " es: " + radian);
        } else {
        
            int gradoEquivalente = grado % 360;
            radian = gradoEquivalente * (Math.PI/180);
            
            System.out.println("El radian correspondiente a " + gradoEquivalente + " es: " + radian);
        }
    }
    
}
