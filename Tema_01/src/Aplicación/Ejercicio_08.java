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
public class Ejercicio_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h, a, c, total;
        int patasH, patasA, patasC;
        
        System.out.print("Numero de hormigas capturadas: ");
        h = sc.nextInt();
        patasH = h * 6;
        
        System.out.print("Numero de arañas capturadas: ");
        a = sc.nextInt();
        patasA = a * 6;
        
        System.out.print("Numero de cochinillas capturadas: ");
        c = sc.nextInt();
        patasC = c * 6;

        sc.close();
        
        total = patasH + patasA + patasC;
        System.out.println("El numero de patas total es de: " + total);

        
    }
    
}
