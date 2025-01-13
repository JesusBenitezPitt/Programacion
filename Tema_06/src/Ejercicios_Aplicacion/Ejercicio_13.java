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
public class Ejercicio_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentencia, sentencia_sin_comentarios;
        System.out.print("Introduce la sentencia con comentarios: ");
        sentencia = sc.nextLine();
        sentencia_sin_comentarios = quitarComentarios(sentencia);
        
        System.out.println("Esta es la sentencia sin comentarios: " + sentencia_sin_comentarios);
    }

    private static String quitarComentarios(String sentencia) {
        String[] dividir_sentencia1 = sentencia.split("/\\*");
        String sentencia_dividida1 = dividir_sentencia1[0];
        String sentencia_dividida2 = dividir_sentencia1[1];
        String[] dividir_sentencia2 = sentencia_dividida2.split("\\*/");
        String sentencia_dividida3 = dividir_sentencia2[1];
        String sentencia_sin_comentarios = sentencia_dividida1 + sentencia_dividida3;
        return sentencia_sin_comentarios;
    }
    
}
