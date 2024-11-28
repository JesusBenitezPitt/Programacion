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
public class Ejercicio_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radio;
        
        System.out.println("Introduce el radio: ");
        radio = sc.nextDouble();
        
        volumenSuperficieEsfera(radio);
        
    }

    static void volumenSuperficieEsfera(double radio) {
        double superficie = 4*Math.PI*Math.pow(radio, 2);
        double volumen = ((4*Math.PI)/3)*Math.pow(radio, 3);
        
        System.out.println("La superficie de la esfera con radio de " + radio + " es de: " + superficie);
        System.out.println("El volumen de la esfera con radio de " + radio + " es de: " + volumen);
        
    }
    
    
    
}
