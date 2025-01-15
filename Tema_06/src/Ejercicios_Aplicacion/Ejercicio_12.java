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
public class Ejercicio_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int intentos = 7;
        String[] palabras_ocultas = {"avion", "pajaro", "arbol", "agua", "mar", "rio", "helicoptero"};
        int random = (int) (Math.random()*7);
        String palabra_oculta = palabras_ocultas[random];
        char[] palabra_ocultada = generarPalabraOculta(palabra_oculta);
        
        do{
            System.out.println("Palabra oculta:");
            mosrarPalabraOculta(palabra_ocultada);
            System.out.print("\nIntroduce una letra que contenga la palabra oculta o introduce una palabra: ");
            String palabra = sc.next();
            if(palabra.length() > palabra_oculta.length()){
                System.out.println("Palabra inconrrecta, te quedan " + intentos + " intentos.");
                    intentos--;
                    dibujarMuñeco(intentos);
            }
            
            if(palabra.length() > 1){
                if(!palabra.equals(palabra_oculta)){
                    System.out.println("Palabra inconrrecta, te quedan " + intentos + " intentos.");
                    intentos--;
                    dibujarMuñeco(intentos);
                } else {
                    for(int i = 0; i < palabra.length(); i++){
                        char[] palabra2 = palabra.toCharArray();
                        palabra_ocultada[i] = palabra2[i];
                    }
                }
            } else {
                char caracter = palabra.charAt(0);
                int pos = palabra_oculta.indexOf(caracter);
                if(pos == -1){
                    System.out.println("Letra inconrrecta, te quedan " + intentos + " intentos.");
                    intentos--;
                    dibujarMuñeco(intentos);
                } else {
                    while(pos != -1){
                        palabra_ocultada[pos] = caracter;
                        pos = palabra_oculta.indexOf(caracter, pos+1);
                    }
                }
            }
            
            if(comprobarFinalizado(palabra_ocultada)){
                System.out.print("Has acertado!! La palabra era: ");
                mosrarPalabraOculta(palabra_ocultada);
                System.out.println();
                break;
            }
            
        }while(intentos != 0);
        
    }
    
    private static void dibujarMuñeco(int intentos){        
        char[][] muñeco = {{'|', '-', '|'},
                                        {'|', '\\', 'o', '/'}, 
                                        {'_', '|'},
                                        {'/', '\\'}};
        switch(intentos) {
            case 6 -> {
                System.out.println(muñeco[2][0]);
            }
            case 5 -> {
                System.out.println(muñeco[1][0] + "" + muñeco[0][1] + "\n" + muñeco[0][0] + "\n" + muñeco[2][0]);
            }
            case 4 -> {
                System.out.println(muñeco[1][0] + "" + muñeco[0][1] + "" + muñeco[0][2] + "\n" + muñeco[0][0] + "\n" + muñeco[2][0]);
            }
            case 3 -> {
                System.out.println(muñeco[1][0] + "" +  muñeco[0][1] + "" +  muñeco[0][2] + "\n" + muñeco[0][0] + " " + muñeco[1][2] + "\n" + muñeco[2][0]);
            }
            case 2 -> {
                System.out.println(muñeco[1][0] + "" +  muñeco[0][1] + "" +  muñeco[0][2] + "\n" + muñeco[0][0] + " " + muñeco[1][2] + "\n" + muñeco[2][0] + " " + muñeco[2][1]);
            }
            case 1 -> {
                System.out.println(muñeco[1][0] + "" + muñeco[0][1] + "" + muñeco[0][2] + "\n" + muñeco[0][0] + "" + muñeco[1][1] + "" + muñeco[1][2] + "" + muñeco[1][3] + "\n" + muñeco[2][0] + " " + muñeco[2][1]);
            }
            case 0 -> {
                System.out.println(muñeco[1][0] + "" + muñeco[0][1] + "" + muñeco[0][2] + "\n" + muñeco[0][0] + "" + muñeco[1][1] + "" + muñeco[1][2] + "" + muñeco[1][3] + "\n" + muñeco[2][0] + " " + muñeco[2][1] + "\n" + " " + muñeco[3][0] + " " + muñeco[3][1]);
            }
        }
    }

    private static boolean comprobarFinalizado(char[] ocultar_palabra) {
        boolean terminado = true;
        for(int i = 0; i < ocultar_palabra.length; i++){
            if(ocultar_palabra[i] == '*'){
                terminado = false;
            }
        }
        return terminado;
    }

    private static char[] generarPalabraOculta(String palabra_oculta) {
        char[] palabra_ocultada = new char[palabra_oculta.length()];
        for(int i = 0; i < palabra_ocultada.length; i++){
            palabra_ocultada[i] = '*';
        }
        return palabra_ocultada;
    }

    private static void mosrarPalabraOculta(char[] palabra_ocultada) {
        for(int i = 0; i < palabra_ocultada.length; i++){
            System.out.print(palabra_ocultada[i]);
        }
    }
    
}
