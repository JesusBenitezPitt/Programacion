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
public class Ejercicio_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.print("Escribe un numero: ");
        n = sc.nextInt();
        
        System.out.println(divisoresPrimos(n));
        
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
    
    static int divisoresPrimos(int n){
        int cont = 0;
        for(int i = n; i >= 1; i--){
            if(n % i == 0){
                if(esPrimo(i)){
                    cont++;
                }
            }
        }
        return (cont);
    }
    
}
