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
public class Ejercicio_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, numAleatorio;
        
        System.out.print("Escribe un numero del 1 al 100: ");
        num = sc.nextInt();
        
        numAleatorio = (int) (Math.random()*100)+1;
        
        while(num != numAleatorio && num != -1){
            if(num > numAleatorio){
                System.out.println("El numero introducido es mayor.");
            } else {
                System.out.println("El numero introducido es menor.");
            }
            
            System.out.print("Escribe otro numero del 1 al 100: ");
            num = sc.nextInt();
        }
        
        if(num == numAleatorio){
            System.out.println("Has acertado el numero (" + numAleatorio + ").");
        } else if(num == -1){
            System.out.println("El numero era " + numAleatorio + ".");
        }
        
    }
    
}
