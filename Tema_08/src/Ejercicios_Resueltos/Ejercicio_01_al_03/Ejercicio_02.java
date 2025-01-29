/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Resueltos.Ejercicio_01_al_03;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio_02 {
    public static void main(String[] args) {
        HoraExacta r = new HoraExacta(10, 30, 55);
        System.out.println(r);
        
        for(int i = 0; i <= 61; i++){
            r.inc();
        }
        
        System.out.println(r);
        System.out.print("Introduce unos segundos: ");
        int segundos = new Scanner(System.in).nextInt();
        if(r.setSegundos(segundos)){
            System.out.println(r);
        } else {
            System.out.println("No ha sido posible cambiar los segundos.");
        }
    }
}
