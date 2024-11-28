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
public class Ejercicio_04 {
    public static void main(String[] args){
        
        Scanner año = new Scanner(System.in);

        System.out.print("Introduce el año actual: ");
        int añoAct = año.nextInt();
        
        System.out.print("Introduce tu año de nacimiento: ");
        int añoNacimiento = año.nextInt();
        int edad = añoAct - añoNacimiento;

        año.close();

        System.out.println("Tienes " + edad + " años.");
    }
}
