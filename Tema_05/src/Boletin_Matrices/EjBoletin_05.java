/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Boletin_Matrices;

import static Ejercicios_Aplicacion.Ejercicio_08.comprobarMatrizMagica;

/**
 *
 * @author usuario
 */
public class EjBoletin_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] tabla1 = { { 16, 2, 3, 13 }, 
                                    { 5, 11, 10, 8,}, 
                                    { 9, 7, 6, 12 }, 
                                    { 4, 14, 15, 1 }};
        comprobarMatrizMagica(tabla1);
    }
    
    public static void comprobarMatrizMagica(int[][] t){
        int f0 = t[0][0] + t[0][1] + t[0][2] + t[0][3];
        int f1 = t[1][0] + t[1][1] + t[1][2] + t[1][3];
        int f2 = t[2][0] + t[2][1] + t[2][2] + t[2][3];
        int f3 = t[3][0] + t[3][1] + t[3][2] + t[3][3];
        
        int c0 = t[0][0] + t[1][0] + t[2][0] + t[3][0];
        int c1 = t[0][1] + t[1][1] + t[2][1] + t[3][1];
        int c2 = t[0][2] + t[1][2] + t[2][2] + t[3][2];
        int c3 = t[0][3] + t[1][3] + t[2][3] + t[3][3];
        
        int d1 = t[0][0] + t[1][1] + t[2][2] + t[3][3];
        int d2 = t[3][0] + t[2][1] + t[1][2] + t[0][3];
        
        if(f0 == f1 && f0 == f2 && f0 == f3){
            if(c0 == c1 && c0 == c2 && c0 == c3){
                if(d1 == d2){
                    if(f0 == c0 && c0 == d1){
                        System.out.println("Es una matriz magica.");
                    } else {
                        System.out.println("No es una matriz magica.");
                    }
                } else {
                    System.out.println("No es una matriz magica.");
                }
            } else {
                System.out.println("No es una matriz magica.");
            }
        } else {
            System.out.println("No es una matriz magica.");
        }
    }
    
}
