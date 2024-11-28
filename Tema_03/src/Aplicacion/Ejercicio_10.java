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
public class Ejercicio_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dinero, suma = 0;
        
        do{
            System.out.println("¿Cuanto dinero tienes?");
            dinero = sc.nextDouble();
            suma +=dinero;
        }while(dinero != 0);
        
        System.out.println("El dinero total es: " + suma + "€");
        
    }
    
}
