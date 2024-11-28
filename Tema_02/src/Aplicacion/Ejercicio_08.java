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
public class Ejercicio_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, resultado, operacion;
        
        num1 = (int) (Math.random()*99)+1;
        num2 = (int) (Math.random()*99)+1;
        operacion = (int) (Math.random()*3)+1;
        
        switch(operacion){
            case 1 -> {
                System.out.println(num1 + " + " + num2);
                System.out.print("Resuelve la operacion: " );
                resultado = sc.nextInt();
        
                if((num1 + num2) == resultado){
                    System.out.println("Resultado correcto");
                } else {
                    System.out.println("resultado incorrecto (" + (num1 + num2) + ")");
                }
            }
            case 2 -> {
                System.out.println(num1 + " - " + num2);
                System.out.print("Resuelve la operacion: " );
                resultado = sc.nextInt();
        
                if((num1 - num2) == resultado){
                    System.out.println("Resultado correcto");
                } else {
                    System.out.println("resultado incorrecto (" + (num1 - num2) + ")");
                }
            }
            case 3 -> {
                    System.out.println(num1 + " * " + num2);
                    System.out.print("Resuelve la operacion: " );
                    resultado = sc.nextInt();
        
                    if((num1 * num2) == resultado){
                        System.out.println("Resultado correcto");
                    } else {
                        System.out.println("resultado incorrecto (" + (num1 * num2) + ")");
                    }
            }
        }
        
    }
    
}

