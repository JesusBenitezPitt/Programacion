/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosResueltos;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio_02 {
    public static void main(String[] args){
        
        Scanner num = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = num.nextInt();

        num.close();

        System.out.println("El número introducido es " + numero);
    }
}
