/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_Aplicacion;
import java.util.Arrays;

/**
 *
 * @author usuario
 */
public class Ejercicio_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int v[] = { 1, 2 ,3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("Vector original: ");
        mostrarVector(v);
        System.out.println();
        System.out.print("Vector desordenado: ");
        desordenar(v);
    }
    
    public static void desordenar(int t[]){
        int[] t2 = Arrays.copyOf(t, t.length);
        for(int i = t2.length - 1; i > 0; i-- ){
            int indiceAleatorio = (int) (Math.random() * i +1);
            
            int temp = t2[i];
            t2[i] = t2[indiceAleatorio];
            t2[indiceAleatorio] = temp;
        }
        System.out.println(Arrays.toString(t2));
    }
    
    public static void mostrarVector(int[] t){
        Arrays.sort(t);
        System.out.println(Arrays.toString(t));
    }
    
}
