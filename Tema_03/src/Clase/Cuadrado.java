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
public class Cuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas;
        
        System.out.print("Inserta numero de filas: ");
        filas = sc.nextInt();
        
        for(int i = 1; i <= filas; i++){
            for(int j = 1; j <= filas; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
        
    }
    
}
