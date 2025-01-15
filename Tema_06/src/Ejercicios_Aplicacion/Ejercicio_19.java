/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_Aplicacion;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase, palabra_reemplazar, palabra_a_reemplazar;
        System.out.print("Introduce una frase: ");
        frase = sc.nextLine();
        System.out.print("\nPalabra que quieras reemplazar: ");
        palabra_reemplazar = sc.next();
        while(true){
            System.out.print("Palabra por la que quieras reemplazar la anterior: ");
            palabra_a_reemplazar = sc.next();
            if(palabra_a_reemplazar.isEmpty()){
                System.out.println("Debes Introducir una palabra para reemplazar la anterior.");
            } else {
                break;
            }
        }
        
        String frase_reemplazada = frase.replaceAll(palabra_reemplazar, palabra_a_reemplazar);
        System.out.println(frase_reemplazada);
        
    }
    
}
