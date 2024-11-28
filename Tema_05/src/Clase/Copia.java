/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clase;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Copia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = crearVector();
        mostrarVector(v);
        System.out.print("Introduce un numero nuevo a insertar: ");
        int num_nuevo = sc.nextInt();
        insertarNum(v, num_nuevo);
    }
    
    public static int[] crearVector(){
        int t[] = new int[10];
        for(int i = 0; i < t.length; i++){
            t[i] = (int) (Math.random() * 10 * 1);
        }
        Arrays.sort(t);
        return (t);
    }
    
    public static void mostrarVector(int[] t){
        System.out.println(Arrays.toString(t));
    }
    
    public static void insertarNum(int[] t, int n){
        int indice = Arrays.binarySearch(t, n);
        if(indice < 0){
            indice = -indice -1;
        }
        int[] copia = new int[t.length + 1];
        System.arraycopy(t, 0, copia, 0, indice);
        System.arraycopy(t, indice, copia, indice + 1, t.length - indice);
        copia[indice] = n;
        t = copia;
        System.out.print("Nueva tabla: ");
        mostrarVector(t);
    }
    
}
