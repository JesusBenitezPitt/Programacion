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
public class Ejercicio_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, absoluto;
        
        System.out.print("Introduce un numero: ");
        num = sc.nextInt();
        
        absoluto = num > 0 ? num : Math.abs(num);
        
        System.out.println("El valor absoluto de " + num + " es: " + absoluto);
        
    }
    
}
