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
        int n1, n2, sumaA, sumaB;
        
        System.out.print("Escribe un numero: ");
        n1 = sc.nextInt();
        
        System.out.print("Escribe otro numero: ");
        n2 = sc.nextInt();
        
        sumaA = sumaDivisores(n1);
        sumaB = sumaDivisores(n2);
        
        if(sumaA == sumaB){
            System.out.println("Son numeros amigos");
        } else {
            System.out.println("No son numeros amigos");
        }
        
    }
    
    static int sumaDivisores(int n){
        int suma = 0;
        for(int i = n; i > 1; i--){             
            if(n % i == 0){
                suma += i;
            }
         }
        return (suma);
    }
    
}
