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
public class Ejercicio_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b, a;
        double area;
        
        System.out.print("Introduce la base: ");
        b = sc.nextInt();
        
        System.out.print("Introduce la altura: ");
        a = sc.nextInt();
        
        if (b < 0 || a < 0){
            System.out.println("Los numeros no pueden ser negativos."); 
        } else {
            area = (b*a)/2.0;
            
            System.out.println("El area del triangulo es: " + area);
        }
        
    }
    
}
