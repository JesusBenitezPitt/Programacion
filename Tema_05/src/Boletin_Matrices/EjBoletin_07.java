/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Boletin_Matrices;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EjBoletin_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fila, col;
        int[][] matriz = generaArrayBiInt(10, 100);
        mostrarMatriz(matriz);
        
        do{
            System.out.print("Que fila quieres mostrar (1-" + matriz.length + "): ");
            fila = sc.nextInt();
        }while(fila > 6 && fila < 1);
        System.out.println("Fila " + fila + ": " + Arrays.toString(filaDeArrayBiInt(matriz, fila-1)));
        
        do{
            System.out.print("Que columna quieres mostrar (1-" + matriz[0].length + "): ");
            col = sc.nextInt();
        }while(col > 10 && col < 1);
        System.out.println("Columna " + col + ": " + Arrays.toString(columnaDeArrayBiInt(matriz, col-1)));
        
        System.out.print("Elemento que quieres buscar: ");
        int elemento = sc.nextInt();
        System.out.println("Coordenadas de " + elemento + ": " + Arrays.toString(coordenadasDeArrayBiInt(matriz, elemento)));
        
        System.out.print("Introduce un numero de la matriz: ");
        int numero = sc.nextInt();
        if(esPuntoDeSilla(matriz, numero)){
            System.out.println("Es punto de silla.");
        } else {
            System.out.println("No es punto de silla.");
        }
        
        System.out.println("Diagonal del array: " + Arrays.toString(diagonal(matriz)));
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
    
    public static int[][] generaArrayBiInt(int min, int max){
        int[][] m = new int[6][6];
        int cont = 0;
        for(int i = 0; i < m.length; i++){
            while(cont != m[i].length){
                int random = (int) (Math.random()*max+1);
                if(random >= min){
                    m[i][cont] = random;
                    cont++;
                }
            }
            cont = 0;
        }
        return m;
    }
    
    public static int[] filaDeArrayBiInt(int[][] m, int f){
        return m[f];
    }
    
    public static int[] columnaDeArrayBiInt(int[][] m, int c){
        int[] columna = new int[m.length];
        for(int i = 0; i < m.length; i++){
            columna[i] = m[i][c];
        }
        return columna;
    }
    
    public static int[] coordenadasDeArrayBiInt(int[][] m, int n){
        int[] coordenadas = new int[2];
        boolean encontrado = false;
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length  && !encontrado; j++){
                if(m[i][j] == n){
                    coordenadas[0] = i;
                    coordenadas[1] = j;
                    encontrado = true;
                } else {
                    coordenadas[0] = -1;
                    coordenadas[1] = -1;
                }
            }
        }
        return coordenadas;
    }
    
    public static boolean esPuntoDeSilla(int[][] m, int n){
        boolean ePS = true;
        int min = n, max = n;
        int[] coordenadas = coordenadasDeArrayBiInt(m, n);
        int[] fila = filaDeArrayBiInt(m, coordenadas[0]);
        int[] columna = columnaDeArrayBiInt(m, coordenadas[1]);
        
        for(int i = 0; i < fila.length; i++){
            if(fila[i] < min){
                ePS = false;
            }
        }
        
        for(int i = 0; i < columna.length; i++){
            if(columna[i] > max){
                ePS = false;
            }
        }
        
        return ePS;
    }
    
    public static int[] diagonal(int[][] m){
        int[] diagonal = new int[0];
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                if(i == j){
                    diagonal = Arrays.copyOf(diagonal, diagonal.length+1);
                    diagonal[diagonal.length-1] = m[i][j];
                }
            }
        }
        return diagonal;
    }
    
}
