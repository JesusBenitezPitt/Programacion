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
public class EjBoletin_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[9][9];
        matriz = rellenarMatriz(matriz);
        mostrarMatriz(matriz);
        System.out.println();
        int[] diagonal = diagonal(matriz);
        System.out.println("Diagonal de izquieráda inferior a derecha superior: " + Arrays.toString(diagonal));
        maximoYMinimo(diagonal);
        mediaDiagonal(diagonal);
    }
    
    public static int[][] rellenarMatriz(int[][] m){
        for(int i = 0; i < m.length; i++){
            int cont = 0;
            while(cont != m[i].length){
                int random = (int) (Math.random()*901);
                if(random >= 500){
                    m[i][cont] = random;
                    cont++;
                }
            }
        }
        return m;
    }
    
    public static void mostrarMatriz(int[][] m){
        for(int i = 0; i < m.length; i++){
            System.out.print("[ ");
            for(int j = 0; j < m[i].length; j++){
                if(j != m[i].length-1){
                    System.out.print( m[i][j] + ", ");
                } else {
                    System.out.print( m[i][j] + " ]");
                }
            }
            System.out.println();
        }
    }
    
    public static int[] diagonal(int[][] m){
        int[] diagonal = new int[0];
        for(int i = m.length-1; i >= 0; i--){
            for(int j = 0; j < m[i].length; j++){
                if(j == m.length-i-1){
                    diagonal = Arrays.copyOf(diagonal, diagonal.length + 1);
                    diagonal[diagonal.length-1] = m[i][j];
                }
            }
        }
        return diagonal;
    }
    
    public static void  maximoYMinimo(int[] v){
        int max = v[0], min = v[0];
        for(int i = 0; i < v.length; i++){
            if(v[i] > max){
                max = v[i];
            } else if(v[i] < min){
                min = v[i];
            }
        }
        System.out.println("El numero maximo de la diagonal es: " + max + ", y el numero minimo es: " + min);
    }
    
    public static void mediaDiagonal(int[] v){
        int suma = 0;
        for(int i = 0; i < v.length; i++){
            suma += v[i];
        }
        double media = suma/v.length;
        System.out.println("La media de los valores de la diagonal es: " + media);
    }
    
}
