/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosResueltos;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota1, nota2, nota3;
        int mediaBoletin;
        double mediaExpediente;
        
        System.out.print("Introduce la nota del primer trimestre: ");
        nota1 = sc.nextInt();
        
        System.out.print("Introduce la nota del segundo trimestre: ");
        nota2 = sc.nextInt();

        System.out.print("Introduce la nota del tercer trimestre: ");
        nota3 = sc.nextInt();

        sc.close();
        
        mediaExpediente = (nota1 + nota2 + nota3) / 3.0;
        mediaBoletin = (int) mediaExpediente;
        
        System.out.println("La nota media que se muestra en el boletin es: " + mediaBoletin);
        System.out.println("La nota media que se muestra en el expediente es: " + mediaExpediente);
    }
    
}
