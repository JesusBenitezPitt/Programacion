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
        int n;
        
        System.out.print("Escribe un numero: ");
        n = sc.nextInt();
        
        divisoresPrimos(n);
    }
    
    static void divisoresPrimos(int n){
        for(int i = n; i > 1; i--){
            if(n % i == 0){
                boolean esPrimo = true;
                for(int j = 2; j < i && esPrimo; j++){
                    if((i % j) == 0){
                        esPrimo = false;
                    }
                 }
                if(esPrimo){
                    System.out.println(i);
                }
            }
        }
    }
    
}
