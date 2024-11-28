/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aplicacion;

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
        int a,b;
        boolean mcd = false;
        
        System.out.print("Escribe un valor para a: ");
        a = sc.nextInt();
        
        System.out.print("Escribe un valor para b: ");
        b = sc.nextInt();
        
        if(a > b){
            for(int i = b; i > 0 && mcd == false; i--){
                if(b%i == 0 && a%i == 0){
                    System.out.println("El maximo comun divisor es: "+i);
                    mcd = true;
                }
            }
        } else if(a < b) {
            for(int i = a; i > 0 && mcd == false; i--){
                if(b%i == 0 && a%i == 0){
                    System.out.println("El maximo comun divisor es: "+i);
                    mcd = true;
                }
            }
        }
        
    }
    
}
