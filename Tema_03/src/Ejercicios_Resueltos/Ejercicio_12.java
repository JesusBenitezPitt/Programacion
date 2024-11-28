/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_Resueltos;

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
        int notas;
        boolean suspensos = false;
        
        
        for(int i = 1; i <= 5; i++){
            System.out.print("Escribe una nota: ");
            notas = sc.nextInt();
            
            if(notas < 5){
                suspensos = true;
            }
            
        }
        
        if(suspensos){
            System.out.println("Hay al menos 1 suspenso.");
        } else {
            System.out.println("No hay suspensos.");
        }
        
    }
    
}
