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
public class Ejercicio_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] apuesta = new int[6], combinacionGanadora = new int[6];
        
        for(int i = 0; i < apuesta.length; i++){
            System.out.print("Introduce el numero de la apuesta primitiva: ");
            apuesta[i] = sc.nextInt();
        }
        
       for(int i = 0; i < combinacionGanadora.length; i++){
           combinacionGanadora[i] = (int) (Math.random()*100);
       }
       
        System.out.println("Hay un total de " + primitiva(apuesta, combinacionGanadora) + " de aciertos.");
       
    }
    
    static int primitiva(int[] apuesta, int[] combinacionGanadora){
        int aciertos = 0;
        for(int i = 0; i < apuesta.length; i++){
            if(apuesta[i] == combinacionGanadora[i]){
                aciertos ++;
            }
        }
        return aciertos;
    }
    
}
