/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_Resueltos.Ejercicio_09;

/**
 *
 * @author usuario
 */
public class Ejercicio_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bombilla b1, b2;
        b1 = new Bombilla();
        b2 = new Bombilla();
        b1.encender();
        System.out.println("b1: " + b1.mostrarEstado());
        System.out.println("b2: " + b2.mostrarEstado());
        b2.encender();
        System.out.println("b1: " + b1.mostrarEstado());
        System.out.println("b2: " + b2.mostrarEstado());
        Bombilla.interruptorGeneral = false;
        System.out.println("b1: " + b1.mostrarEstado());
        System.out.println("b2: " + b2.mostrarEstado());
    }
    
}
