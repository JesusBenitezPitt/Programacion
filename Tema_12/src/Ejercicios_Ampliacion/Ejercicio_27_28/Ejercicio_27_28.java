/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_Ampliacion.Ejercicio_27_28;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio_27_28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(leerCadena());
        System.out.println(uneCadenas(leerCadena(), leerCadena()));
    }
    
    // Ejercicio 27
    public static List<Character> leerCadena() {
        List<Character> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una cadena: ");
        String cad = sc.nextLine();
        for(Character c : cad.toCharArray()){
            lista.add(c);
        }
        return lista;
    }
    
    // Ejercicio 28
    public static List<Character> uneCadenas(List<Character> cad1, List<Character> cad2){
        List<Character> lista = new ArrayList<>();
        lista.addAll(cad1);
        lista.addAll(cad2);
        return lista;
    }
    
}
