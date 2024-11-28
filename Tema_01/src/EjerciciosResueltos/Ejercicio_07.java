/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosResueltos;

import java.util.*;

/**
 *
 * @author usuario
 */
public class Ejercicio_07 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double radio, area, longitud;

        scanner.useLocale(Locale.US);

        System.out.print("Introduce el radio del circulo: ");
        radio = scanner.nextDouble();
        area = Math.PI * Math.pow(radio, 2);
        longitud = 2 * Math.PI * radio;
        
        scanner.close();

        System.out.println("El area del circulo es " + area);
        System.out.println("La longitud del circulo es " + longitud);
    }
}
