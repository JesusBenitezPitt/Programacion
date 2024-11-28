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
public class Ejercicio_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, dni;
        
        System.out.println("Escribe un numero de DNI: ");
        dni = sc.nextInt();
        
        num = dni % 23;
        
        switch(num){
            case 0 -> System.out.println("La letra es T (" + dni + "T)");
            case 1 -> System.out.println("La letra es R (" + dni + "R)");
            case 2 -> System.out.println("La letra es W (" + dni + "W)");
            case 3 -> System.out.println("La letra es A (" + dni + "A)");
            case 4 -> System.out.println("La letra es G (" + dni + "G)");
            case 5 -> System.out.println("La letra es M (" + dni + "M)");
            case 6 -> System.out.println("La letra es Y (" + dni + "Y)");
            case 7 -> System.out.println("La letra es F (" + dni + "F)");
            case 8 -> System.out.println("La letra es P (" + dni + "P)");
            case 9 -> System.out.println("La letra es D (" + dni + "D");
            case 10 -> System.out.println("La letra es X (" + dni + "X)");
            case 11 -> System.out.println("La letra es B (" + dni + "B)");
            case 12 -> System.out.println("La letra es N (" + dni + "N)");
            case 13 -> System.out.println("La letra es J (" + dni + "J)");
            case 14 -> System.out.println("La letra es Z (" + dni + "Z)");
            case 15 -> System.out.println("La letra es S (" + dni + "S)");
            case 16 -> System.out.println("La letra es Q (" + dni + "Q)");
            case 17 -> System.out.println("La letra es V (" + dni + "V)");
            case 18 -> System.out.println("La letra es H (" + dni + "H)");
            case 19 -> System.out.println("La letra es L (" + dni + "L)");
            case 20 -> System.out.println("La letra es C (" + dni + "C)");
            case 21 -> System.out.println("La letra es K (" + dni + "K)");
            case 22 -> System.out.println("La letra es E (" + dni + "E)");
        }
    }
    
}
