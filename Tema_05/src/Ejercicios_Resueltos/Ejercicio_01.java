/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_Resueltos;

import java.util.Arrays;

/**
 *
 * @author usuario
 */
public class Ejercicio_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] tabla = new int[10];
        int suma = 0;
        
        for(int i = 0; i < tabla.length; i++){
            tabla[i] = (int) (Math.random()*100)+1;
        }
       
        for(int i = 0; i < tabla.length; i++){
            suma += tabla[i];
        }
        
        System.out.println(Arrays.toString(tabla));
        System.out.println("La suma de todos los numeros aleatorios de la tabla es: " + suma);
        
    }
    
}
