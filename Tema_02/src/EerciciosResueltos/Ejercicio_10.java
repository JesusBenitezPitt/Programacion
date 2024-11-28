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
public class Ejercicio_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;
        
        System.out.print("Escribe la nota: ");
        nota = sc.nextInt();
        
        switch(nota){
            case 0,1,2,3,4 -> System.out.println("Insuficiente");
            case 5 -> System.out.println("Suficiente");
            case 6 -> System.out.println("Bien");
            case 7,8 -> System.out.println("Notable");
            case 9,10 -> System.out.println("Sobresaliente");
        }
        
    }
    
}
