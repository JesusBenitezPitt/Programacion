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
public class Ejercicio_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base, altura, area;
        
        System.out.print("Introduce la base del triangulo: ");
        base = sc.nextDouble();

        System.out.print("Introduce la altura del triangulo: ");
        altura = sc.nextDouble();

        sc.close();
        
        area = (base * altura) / 2;
        System.out.print("El area del triangulo es: " + area);
    }
    
}
