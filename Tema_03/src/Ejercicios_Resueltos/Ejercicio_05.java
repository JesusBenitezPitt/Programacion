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
public class Ejercicio_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, resultado, cont = 0;
        boolean terminado = false;
        
        do{
            num1 = (int) (Math.random()*100)+1;
            num2 = (int) (Math.random()*100)+1;
            
            System.out.println(num1 + " + " + num2);
            System.out.print("Resuelve la operacion anterior: ");
            resultado = sc.nextInt();
            
            if((num1 + num2) == resultado){
                cont++;
            } else {
                terminado = true;
            }
            
        } while(!terminado);
        
        System.out.println("Operaciones realizadas correctamente: " + cont);
        
    }
    
}
