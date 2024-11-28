/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clase;

/**
 *
 * @author usuario
 */
public class Ejercicio_03 {

    /**
     * @param args the command line arguments
     */
    /*
    3º Simular tirada de 2 dados.
        Numeros del 1 a 6.
        Termina cuando los dos dados son iguales.
     */
    public static void main(String[] args) {
        int dado1, dado2, tirada = 1;
        do {
            dado1 = (int) (Math.random()*6)+1;
            dado2 = (int) (Math.random()*6)+1;
            System.out.println("\nTirada " + tirada);
            System.out.println("Dado 1: " + dado1);
            System.out.println("Dado 2: " + dado2);
            tirada++;
        } while (dado1 != dado2);
        System.out.println("Los dos dados son iguales!");
    }

}
