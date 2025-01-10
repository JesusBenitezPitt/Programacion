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
public class Ejercicio_03_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String passwd, palabra;
        System.out.print("Escribe la contraseña: ");
        passwd = sc.nextLine();
        
        do{
            System.out.print("Escribe una palabra para adivinar la contraseña: ");
            palabra = sc.nextLine();
            
            if(palabra.length() > passwd.length()){
                System.out.println("La contraseña contiene menos caracteres");
            } else if(palabra.length() < passwd.length()){
                System.out.println("La contraseña contiene mas caracteres");
            }
        }while(!palabra.equals(passwd));
        System.out.println("Has acertado la contraseña! (" + passwd + ")");
    }
    
}
