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
public class Ejercicio_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mm, cm, m, mmtocm, mtocm, totalMedidas;
        
        System.out.print("Introduce una medida en milimetros: ");
        mm = sc.nextDouble();

        System.out.print("Introduce una medida en centimetros: ");
        cm = sc.nextDouble();

        System.out.print("Introduce una medida en metros: ");
        m = sc.nextDouble();

        sc.close();
        
        mmtocm = mm / 10;
        mtocm = m * 100;
        
        totalMedidas = mmtocm + cm + mtocm;
        
        System.out.print("El total de las medidas en cenimetros es: " + totalMedidas + "cm");
        
    }
    
}
