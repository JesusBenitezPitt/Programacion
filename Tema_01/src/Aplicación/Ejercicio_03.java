/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aplicación;

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
        int num, multiplo, op, mul;
        
        System.out.print("Escribe un numero: ");
        num = sc.nextInt();
        
        System.out.print("Escribe el numero para calcular el multiplo: ");
        mul = sc.nextInt();

        sc.close();
        
        op = num % mul;
        
        multiplo = mul - op;
        
        System.out.println("A " + num + " hay que sumarle " + multiplo + " para que sea multiplo de " + mul);
    }
    
}