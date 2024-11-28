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
public class Ejercicio_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1, x2, y1, y2;
        
        System.out.print("Introduce el punto x1: ");
        x1 = sc.nextDouble();
        System.out.print("Introduce el punto y1: ");
        y1 = sc.nextDouble();
        System.out.print("Introduce el punto x2: ");
        x2 = sc.nextDouble();
        System.out.print("Introduce el punto y2: ");
        y2 = sc.nextDouble();
        
        
        System.out.println(distancia(x1, y1, x2, y2));
    }
    
    static double distancia(double x1, double y1, double x2, double y2){
        double distancia = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        return (distancia);
    }
    
}
