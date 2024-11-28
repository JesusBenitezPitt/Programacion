/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ampliacion;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EJ5 {

    /**
     * Escribe un programa que pida un número entero positivo por teclado y que muestre a continuación los 5 números consecutivos a 
     * partir del número introducido. 
     * Al lado de cada número se debe indicar si se trata de un primo o no.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        
        do{
            System.out.print("Introduce un numero positivo: ");
            num = sc.nextInt();
        }while(num < 0);
        
        numerosPrimos(num);
        
    }
    
    static void numerosPrimos(int n){
        boolean esPrimo = true;
        for(int i = n; i <= n+5; i++){
            esPrimo = true;
            for(int j = i-1; j > 1 && esPrimo; j--){
                if(i%j == 0){
                    esPrimo = false;
                }
            }
            if(esPrimo){
                    System.out.println(i + " es primo");
                } else {
                    System.out.println(i + " no es primo");
                }
        }
    }
    
}
