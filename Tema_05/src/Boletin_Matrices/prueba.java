/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Boletin_Matrices;

import static Boletin_Matrices.EjBoletin_07.columnaDeArrayBiInt;
import static Boletin_Matrices.EjBoletin_07.coordenadasDeArrayBiInt;
import static Boletin_Matrices.EjBoletin_07.filaDeArrayBiInt;

/**
 *
 * @author usuario
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] m = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        if(esPuntoDeSilla(m, 4)){
            System.out.println("Es punto de silla");
        } else {
            System.out.println("No es punto de silla");
        }
        
        boolean n = esPuntoDeSilla(m, 4);
        
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
    
}
