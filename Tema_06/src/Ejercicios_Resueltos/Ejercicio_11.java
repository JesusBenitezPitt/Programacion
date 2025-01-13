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
public class Ejercicio_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final char[] conjunto1 = {'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v'};
        final char[] conjunto2 = {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's'};
        char[] texto_codificado;
        String texto_original;
        System.out.print("Introduce el texto a codificar: ");
        texto_original = sc.nextLine();
        texto_original = texto_original.toLowerCase();
        texto_codificado = new char[texto_original.length()];
        
        for(int i = 0; i < texto_original.length(); i++){
            texto_codificado[i] = codificador(conjunto1, conjunto2, texto_original.charAt(i));
        }
        String texto = String.valueOf(texto_codificado);
        System.out.println(texto);
    }
    
    public static char codificador(char[] conjunto1, char[] conjunto2, char c){
        String conjunto_a_string = String.valueOf(conjunto1);
        char codificado;
        int pos = conjunto_a_string.indexOf(c);
        if(pos == -1){
            codificado = c;
        } else {
            codificado = conjunto2[pos];
        }
        return codificado;
    }
    
}
