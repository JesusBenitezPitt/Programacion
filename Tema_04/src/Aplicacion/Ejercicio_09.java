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
public class Ejercicio_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, min, max;

        System.out.print("Cuantos numeros quieres que se muestren: ");
        num = sc.nextInt();

        System.out.print("Cual quieres que sea el valor minimo: ");
        min = sc.nextInt();

        System.out.print("Cual quieres que sea el valor maximo: ");
        max = sc.nextInt();

        numerosAleatorios(num, min, max);

        System.out.print("Cuantos numeros quieres que se muestren: ");
        num = sc.nextInt();
        numerosAleatorios(num);

    }

    static void numerosAleatorios(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(Math.random());
        }
    }

    static void numerosAleatorios(int n, int min, int max) {
        int minimo = max;
        int maximo = min;
        int cont = 0;
        while (cont != n) {
            int num = (int) (Math.random() * max + 1);
            if (num >= min) {
                if (num < minimo) {
                    minimo = num;
                }
                if (num > maximo) {
                    maximo = num;
                }
                cont++;
                System.out.println(num);
            }
        }
        System.out.println("Valor minimo: " + minimo);
        System.out.println("Valor maximo: " + maximo);
    }

}
