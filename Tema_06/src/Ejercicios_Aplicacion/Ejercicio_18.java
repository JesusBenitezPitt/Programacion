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
public class Ejercicio_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        System.out.print("Introduce una frase: ");
        frase = sc.nextLine();
        frase = frase.toLowerCase();
        
        String[] frase_dividida = frase.split(" ");
        String camelCase = "";
        System.out.print(frase_dividida[0]);
        for(int i = 1; i <= frase_dividida.length-1; i++){
            camelCase += frase_dividida[i].substring(0, 1).toUpperCase() + frase_dividida[i].substring(1, frase_dividida[i].length()).toLowerCase();
        }
        System.out.println(camelCase);
    }
    
}
