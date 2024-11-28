/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clase;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class piramide_hueca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        
        System.out.print("Escribe un numero: ");
        num = sc.nextInt();
        
        for (int j = 1; j <= (num*2)+2; j++) {
            System.out.print("*");
        }
        System.out.println(" ");
        for(int i = 1; i <= num; i++){
               for (int j = num; j >= i; j--) {
                    System.out.print("*");
                }
               for(int k = 1; k <= i; k++){
                       System.out.print("  ");
               }
               for (int j = num; j >= i ; j--) {
                        System.out.print("*");
               }
               System.out.println(" ");
         }
        for (int j = 1; j <= (num*2)+2; j++) {
                        System.out.print("*");
        }
    }
    
}
