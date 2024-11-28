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
public class Ejercicio_04 {

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
        
        System.out.println("El numero maximo es: " + maximo(num));
        
    }
    
    static int maximo(int t[]){
        int max = t[0];
        for(int i = 0; i < t.length; i++){
            if(t[i] > max){
                max = t[i];
            }
        }
        return max;
    }
    
}

