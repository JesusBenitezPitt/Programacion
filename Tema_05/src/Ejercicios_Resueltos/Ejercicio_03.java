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
public class Ejercicio_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeros;
        int[] num;
        
        System.out.print("Cuantos numeros quieres introducir: ");
        numeros = sc.nextInt();
        num = new int[numeros];
        
        for(int i = 0; i < num.length; i++){
            System.out.print("Introduce un numero entero: ");
            num[i] = sc.nextInt();
        }
        
        for(int i = num.length - 1; i >= 0; i--){
            System.out.println(num[i]);
        }
        
    }
    
}
