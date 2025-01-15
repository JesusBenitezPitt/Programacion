/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_Aplicacion;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        String[] frase_dividida;
        while(true){
            System.out.print("Introduce una frase: ");
            frase = sc.nextLine();
            if(frase.isEmpty()){
                System.out.println("Debes Introducir una frase.");
            } else {
                break;
            }
        }
        
        frase_dividida = frase.split(" ");
        Arrays.sort(frase_dividida);
        
        System.out.println("Frase ordenada alfabeticamente:");
        for(int i = 0; i < frase_dividida.length; i++){
            System.out.print(frase_dividida[i] + " ");
        }
        
    }
    
}
