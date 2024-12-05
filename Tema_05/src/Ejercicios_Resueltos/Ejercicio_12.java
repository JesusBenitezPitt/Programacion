/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_Resueltos;

/**
 *
 * @author usuario
 */
public class Ejercicio_12 {

    /**
     * @param args the command line arguments
     */
    
    //Calcula la suma de los datos por filas y columnas
    public static void main(String[] args) {
        int suma = 0;
        int[][] tabla1 = new int[5][5];
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                tabla1[i][j] = 10 * i + j;
            }
        }
        System.out.println();
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(tabla1[i][j] + ", ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                suma += tabla1[i][j];
            }
            System.out.println("Suma de la fila " + i + ": " + suma);
            suma = 0;
        }
        System.out.println();
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                suma += tabla1[j][i];
            }
            System.out.println("Suma de la columna " + i + ": " + suma);
            suma= 0;
        }
        
    }
    
}
