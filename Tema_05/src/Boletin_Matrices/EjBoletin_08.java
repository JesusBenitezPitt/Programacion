/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Boletin_Matrices;

/**
 *
 * @author usuario
 */
public class EjBoletin_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] m1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] m2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        
        System.out.println("Matriz 1:");
        mostrarMatriz(m1);
        System.out.println("\nMatriz 2:");
        mostrarMatriz(m2);
        System.out.println();
         if(sonIguales(m1, m2)){
             System.out.println("Las matrices son iguales");
         } else {
             System.out.println("Las matrices no son iguales");
         }
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
    
    public static boolean sonIguales(int[][] m1, int[][] m2){
        boolean iguales = true;
        if(m1.length == m2.length && m1[0].length == m2[0].length){
            for(int i = 0; i < m1.length && iguales; i++){
                for(int j = 0; j < m1[i].length && iguales; j++){
                    if(m1[i][j] != m2[i][j]){
                        iguales = false;
                    }
                }
            }
        }
        return iguales;
    }
    
}
