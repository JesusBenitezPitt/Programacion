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
public class EjBoletin_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        int f, c;
        System.out.print("Numero de filas de la matriz: ");
        f = sc.nextInt();
        System.out.print("Numero de columnas de la matriz: ");
        c = sc.nextInt();
        int[][] m = crearMatriz(f, c);
        */
        int[][] m = {{1, 2, 3}, {4, 5, 6}};
        mostrarMatriz(m);
        System.out.println("Matriz Espejo:");
        mostrarMatriz(matrizEspejo(m));
    }
    
    public static int[][] crearMatriz(int f, int c) {
        int[][] m = new int[f][c];
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                m[i][j] = (int) (Math.random()*10);
            }
        }
        return m;
    }
    
    public static void mostrarMatriz(int[][] m){
        for(int f = 0; f < m.length; f++){
            System.out.print("[ ");
            for(int c = 0; c < m[f].length; c++){
                if(c != m[f].length-1){
                    System.out.print(m[f][c] + ", ");
                } else {
                    System.out.print(m[f][c] + " ]");
                }
            }
            System.out.println();
        }
    }
    
    public static int[][] matrizEspejo(int[][] m) {
        int[][] mEspejo = new int[m.length][m[0].length];
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                mEspejo[i][mEspejo[i].length-1-j] = m[i][j];
            }
        }
        return mEspejo;
    }
    
}
