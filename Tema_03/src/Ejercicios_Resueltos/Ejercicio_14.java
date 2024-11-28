/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_Resueltos;

/**
 *
 * @author usuario
 */
public class Ejercicio_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            System.out.println("Tabla del " + i);
            for(int j = 1; j <= 10; j++){
                System.out.println(i + " x " + j + " = " + i*j);
            }
            System.out.println(" ");
        }
    }
    
}
