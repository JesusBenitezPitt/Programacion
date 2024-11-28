/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_Resueltos;


/**
 *
 * @author usuario
 */
public class Ejercicio_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int impar;
        double suma = 0;
        
        for(int cont = 1; cont <= 10; cont++){
            impar = 2 * cont  -1;
            suma += impar;
        }
        
        System.out.println("La suma de los 10 primeros numeros impares es: " + suma);
        
    }
    
}
