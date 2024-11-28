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
public class Ejercicio_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int[] t = crearVector();
        mostrarVector(t);
        System.out.print("Cuantos numeros consecutivos quieres sumar: ");
        num = sc.nextInt();
        mostrarVector(suma(t, num));
    }
    
    public static int[] suma(int[] t, int numElementos){
        int[] tsuma = new int[0];
        for(int i = 0; i < t.length; i++){
            for(int j = 0; j < numElementos; j++){
                tsuma = Arrays.copyOf(tsuma, tsuma.length + 1);
                tsuma[i] = t[i];
            }
        }
        return tsuma;
    }
    
    public static int[] crearVector(){
        int t[] = new int[6];
        for(int i = 0; i < t.length; i++){
            t[i] = (int) (Math.random() * 10) + 1;
        }
        return (t);
    }
    
    public static void mostrarVector(int[] t){
        System.out.println(Arrays.toString(t));
    }
    
}
