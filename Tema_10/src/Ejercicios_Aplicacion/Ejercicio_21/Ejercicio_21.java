/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_Aplicacion.Ejercicio_21;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio_21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String agenda = "src/Ejercicios_Aplicacion/Ejercicio_21/agenda.txt";
        List<String> lista = new ArrayList<>();
        Agenda contactos = new Agenda(lista);
        contactos.cargarContactos(agenda, lista);
        int op = 0;
        while(op != 4){
            System.out.println("------Agenda------");
            System.out.println("1. Nuevo contacto.");
            System.out.println("2. Buscar por nombre.");
            System.out.println("3. Mostrar todos.");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");
            op = sc.nextInt();
            
            switch(op){
                case 1 -> contactos.agregarContacto(lista, sc, agenda);
                case 2 -> contactos.buscarPorNombre(lista, sc);
                case 3 -> contactos.mostrarTodos(lista);
                case 4 -> {
                    contactos.guardarContactos(lista, agenda);
                    System.out.println("Saliendo...");
                }
            }
        }
    }
}
