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
public class Ejercicio_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0;
        double radio, altura;
        
        do{
            System.out.println("¿Que quieres calcular?");
            System.out.println("1. El area del cilindro");
            System.out.println("2. El volumen del cilindro");
            System.out.println("3. Salir");
            System.out.print("Elige una opcion: ");
            op = sc.nextInt();
        }while(op < 1 && op > 3);
        
        switch(op){
            case 1 -> {
                System.out.print("Escribe el radio: ");
                radio = sc.nextDouble();
                System.out.print("Escribe la altura: ");
                altura = sc.nextDouble();
                
                AreaCilindro(radio, altura);
                
            }
            case 2 -> {
                System.out.print("Escribe el radio: ");
                radio = sc.nextDouble();
                System.out.print("Escribe la altura: ");
                altura = sc.nextDouble();
                
                VolumenCilindro(radio, altura);
                
            }
            case 3 -> {
                System.out.println("Saliendo...");
            }
        }
        
    }
    
    public static void AreaCilindro(double r, double a){
        double area = 2*Math.PI*r*(a+r);
        System.out.println(area);
    }
    
    public static void VolumenCilindro(double r, double a){
        double volumen = Math.PI*Math.pow(r, 2)*a;
        System.out.println(volumen);
    }
    
}
