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
public class Ejercicio_03_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String passwd, palabra;
        System.out.print("Escribe la contraseña: ");
        passwd = sc.nextLine();
        System.out.println("La contraseña tiene " + passwd.length() + " caracteres.");
        System.out.print("Escribe una palabra para adivinar la contraseña: ");
        palabra = sc.nextLine();
        while(!palabra.equals(passwd)){
            String pista = " ";
            for(int i = 0; i < passwd.length(); i++){
                if(palabra.charAt(i) == passwd.charAt(i)){
                    pista += passwd.charAt(i);
                } else {
                    pista += "*";
                }
            }
            System.out.println(pista);
            System.out.print("Trata de adivinar de nuevo la contraseña: ");
            palabra = sc.nextLine();
        }
        System.out.println("Has acertado la contraseña! (" + passwd + ")");
    }
    
}
