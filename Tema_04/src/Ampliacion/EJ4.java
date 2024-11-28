/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ampliacion;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EJ4 {

    /**
     * Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares hay dentro de un número. 
     * Se recomienda usar long en lugar de int ya que el primero admite números más largos. 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num;
        
        System.out.print("Escribe un numero: ");
        num = sc.nextLong();
        
        digitos(num);
        
    }
    
    static void digitos(long n){
        int p = 0, im = 0;
        long t = n;
        while(t > 0){
            int d = (int) (t % 10);
            if(d % 2 == 0){
                p++;
            } else {
                im++;
            }
            t /= 10;
            
        }
        System.out.println("El numero " + n + " tiene " + p + " digitos pares y " + im + " digitos impares");
    }
    
}
