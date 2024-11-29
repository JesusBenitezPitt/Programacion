/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_Aplicacion;

import java.util.Arrays;

/**
 *
 * @author usuario
 */
public class Ejercicio_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] tabla1 = { 1, 3, 7, 55, 56, 57 };
        int[] tabla2 = { 3, 4, 5, 7, 11 };
        fusionarTablas(tabla1, tabla2);
    }
    
    public static void fusionarTablas(int[] tabla1, int[] tabla2){
        int[] tablaFinal = new int[0];
        int indice1 = 0, indice2 = 0, indice3 = 0;
        
        //Compara que numero es mas pequeño y los añade a la tabla.
        while(indice1 < tabla1.length && indice2 < tabla2.length){
            if(tabla1[indice1] == tabla2[indice2]){
                tablaFinal = Arrays.copyOf(tablaFinal, tablaFinal.length + 1);
                tablaFinal[indice3] = tabla1[indice1];
                indice1++;
                indice2++;
            }
            else if(tabla1[indice1] < tabla2[indice2]){
                tablaFinal = Arrays.copyOf(tablaFinal, tablaFinal.length + 1);
                tablaFinal[indice3] = tabla1[indice1];
                indice1++;
            } else {
                tablaFinal = Arrays.copyOf(tablaFinal, tablaFinal.length + 1);
                tablaFinal[indice3] = tabla2[indice2];
                indice2++;
            }
            indice3++;
        }
        
        //Si quedan elementos restantes en la tabla uno, se insertan.
        while(indice1 < tabla1.length){
            tablaFinal = Arrays.copyOf(tablaFinal, tablaFinal.length + 1);
            tablaFinal[indice3] = tabla1[indice1];
            indice1++;
            indice3++;
        }
        
        //Si quedan elementos restantes en la tabla dos, se insertan.
        while(indice2 < tabla2.length){
            tablaFinal = Arrays.copyOf(tablaFinal, tablaFinal.length + 1);
            tablaFinal[indice3] = tabla2[indice2];
            indice2++;
            indice3++;
        }

        System.out.println("Tabla 1: " + Arrays.toString(tabla1));
        System.out.println("Tabla 2: " + Arrays.toString(tabla2));
        System.out.println("Tabla fusionada: " + Arrays.toString(tablaFinal));
    }
    
}
