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
public class Ejercicio_03 {
    public static void main(String[] args){
        
        Scanner edad = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edadAct = edad.nextInt();
        int edadFut = edadAct + 1;

        edad.close();

        System.out.println("El año que viene tendrás " + edadFut + " años");
        
    }
}
