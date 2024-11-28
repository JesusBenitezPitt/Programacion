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
public class Ejercicio_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int segundos, minutos, min, horas, num;
        
        System.out.print("Introduce una cantidad en segundos: ");
        num = sc.nextInt();

        sc.close();
        
        segundos = num % 60;
        System.out.println("Segundos: " + segundos);
        
        min = num / 60;
        minutos = min % 60;
        System.out.println("Minutos: " + minutos);
        
        horas = min / 60;
        System.out.println("Horas: " + horas);
    }
    
}
