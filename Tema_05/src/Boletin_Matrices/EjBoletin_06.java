/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Boletin_Matrices;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EjBoletin_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fila, col;
        System.out.print("Numero de filas de la matriz: ");
        fila = sc.nextInt();
        System.out.print("Numero de columnas de la matriz: ");
        col = sc.nextInt();
        System.out.println("Matriz 1:");
        int[][] matriz1 = crearMatriz(fila, col);
        System.out.println("Matriz 2:");
        int[][] matriz2 = crearMatriz(fila, col);
        System.out.println("Matriz 1:");
        mostrarMatriz(matriz1);
        System.out.println("Matriz 2:");
        mostrarMatriz(matriz2);
        System.out.println("Suma de los valores de las matrices:");
        mostrarMatriz(sumaMatrices(matriz1, matriz2));
    }
    
    public static int[][] crearMatriz(int f, int c){
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[f][c];
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print("Valor de la posicion [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        return matriz;
    }
    
    public static void mostrarMatriz(int[][] m){
        for(int i = 0; i < m.length; i++){
            System.out.print("[");
            for(int j = 0; j < m[i].length; j++){
                if(j != m[i].length-1){
                    System.out.print(m[i][j] + ", ");
                } else {
                    System.out.print(m[i][j] + "]");
                }
            }
            System.out.println();
        }
    }
    
    public static int[][] sumaMatrices(int[][] m1, int[][] m2){
        int[][] suma = new int[m1.length][m1[0].length];
        for(int i = 0; i < m1.length; i++){
            for(int j = 0; j < m1[i].length; j++){
                suma[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return suma;
    }
    
}
