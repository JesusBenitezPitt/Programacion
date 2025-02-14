/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Boletin_Matrices;

import java.util.Arrays;

/**
 *
 * @author usuario
 */
public class EjBoletin_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[6][6];
        matriz = rellenarMatriz(matriz);
        mostrarMatriz(matriz);
        System.out.println();
        buscarMinimoYMaximo(matriz);
    }
    
    public static boolean estaRepetido(int[] v, int n){
        boolean estaRepetido = false;
        for(int i = 0; i < v.length && !estaRepetido; i++){
            if(v[i] == n){
                estaRepetido = true;
            }
        }
        return estaRepetido;
    }
    
    public static int[][] rellenarMatriz(int[][] m){
        int[] numsIntroducidos = new int[0];
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                int random = (int) (Math.random()*1001);
                if(!estaRepetido(numsIntroducidos, random)){
                    numsIntroducidos = Arrays.copyOf(numsIntroducidos, numsIntroducidos.length+1);
                    numsIntroducidos[numsIntroducidos.length-1] = random;
                    m[i][j] = random;
                }
            }
        }
        return m;
    }
    
    public static void mostrarMatriz(int[][] m){
        for(int i = 0; i < m.length; i++){
            System.out.print((i+1) +" [ ");
            for(int j = 0; j < m[i].length; j++){
                if(j != m[i].length-1){
                    System.out.print(m[i][j] + " , ");
                } else {
                    System.out.print(m[i][j] + " ");
                }
            }
            System.out.print("]");
            System.out.println();
        }
    }
    
    public static void buscarMinimoYMaximo(int[][] m){
        int min = 101, max = -1, posFMin = 0, posFMax = 0, posCMin = 0, posCMax = 0;
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                if(m[i][j] > max){
                    posFMax = i;
                    posCMax = j;
                    max = m[i][j];
                } else if(m[i][j] < min){
                    posFMin = i;
                    posCMin = j;
                    min = m[i][j];
                }
            }
        }
        System.out.println("El valor maximo es: " + max + " y esta en la fila: " + (posFMax+1) + " y en la columna: " + (posCMax+1));
        System.out.println("El valor maximo es: " + min + " y esta en la fila: " + (posFMin+1) + " y en la columna: " + (posCMin+1));
    }
    
}