/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ampliacion;

/**
 *Escribe un programa que simule la tirada de dos dados. 
 * El programa deberá continuar tirando los dados una y otra vez hasta que en alguna tirada los dos dados tengan el mismo valor.
 * @author usuario
 */
public class EJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dado1 = dado1();
        int dado2 = dado2();
        
        int cont = 1;
        while(dado1 != dado2){
            dado1 = dado1();
            dado2 = dado1();
            
            System.out.println("Tirada " + cont);
            System.out.println("Dado 1: " + dado1);
            System.out.println("Dado 2: " + dado2);
            System.out.println();
            cont++;
        }
        System.out.println("Los dados son iguales");
    }
    
    static int dado1(){
        return (int) ((Math.random() * 6) + 1);
    }
    
    static int dado2(){
        return (int) ((Math.random() * 6) + 1);
    }
    
    
    
}
