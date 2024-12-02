/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clase;

import java.util.Arrays;
import java.lang.*;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Eliminacion_desordenada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = {1, 3, 5, 9, 4, 7, 10 , 2, 6, 8};
        mostrarVector(v);
        System.out.print("Escribe el numero que quieres borrar: ");
        int num_borrar = sc.nextInt();
        eliminacion(v, num_borrar);
    }
    
    /*
    public static int[] crearVector(){
        int t[] = new int[10];
        for(int i = 0; i < t.length; i++){
            t[i] = (int) (Math.random() * 10) +1;
        }
        return (t);
    }
    */
    
    public static void mostrarVector(int[] t){
        System.out.println(Arrays.toString(t));
    }
    
    public static int buscarElemento(int[] v, int n){
        boolean existe = false;
        int pos = 0;
        for(int i = 0; i < v.length && !existe; i++){
            if(v[i] != n){
                existe = false;
            } else if(v[i] == n) {
                pos = i;
                existe = true;
            }
        }
        if(existe){
            return pos;
        } else {
            return -1;
        }
    }

    private static void eliminacion(int[] v, int num) {
        int indice = buscarElemento(v, num) ;
        if(indice == -1){
            System.out.println("No se ha encontrado el numero en el vector.");
        } else {
            System.arraycopy(v, indice + 1, v, indice, v.length-1-indice);
            v = Arrays.copyOf(v, v.length -1);
        }
        mostrarVector(v);
    }
    
}
