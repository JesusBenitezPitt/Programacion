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
public class Ejercicio_01 {

    /**
     * @param args the command line arguments
     */
    
    /*
     1º Calculadora con suma resta multiplicacion y division.
          Menu con las operaciones.
          Validar opciones (do-while).
          Si es valida, pedir numeros.
          Otro do-while para las operaciones.
          Mientras que el numero sea distinto a 5.
     */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op, num1, num2, resul;
        
        do{
            do{
                System.out.println("1. Suma");
                System.out.println("2. Resta");
                System.out.println("3. Multiplicacion");
                System.out.println("4. Division");
                System.out.println("5. Salir");
                System.out.print("Elige una opcion: ");
                op = sc.nextInt();
            } while(op < 1 && op > 5);
            switch(op){
                case 1 -> {
                    System.out.println("Escribe los 2 numeros: ");
                    num1 = sc.nextInt();
                    num2 = sc.nextInt();
                    resul = num1 + num2;
                    System.out.println("La solucion es: " + resul);
                }
                case 2 -> {
                    System.out.println("Escribe los 2 numeros: ");
                    num1 = sc.nextInt();
                    num2 = sc.nextInt();
                    resul = num1 - num2;
                    System.out.println("La solucion es: " + resul);
                }
                case 3 -> {
                    System.out.println("Escribe los 2 numeros: ");
                    num1 = sc.nextInt();
                    num2 = sc.nextInt();
                    resul = num1 * num2;
                    System.out.println("La solucion es: " + resul);
                }
                case 4 -> {
                    System.out.println("Escribe los 2 numeros: ");
                    num1 = sc.nextInt();
                    num2 = sc.nextInt();
                    resul = num1 / num2;
                    System.out.println("La solucion es: " + resul);
                }
            }
        }while(op != 5);
        
    }
    
}
