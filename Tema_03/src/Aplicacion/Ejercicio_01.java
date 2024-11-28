/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aplicacion;

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
        int num, digito, exp;
        long binario;
        
        System.out.print("Escribe un numero: ");
        num = sc.nextInt();
        
        exp=0;
        binario=0;
        while(num!=0){
                digito = num % 2;
                binario = (long) (binario + digito * Math.pow(10, exp));
                exp++;
                num = num/2;
        }
        
        System.out.println(binario);
        
    }
    
}
