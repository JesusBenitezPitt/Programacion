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
public class Ejercicio_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, resultado;
        
        num1 = (int) (Math.random()*99)+1;
        num2 = (int) (Math.random()*99)+1;
        
        System.out.println("Resuelve la siguiente operacion: " + num1 + " + " + num2);
        resultado = sc.nextInt();
        
        if((num1 + num2) == resultado){
            System.out.println("Resultado correcto");
        } else {
            System.out.println("resultado incorrecto (" + (num1 + num2) + ")");
        }
        
    }
    
}
