/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_Resueltos;

import java.util.Arrays;
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
        double[] nums = new double[5];
        
        for(int i = 0; i < nums.length; i++){
            System.out.print("Escribe un numero decimal: ");
            nums[i] = sc.nextDouble();   
        }
        
        System.out.println(Arrays.toString(nums));
        
    }
    
}
