/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_Resueltos;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase, palabra;
        int pos, veces_encontrada = 0;
        System.out.print("Introduce una frase: ");
        frase = sc.nextLine();
        System.out.print("Introuce una palabra para buscar en la frase: ");
        palabra = sc.next();
        pos = frase.indexOf(palabra);
        while(pos != -1){
            veces_encontrada++;
            pos = frase.indexOf(frase, pos + 1);
        }
        if(veces_encontrada == 0){
            System.out.print("No se ha encontrado \"" + palabra + "\" en la frase.");
        } else {
            System.out.println("La palabra \"" + palabra + "\" se ha encontrado " + veces_encontrada + " veces");
        }
    }
    
}
