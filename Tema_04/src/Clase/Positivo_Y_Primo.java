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

/*
 * realizar una funcion que reciba un numero entero y devuelva verdadero o falso 
 * si el numero es positivo y es primo.
*/

public class Positivo_Y_Primo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        
        System.out.print("Escribe un numero: ");
        num = sc.nextInt();
        
        System.out.println(esPositivoYPrimo(num));
        
    }

    static boolean esPositivoYPrimo(int num) {
        boolean esPositivoyPrimo = true;
        if(num > 0){
            for(int i = 2; i < num; i++){
                if(num % i == 0){
                    esPositivoyPrimo = false;
                }
            }
        } else {
            esPositivoyPrimo = false;
        }
        return esPositivoyPrimo;
    }
    
}
