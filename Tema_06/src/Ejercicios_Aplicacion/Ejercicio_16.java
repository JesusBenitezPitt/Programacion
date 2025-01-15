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
public class Ejercicio_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final char[] conjunto1 = {'a', 'e', 'i', 'o', 's', 'b', 't'};
        final char[] conjunto2 = {'@', '€', '1', '0', '5', '8', '7'};
        char[] texto_codificado;
        String texto_original;
        while(true){
            System.out.print("Introduce una frase: ");
            texto_original = sc.nextLine();
            if(texto_original.isEmpty()){
                System.out.println("Debes introducir una frase.");
            } else {
                break;
            }
        }
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
