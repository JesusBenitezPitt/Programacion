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
public class Ejercicio_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, aprox = 0, resto;
        boolean raiz = false;
        
        System.out.print("Introduce un numero: ");
        num = sc.nextInt();
        
        for(int i = 0; aprox <= num && raiz == false; i++){
            aprox = (int) Math.pow(i, 2);
            if(aprox == num){
                System.out.println("La raiz cuadrada de " + num + " es: " + i);
                raiz = true;
            } else if (aprox > num){
                aprox = (int) Math.pow(i-1, 2);
                resto = num - aprox;
                System.out.println("La raiz cuadrada aproximada de " + num + " es: " + resto);
                raiz = true;
            }
        }
        
        
        
    }
    
}
