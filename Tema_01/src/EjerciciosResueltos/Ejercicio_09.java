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
public class Ejercicio_09 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un numero: ");
        int num = sc.nextInt();
        boolean comprobarPar = (num % 2) == 0;

        sc.close();
        
        System.out.println(comprobarPar);
        
    }
}
