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
public class Ejercicio_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, primos = 0;
        boolean esPrimo;
        
        System.out.print("Escribe un numero: ");
        num = sc.nextInt();
        
        for(int i = 1; i <= num; i++){
            esPrimo = true;
            for(int j = 2; j < i && esPrimo; j++){
                if((i % j) == 0){
                    esPrimo = false;
                }
            }
            if(esPrimo){
                primos++;
            }
        }

        System.out.println("Hay " + primos + " numeros primos");
        
    }
    
}
