/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_Resueltos.Ejercicio_14;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<Registro> temperaturas = new LinkedHashSet<>();
        int op;
        do{
            System.out.println("1. Nuevo registro.");
            System.out.println("2. Listar registros del dia.");
            System.out.println("3. Mostrar Estadisticas.");
            System.out.println("4. Salir.");
            System.out.print("Introduce una opcion: ");
            op = new Scanner(System.in).nextInt();
            switch(op){
                case 1 -> {
                    System.out.print("Introducir Temperatura: ");
                    double temperatura = new Scanner(System.in).useLocale(Locale.US).nextDouble();
                    temperaturas.add(new Registro(temperatura));
                }
                case 2 -> System.out.println(temperaturas);
                case 3 -> {
                    Comparator<Registro> c = (Registro o1, Registro o2) -> (int) Math.signum(o1.temperatura - o2.temperatura);
                    System.out.println("Maxima: " + Collections.max(temperaturas, c));
                    System.out.println("Minima: " + Collections.min(temperaturas, c));
                    double suma = 0;
                    for(Registro r : temperaturas){
                        suma += r.temperatura;
                    }
                    System.out.println("Media: " + suma / temperaturas.size());
                }
                case 4 -> {
                    System.out.println("Guardando registros...");
                    Registro.guardarRegistros("src/Ejercicios_Resueltos/Ejercicio_14/registros", temperaturas);
                    System.out.println("Saliendo..");
                }
            }
        }while(op != 4);
    }
    
}
