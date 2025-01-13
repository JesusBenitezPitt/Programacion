/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_Aplicacion;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] agenda = new String[0];
        String op;
        do{
            System.out.println("a) Añadir nuevo contacto.");
            System.out.println("b) Buscar telefono a partir de su nombre.");
            System.out.println("c) Mostrar informacion de todos los contactos ordenados alfabeticamente mediante el nombre.");
            System.out.println("d) Salir.");
            System.out.print("Elige una opcion: ");
            op = sc.next();

            switch(op) {
                case "a" -> {
                    agenda = añadirContacto(agenda, sc);
                }
                case "b" -> {
                    buscarTelefono(agenda, sc);
                }
                case "c" -> {
                    mostrarInformacion(agenda);
                }
            }
        }while(!op.equals("d"));
    }

    private static String[] añadirContacto(String[] agenda, Scanner sc) {
        System.out.println("Añadiendo nuevo contacto.");
        boolean duplicado;
        do{
            duplicado = false;
            System.out.print("Introduce un nombre: ");
            String nombre = sc.next();
            System.out.print("Introduce el telefono: ");
            String telefono = sc.next();
            if(agenda.length == 0){
                agenda = Arrays.copyOf(agenda, agenda.length+1);
                agenda[agenda.length-1] = nombre + ":" + telefono;
            } else {
                for(int i = 0; i < agenda.length && !duplicado; i++){
                    if(agenda[i].equals(nombre + ":" + telefono)){
                        duplicado = true;
                    }
                }
                if(duplicado){
                    System.out.println("Este contacto ya esta registrado.");
                } else {
                    agenda = Arrays.copyOf(agenda, agenda.length+1);
                        agenda[agenda.length-1] = nombre + ":" + telefono;
                        System.out.println("Contacto añadido.");
                }
            }
        }while(duplicado);
        return agenda;
    }

    private static void buscarTelefono(String[] agenda, Scanner sc) {
        boolean existe = false;
        System.out.print("Introduce el nombre del contacto: ");
        String nombre = sc.next();
        int pos = 0;
        for(int i = 0; i < agenda.length && !existe; i++){
            if(agenda[i].contains(nombre)){
                existe = true;
                pos = i;
            }
        }
        
        if(!existe){
            System.out.println("El contacto no existe.");
        } else {
            String[] contacto = agenda[pos].split(":");
            String telefono = contacto[1];
            System.out.println("El telefono del contacto " + nombre + " es:" + telefono);
        }
    }

    private static void mostrarInformacion(String[] agenda) {
        if(agenda.length == 0){
            System.out.println("La agenda esta vacia.");
        } else {
            Arrays.sort(agenda);
            for(int i = 0; i < agenda.length; i++){
                String[] contacto = agenda[i].split(":");
                String nombre = contacto[0];
                String telefono = contacto[1];
                System.out.println("Contacto " + (i+1));
                System.out.println("Nombre: " + nombre + " - Telefono: " + telefono + ".");
            }
        }
    }
    
}
