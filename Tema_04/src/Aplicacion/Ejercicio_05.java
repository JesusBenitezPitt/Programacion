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
public class Ejercicio_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora1, minuto1, hora2, minuto2;
        
        System.out.println("La diferencia es de " + diferenciaMin(13, 20, 11, 50) + " minutos");
        
    }
    
    static int diferenciaMin(int hora1, int minuto1, int hora2, int minuto2){
        int minutos1 = (hora1*60) + minuto1;
        int minutos2 = (hora2*60) + minuto2;
        
        return (minutos1 - minutos2);
    }
    
}
