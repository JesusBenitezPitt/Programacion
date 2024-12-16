/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Boletin_Matrices;

/**
 *
 * @author usuario
 */
public class EjBoletin_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] m = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Matriz original:");
        mostrarMatriz(m);
        System.out.println("Matriz Traspuesta:");
        mostrarMatriz(trasponerMatriz(m));
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
    
    private static int[][] trasponerMatriz(int[][] m) {
        int[][] matrizTraspuesta = new int[m[0].length][m.length];
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                matrizTraspuesta[j][i] = m[i][j];
            }
        }
        return matrizTraspuesta;
    }
    
}
