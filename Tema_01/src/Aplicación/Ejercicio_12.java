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
public class Ejercicio_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int clasificado;
        double longLanzamiento;

        System.out.print("Longitud del lanzamiento (en m): ");
        longLanzamiento = sc.nextDouble();

        longLanzamiento = longLanzamiento * 100;

        clasificado = (int) longLanzamiento;

        System.out.print("La longitud de lanzamiento correspondiente en cm es de: " + clasificado);

        sc.close();
    }
    
}