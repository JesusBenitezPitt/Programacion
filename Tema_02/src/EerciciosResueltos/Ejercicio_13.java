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
public class Ejercicio_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horas, minutos, segundos;
        
        System.out.print("Introduce las horas: ");
        horas = sc.nextInt();
        
        System.out.print("Introduce los minutos: ");
        minutos = sc.nextInt();
        
        System.out.print("Introduce los segundos: ");
        segundos = sc.nextInt();
        
        segundos++;
        
        if(segundos > 59){
            segundos = 0;
            minutos++;
            if(minutos > 59){
                minutos = 0;
                horas++;
                if(horas > 23){
                    horas = 0;
                }
            }
        }
        
        System.out.println("La hora introducida + 1 segundo es: " + horas + ":" + minutos + ":" + segundos);
        
    }
    
}
