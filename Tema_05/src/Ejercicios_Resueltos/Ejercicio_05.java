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
public class Ejercicio_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int longitud, fin;
        
        System.out.print("Introduce la longitud de la tabla: ");
        longitud = sc.nextInt();
        
        System.out.print("Introduce el fin del rango: ");
        fin = sc.nextInt();
        
        System.out.println(Arrays.toString(rellenaPares(longitud, fin)));
        
    }
    
    static int[] rellenaPares(int longitud, int fin){
        int[] nums = new int[longitud];
        
        for(int i = 0; i<nums.length; i++){
            int num = (int) (Math.random()*fin + 1);
            if(num % 2 == 0){
                nums[i] = num;
            }
        }
        
        Arrays.sort(nums);
        return nums;
    }
    
}
