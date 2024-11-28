/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EerciciosResueltos;

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
        int num1, num2, num3;
        
        System.out.print("Introduce el primer numero: ");
        num1 = sc.nextInt();
        
        System.out.print("Introduce el segundo numero: ");
        num2 = sc.nextInt();
        
        System.out.print("Introduce el tercer numero: ");
        num3 = sc.nextInt();
        
        if (num1 > num2 && num2 > num3){
            System.out.println(num1 + ", " + num2 + ", " + num3);
        } else if (num1 > num3 && num3 > num2){
            System.out.println(num1 + ", " + num3 + ", " + num2);
        } else if (num2 > num1 && num1 > num3){
            System.out.println(num2 + ", " + num1 + ", " + num3);
        } else if (num2 > num3 && num3 > num1){
            System.out.println(num2 + ", " + num3 + ", " + num1);
        } else if (num3 > num2 && num2 > num1){
            System.out.println(num3 + ", " + num2 + ", " + num1);
        } else if (num3 > num1 && num1 > num2){
            System.out.println(num3 + ", " + num1 + ", " + num2);
        }
        
    }
    
}
