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
public class Ejercicio_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, masAlto;
        int num = 0, etiquetaMasAlto = 0;
        
        System.out.print("Introduce la altura del arbol (en cm): ");
        a = sc.nextDouble();
        masAlto = a;
        
        while(a != -1){
            num++;
            if(a >= masAlto){
                masAlto = a;
                etiquetaMasAlto = num;
            }
            
            System.out.print("Introduce otra altura (en cm): ");
            a = sc.nextDouble();
        }
        
        System.out.println("El arbol mas alto es el arbol nº" + etiquetaMasAlto + " con " + masAlto + "cm de altura.");
        
    }
    
}
