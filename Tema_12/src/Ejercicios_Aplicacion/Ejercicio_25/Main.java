/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_Aplicacion.Ejercicio_25;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MapaSocios map = new MapaSocios();
        int op;
        do{
            System.out.println("1. Alta socio.");
            System.out.println("2. Baja socio.");
            System.out.println("3. Modificacion socio.");
            System.out.println("4. Listar socios por apodo.");
            System.out.println("5. Listar socios por antiguedad.");
            System.out.println("6. Listar socios con alta anterior a un año determinado.");
            System.out.println("7. Salir.");
            System.out.print("Introduce una opcion: ");
            op = new Scanner(System.in).nextInt();
            
            switch(op){
                case 1 -> map.altaSocio();
                case 2 -> map.bajaSocio();
                case 3 -> map.modificacionSocio();
                case 4 -> map.listarPorApodos();
                case 5 -> map.listarPorAntiguedad();
                case 6 -> map.listarPorAltaAnteriorAUnAnoDeterminado();
                case 7 -> map.guardarCambios();
            }
        }while(op != 7);
    }
    
}
