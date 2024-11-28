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
        int num;
        
        System.out.print("Escribe un numero: ");
        num = sc.nextInt();
        
        for(int i = 1; i <= num; i++){
               for (int j = num; j > i; j--) {
                    System.out.print(" ");
                }
               for(int k = 1; k <= i; k++){
                       System.out.print("* ");
               }
               System.out.println(" ");
         }
    }
    
}
