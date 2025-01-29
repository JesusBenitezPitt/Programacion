/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Resueltos.Ejercicio_06;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hora h = new Hora();
        int valor;
        System.out.print("Hora: ");
        valor = sc.nextInt();
        h.setHora(valor);
        System.out.print("Minuto: ");
        valor = sc.nextInt();
        h.setMinuto(valor);
        System.out.print("Segundo: ");
        valor = sc.nextInt();
        h.setSegundo(valor);
        System.out.print("Cuanto segundos quieres mostrar: ");
        int numS = sc.nextInt();
        for(int i = 0; i <= numS; i++){
            System.out.println(h.getHora() + ":" + h.getMinuto() + ":" + h.getSegundo());
            h.incrementarSegundo();
        }
    }
}
