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
public class Ejercicio_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        
        System.out.print("Introduce un numero: ");
        num = sc.nextInt();
        
        PrintEco(num);
        
    }
    
    public static void PrintEco(int n){
        for(int i = 1; i <= n; i++){
            System.out.println("Eco...");
        }
    }
    
}