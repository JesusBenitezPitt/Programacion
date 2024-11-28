/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ampliacion;

import java.util.Scanner;

/**
 *Realiza un programa que vaya pidiendo números hasta que se introduzca un
 * número negativo y nos diga cuántos números se han introducido, 
 * la media de los impares y el mayor de los pares. 
 * El número negativo sólo se utiliza para indicar el final de la 
 * introducción de datos pero no se incluye en el cómputo. 
 * @author usuario
 */
public class EJ6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, max = 0, cont = 0, imp = 0, nums = 0;
        double media;
        boolean pos = true;
        
        do{
            System.out.print("Introduce un numero: ");
            num = sc.nextInt();
            if(num > 0){
                cont++;
                if(num % 2 == 0){
                    if(num > max){
                        max = num;
                    }
                } else {
                    imp++;
                    nums += num;
                }
            } else {
                pos = false;
            }
        }while(pos);
        
        System.out.println("Se han introducido " + cont + " numeros.");
        if(imp > 0){
            media = nums/imp;
            System.out.println("La media de los numeros impares es de " + media);
        }
        System.out.println("El numero maximo de los numeros pares es de " + max);
    }
    
}
