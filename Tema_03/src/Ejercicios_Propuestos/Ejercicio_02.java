/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_Propuestos;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        
        System.out.print("Escribe un numero: ");
        num = sc.nextInt();
        
        for(int i = 0; i < num; i++){
            System.out.println("Eco...");
        }
        
    }
    
}
