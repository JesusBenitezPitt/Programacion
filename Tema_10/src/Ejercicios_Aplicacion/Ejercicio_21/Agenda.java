/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Aplicacion.Ejercicio_21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Agenda {
    protected List<String> contactos = new ArrayList<>();
    
    public Agenda(List<String> contactos){
        this.contactos = contactos;
    }
    
    public void cargarContactos(String agenda, List<String> contactos) {
        try(BufferedReader lector = new BufferedReader(new FileReader(agenda))){
            String linea = lector.readLine();
            while(linea != null){
                contactos.add(linea);
                linea = lector.readLine();
            }
        }catch(IOException e){
            e.getMessage();
        }
    }
    
    public void mostrarTodos(List<String> contactos) {
        Collections.sort(contactos);
        System.out.println("\nTodos los contactos:");
        for(String c : contactos){
            String[] datos = c.split(";");
            System.out.println("Nombre: " + datos[0] + ", Telefono: " + datos[1]);
        }
        System.out.println();
    }
    
    public void buscarPorNombre(List<String> contactos, Scanner sc){
        String nombre;
        do{
            System.out.print("Introduce el nombre: ");
            nombre = sc.next();
            if(!comprobarNombre(nombre, contactos)){
                System.err.println("El nombre no existe, introduce otro.");
            }
        }while(!comprobarNombre(nombre, contactos));
        System.out.println("\nContactos encontrados:");
        for(String c : contactos){
            if(c.toLowerCase().contains(nombre.toLowerCase())){
                String[] datos = c.split(";");
                System.out.println("Nombre: " + datos[0] + ", Telefono: " + datos[1]);
            }
        }
        System.out.println();
    }
    
    public void agregarContacto(List<String> c, Scanner sc, String a){
        if(c.size() == 20){
            System.err.println("La agenda esta llena, elimina algun contacto para agregar otro.");
        } else {
            String nombre, telefono;
            do{
                System.out.print("Introduce el nombre: ");
                nombre = sc.next();
                if(comprobarNombre(nombre, c)){
                    System.err.println("El nombre ya existe.");
                }
            }while(comprobarNombre(nombre, c));
            System.out.print("Introduce el numero de telefono: ");
            telefono = sc.next();
            c.add(nombre + ";" + telefono);
        }
        guardarContactos(c, a);
    }
    
     public void guardarContactos(List<String> c, String a){
         try(BufferedWriter escritor = new BufferedWriter(new FileWriter(a))){
             for(String c2 : c){
                 escritor.write(c2);
                 escritor.newLine();
             }
         }catch(IOException e){
             e.getMessage();
         }
     }
    
    private boolean comprobarNombre(String nombre, List<String> c) {
        boolean nombre_existente = false;
        for(String c2 : c){
                if(c2.toLowerCase().contains(nombre.toLowerCase())){
                    nombre_existente = true;
                }
            }
        return nombre_existente;
    }
}
