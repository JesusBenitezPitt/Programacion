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
        int num;
        
        do{
            System.out.print("Escribe un numero entre el 1 y el 10: ");
            num = sc.nextInt();
        } while(num < 1 && num > 10);
        
        System.out.println("Tabla de multiplicar del " + num);
        for(int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + (num*i));
        }
        
    }
    
}
