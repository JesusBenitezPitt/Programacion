/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_Resueltos.Ejercicio_01_al_03;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hora r = new Hora(11, 30);
        System.out.println(r);
        for(int i = 0; i < 61; i++){
            r.inc();
        }
        System.out.println(r);
        System.out.print("Escribe una hora: ");
        int hora = new Scanner(System.in).nextInt();
        boolean cambio = r.setHoras(hora);
        if(cambio){
            System.out.println(r);
        } else {
            System.out.println("La hora no se pudo cambiar.");
        }
    }
    
}
