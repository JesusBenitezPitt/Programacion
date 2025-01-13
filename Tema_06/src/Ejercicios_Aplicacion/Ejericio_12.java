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
public class Ejericio_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean terminado = false;
        int intentos = 7;
        String[] palabras_ocultas = {"avion", "pajaro", "arbol", "agua", "mar", "rio", "helicoptero"};
        int random = (int) (Math.random()*8);
        String palabra_oculta = palabras_ocultas[random];
        
        String[] ocultar_palabra = new String[palabra_oculta.length()];
        for(int i = 0; i < ocultar_palabra.length; i++){
            ocultar_palabra[i] = "*";
        }
        
        do{
            System.out.println("Palabra oculta:");
            for(int i = 0; i < ocultar_palabra.length; i++){
                System.out.print(ocultar_palabra[i]);
            }
            System.out.print("\nIntroduce una letra que contenga la palabra oculta: ");
            String letra = sc.next();
            
            int pos = palabra_oculta.indexOf(letra);
            if(pos == -1){
                intentos --;
                System.out.println("Letra inconrrecta, te quedan " + intentos + " intentos.");
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
            } else {
                while(pos != -1){
                    ocultar_palabra[pos] = letra;
                    pos = palabra_oculta.indexOf(letra, pos+1);
                }
            }
            
            for(int i = 0; i < ocultar_palabra.length; i++){
                if(!ocultar_palabra[i].equals("*")){
                    terminado = true;
                } else {
                    terminado = false;
                }
            }
            
            if(terminado){
                System.out.println("Has acertado la palabra!");
                break;
            }
            
        }while(intentos != 0);
        
    }
    
}
