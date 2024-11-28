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
public class Ejercicio_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int notas, aprobados = 0, condicionados = 0, suspensos = 0;
        
        for(int i = 1; i <= 6; i++){
            System.out.print("Escribe una nota: ");
            notas = sc.nextInt();
            
            if(notas > 5){
                aprobados++;
            } else if(notas == 4){
                condicionados++;
            } else if(notas < 4){
                suspensos++;
            }
            
        }
        
        System.out.println("Hay " + aprobados + " aprobados, " + condicionados + " condicionados y " + suspensos + " suspensos");
        
    }
    
}
