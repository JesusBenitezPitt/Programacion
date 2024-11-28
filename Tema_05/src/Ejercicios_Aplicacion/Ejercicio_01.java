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
public class Ejercicio_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = crearVector();
        mostrarVector(v);
        System.out.print("Que numero quieres buscar en el vector: ");
        int num = sc.nextInt();
        System.out.println("Indices donde se encontro el numero: " + Arrays.toString(buscarTodos(v, num)));
    }
    
    public static int[] buscarTodos(int t[], int clave){
        int tIndices[] = new int[0];
        int cont = 0;
        for(int i = 0; i < t.length; i++){
            if(t[i] == clave){
                tIndices = Arrays.copyOf(tIndices, tIndices.length + 1);
                tIndices[cont] = i;
                cont++;
            }
        }
        return tIndices;
    }
    
    public static int[] crearVector(){
        int t[] = new int[10];
        for(int i = 0; i < t.length; i++){
            t[i] = (int) (Math.random() * 10 * 1);
        }
        return (t);
    }
    
    public static void mostrarVector(int[] t){
        System.out.println(Arrays.toString(t));
    }
    
}
