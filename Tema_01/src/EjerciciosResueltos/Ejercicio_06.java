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
public class Ejercicio_06 {
    public static void main(String[] args){
        Scanner nota = new Scanner(System.in);
        int nota1, nota2;
        double media;
        
        System.out.print("Introduce la primera nota: ");
        nota1 = nota.nextInt();

        System.out.print("Introduce la segunda nota: ");
        nota2 = nota.nextInt();

        nota.close();

        media = (nota1 + nota2) / 2.0;
        System.out.println("La nota media de " + nota1 + " y " + nota2 + " es: " + media);
    }
}
