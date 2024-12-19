/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clase;

/**
 *
 * @author usuario
 */
public class Ordenacion_Burbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = { 2, 6, 4, 7, 1, 3, 5, 9, 10 };
        int elemento = 8;
        System.out.println("Vector original:");
        mostrarVector(vector);
        System.out.println("Vector ordenado:");
        int[] ordenar = ordenacionBurbuja(vector);
        mostrarVector(ordenar);
        int buscar = busquedaBinaria(vector, elemento);
        if(buscar == -1){
            System.out.println("El elemento no existe.");
        } else {
            System.out.println("El elemento " + elemento + " esta en la posicion " + buscar);
        }
    }
    
    public static void mostrarVector(int[] v){
        System.out.print("[");
        for(int i = 0; i < v.length; i++){
            if(i != v.length - 1){
                System.out.print(" " + v[i]);
            } else {
                System.out.print(" " + v[i] + "]");
            }
        }
        System.out.println();
    }
    
    public static int[] ordenacionBurbuja(int[] v){
        for(int i = 0; i < v.length; i++){
            for(int j = 0; j < v.length - 1; j++){
                if(v[j] > v[j+1]){
                    int aux = v[j];
                    v[j] = v[j+1];
                    v[j+1] = aux;
                }
            }
        }
        return v;
    }
    
    public static int busquedaBinaria(int[] v, int num){
        int resultado = -1;
        int limiteInferior = 0;
        int limiteSuperior = v.length - 1;
        int indice;
        
        while(limiteInferior <= limiteSuperior && resultado == -1){
            indice = (limiteInferior + limiteSuperior) / 2;
            if(v[indice] == num){
                resultado = indice;
            } else if(num > v[indice]){
                limiteInferior = indice+1;
            } else if(num < v[indice]){
                limiteSuperior = indice-1;
            }
        }
        return resultado;
    }
    
}
