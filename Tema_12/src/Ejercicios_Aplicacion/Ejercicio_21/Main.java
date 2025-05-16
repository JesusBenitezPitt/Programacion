/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_Aplicacion.Ejercicio_21;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont = 0;
        Set<Integer> numeros = new TreeSet<>();
        while(cont < 20){
            if(numeros.add((int) (Math.random() * 100))){
                cont ++;
            }
        }
        System.out.println(numeros);
    }
    
}
