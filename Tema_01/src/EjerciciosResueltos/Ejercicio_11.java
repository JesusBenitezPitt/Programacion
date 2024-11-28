/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosResueltos;

import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Ejercicio_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final double PRECIO_MANZANAS = 2.35;
        final double PRECIO_PERAS = 1.95;
        
        System.out.print("Ventas del primer semestre de manzanas: ");
        int manzanas1Semestre = sc.nextInt();
        
        System.out.print("Ventas del segundo semestre de manzanas: ");
        int manzanas2Semestre = sc.nextInt();
        
        System.out.print("Ventas del primer semestre de peras: ");
        int peras1Semestre = sc.nextInt();
        
        System.out.print("Ventas del segundo semestre de peras: ");
        int peras2Semestre = sc.nextInt();

        sc.close();
        
        double totalManzanas = (manzanas1Semestre + manzanas2Semestre) * PRECIO_MANZANAS;
        
        double totalPeras = (peras1Semestre + peras2Semestre) * PRECIO_PERAS;
        
        System.out.println("El total de beneficio anual de la venta de manzana es de: " + totalManzanas + "€");
        System.out.println("El total de beneficio anual de la venta de peras es de: " + totalPeras + "€");
    }
    
}
