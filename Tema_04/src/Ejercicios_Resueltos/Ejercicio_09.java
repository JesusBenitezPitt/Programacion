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
public class Ejercicio_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        
        System.out.print("Introduce el primer numero: ");
        num1 = sc.nextInt();
        
        System.out.print("Introduce el segundo numero: ");
        num2 = sc.nextInt();
        
        System.out.print("Introduce el segundo numero: ");
        num3 = sc.nextInt();
        
        System.out.println(maximo(num1, num2, num3));
        
    }
    
    static int maximo(int n1, int n2){
        int max = 0;
        if(n1 > n2){
            max = n1;
        } else if(n1 < n2){
            max = n2;
        }
        
        return (max);
    }
    
    static int maximo(int n1, int n2, int n3){
        int max = maximo(n1, n2);
        
        return (maximo(max, n3));
    }
    
}