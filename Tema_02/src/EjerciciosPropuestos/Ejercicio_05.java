/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosPropuestos;

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
        int aforoMax, entradasVendidas;
        double precioEntrada;
        
        System.out.print("Introduce el aforo maximo: ");
        aforoMax = sc.nextInt();
        
        System.out.print("Introduce el numero de entradas vendidas: ");
        entradasVendidas = sc.nextInt();
        
        System.out.print("Introduce el precio de las entradas: ");
        precioEntrada = sc.nextInt();
        
        if(entradasVendidas == aforoMax){
            System.out.println("Aforo lleno.");
        } else if(entradasVendidas < (aforoMax * 0.20)){
            System.out.println("Concierto cancelado.");
        } else if(entradasVendidas < (aforoMax * 0.50)){
            precioEntrada = precioEntrada - (precioEntrada * 0.25);
            System.out.println("Las entradas han sido rebajadas un 25%, ahora estan en: " + precioEntrada);
        }
        
    }
    
}
