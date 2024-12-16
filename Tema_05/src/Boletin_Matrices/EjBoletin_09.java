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
public class EjBoletin_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero producto de un escalar: ");
        int n = sc.nextInt();
        int[][] matriz = { { 1, 2, 3 }, { 4, 5, 6 },{ 7, 8, 9 }};
        int[][] matrizEscalada = matrizEscalada(matriz, n);
        mostrarMatriz(matrizEscalada);
    }
    
    public static int[][] matrizEscalada(int[][] m, int n){
        int[][] mEscalada = new int[m.length][m[0].length];
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[0].length; j++){
                mEscalada[i][j] = m[i][j]*n;
            }
        }
        return mEscalada;
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
    
}
