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
public class ejercicioX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas;
        
        do{
            System.out.print("Ingresa un numero de filas: ");
            filas = sc.nextInt();
        }while(filas % 2 == 0);
        
        dibujarX(filas);
        
    }
    
    static void dibujarX(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(j == i || j == n - i - 1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
