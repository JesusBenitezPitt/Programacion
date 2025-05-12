/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_Clase.Libro;

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
       Scanner sc = new Scanner(System.in);
       ListaLibro listaLibro = new ListaLibro();
       int op;
       do{
           System.out.println("1. Dar de alta un libro por ID.");
           System.out.println("2. Dar de baja un libro por ID.");
           System.out.println("3. Ordenar por Autores y Titulos.");
           System.out.println("4. Modificar el titulo de un libro por ID.");
           System.out.println("5. Salir y guardar.");
           System.out.print("Elije una opcion: ");
           op = sc.nextInt();
           switch(op){
               case 1 -> {
                   System.out.print("Escribe el id: ");
                   int id = sc.nextInt();
                   listaLibro.altaLibroPorID(id);
               }
               case 2 -> {
                   System.out.print("Escribe el id: ");
                   int id = sc.nextInt();
                   listaLibro.bajaLibroPorID(id);
               }
               case 3 -> {
                   listaLibro.ordenarAutorYTitulo(listaLibro.lista);
               }
               case 4 -> {
                   System.out.print("Escribe el id: ");
                   int id = sc.nextInt();
                   listaLibro.modificarLibroPorID(id);
               }
               case 5 -> {
                   listaLibro.guardarListaEnArchivo();
                   System.out.println("Guardando...");
                   System.out.println("Saliendo...");
               }
           }
       }while(op != 5);
    }
    
}
