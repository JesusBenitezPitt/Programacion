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
public class Ejercicio_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, multiplo, op;
        
        System.out.print("Escribe un numero: ");
        num = sc.nextInt();

        sc.close();
        
        op = num % 7;
        
        multiplo = 7 - op;
        
        System.out.println("A " + num + " hay que sumarle " + multiplo + " para que sea multiplo de 7");
        
    }
    
    
}
