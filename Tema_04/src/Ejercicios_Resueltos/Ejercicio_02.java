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
public class Ejercicio_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        
        System.out.print("Escribe un numero: ");
        num1 = sc.nextInt();
        
        System.out.print("Escribe otro numero: ");
        num2 = sc.nextInt();
        
        NumerosComprendidos(num1, num2);
        
    }
    
    public static void NumerosComprendidos(int n1, int n2){
        for(int i = n1+1; i < n2; i++){
            System.out.println(i);
        }
    }
    
}
