/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_Aplicacion;

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
        int[] sueldos = new int[0];
        int sueldo, pos = 0;
        do{
            System.out.print("¿Cual es tu sueldo?: ");
            sueldo = sc.nextInt();
            if(sueldo != -1){
                sueldos = Arrays.copyOf(sueldos, sueldos.length + 1);
                sueldos[pos] = sueldo;
                pos++;
            }
        }while(sueldo != -1);
        System.out.print("Todos los sueldos: ");
        mostrarVector(ordenadoDecreciente(sueldos));
        System.out.println("El sueldo maximo es de " + maximo(sueldos) + " y el minimo de " + minimo(sueldos));
        System.out.println("La media de sueldos es de " + media(sueldos));
    }
    
    public static int media(int[] t){
        int suma = 0;
        for(int i = 0; i <= t.length - 1; i++){
            suma += t[i];
        }
        int media = suma/t.length;
        return media;
    }
    
    public static int maximo(int[] t){
        int max = t[0];
        for(int i = 0; i <= t.length -1; i++){
            if(t[i] > max){
                max = t[i];
            }
        }
        return max;
    }
    
    public static int minimo(int[] t){
        int min = t[0];
        for(int i = 0; i < t.length -1; i++){
            if(t[i] < min){
                min = t[i];
            }
        }
        return min;
    }
    
    public static int[] ordenadoDecreciente(int[] t){
        int[] t2 = new int[t.length];
        int pos = 0;
        Arrays.sort(t);
        for(int i = t.length - 1; i >= 0; i--){
            t2[pos] = t[i];
            pos++;
        }
        return t2;
    }
    
    public static void mostrarVector(int[] t){
        System.out.println(Arrays.toString(t));
    }
    
}
