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
public class Ejercicio_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.print("Introduce un numero: ");
        n = sc.nextInt();
        
        System.out.println(esPrimo(n));
        
    }
    
    static boolean esPrimo(int n){
        boolean esPrimo = true;
        for(int i = 2; i < n && esPrimo; i++){
            if((n % i) == 0){
                esPrimo = false;
            }
         }
        return esPrimo;
    }
    
}
