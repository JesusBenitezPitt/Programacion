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
public class Ejercicio_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero decimal: ");
        double dec = sc.nextDouble();

        sc.close();
        
        double decFinal = dec + 0.5;
        
        int numTruncado = (int) decFinal;
        
        System.out.println("El numero entero mas proximo a " + dec + " es: " + numTruncado);
    }
    
}
