/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aplicacion;

import java.util.Scanner;

public class Ejercicio_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un número binario: ");
        long numeroBinario = scanner.nextLong();
        
        int decimal = 0;
        int digito;
        int exp = 0;
        long binario = numeroBinario;
        
        while(binario > 0){
            digito = (int) binario % 10;
            if(digito == 1){
                decimal += (int) Math.pow(2, exp);
            }
            exp++;
            binario = binario / 10;
        }
        
        System.out.println("El número decimal es: " + decimal);
    }
}
