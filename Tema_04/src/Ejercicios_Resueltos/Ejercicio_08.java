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
public class Ejercicio_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        
        System.out.print("Escribe el primer numero: ");
        n1 = sc.nextInt();
        
        System.out.print("Escribe el segundo numero: ");
        n2 = sc.nextInt();
        
        System.out.println(calculadora(n1, n2));
        
    }
    
    static int calculadora(int n1, int n2){
        Scanner sc = new Scanner(System.in);
        int op, resul = 0;
        System.out.println("¿Que operacion quieres hacer?");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.print("Elige una opcion: ");
        op = sc.nextInt();
        
        switch(op){
            case 1 -> {
                resul = n1 + n2;
            }
            case 2 -> {
                resul = n1 - n2;
            }
            case 3 -> {
                resul = n1 * n2;
            }
            case 4 -> {
                resul = n1 / n2;
            }
        }
        return (resul);
    }
    
}
