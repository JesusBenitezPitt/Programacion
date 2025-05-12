/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Clase.Libro;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ListaLibro {
    protected List<Libro> lista = new ArrayList<>();
    protected String archivo = "src/Ejercicios_Clase/Libro/libros.dat";
    
    public ListaLibro (){
        cargarLibros();
    }
    
    private void cargarLibros(){
        try(ObjectInputStream lector = new ObjectInputStream(new FileInputStream(archivo))){
            lista = (List<Libro>) lector.readObject();
            System.out.println("Libros cargados.");
        } catch(IOException | ClassNotFoundException e){
            e.getMessage();
        }
    }
    
    public void altaLibroPorID (int ID){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el titulo: ");
        String titulo = sc.nextLine();
        System.out.print("Introduce el autor: ");
        String autor = sc.nextLine();
        
        lista.add(new Libro(ID, titulo, autor));
    }
    
    public void bajaLibroPorID (int ID){
        Libro libro = null;
        for(Libro l : lista){
            if(l.getId() == ID){
                libro = l;
                break;
            }
        }
        lista.remove(libro);
    }
    
    //Modificar Titulo por ID del libro
    public void modificarLibroPorID (int ID){
        Scanner sc = new Scanner(System.in);
        boolean encontrado = false;
        Libro libro;
        for(Libro l : lista){
            if(l.getId() == ID){
                libro = l;
                encontrado = true;
                System.out.print("Introduce el nuevo titulo: ");
                libro.setTitulo(sc.nextLine());
                System.out.println("Titulo cambiado.");
                break;
            }
        }
        if(!encontrado){
            System.out.println("No se ha encontrado el libro.");
        }
    }
    
    public void ordenarAutorYTitulo(List<Libro> lista){
       Comparator<Libro> comparadorAutorYTitulo = (Libro l1, Libro l2) -> {
       int resultado = l1.autor.compareTo(l2.autor);
       if(resultado == 0){
           resultado = l1.titulo.compareTo(l2.titulo);
       }
       return resultado;
       };
       
       Collections.sort(lista, comparadorAutorYTitulo);
       for(Libro l : lista){
           System.out.println(l);
       }
    }
    
    public void guardarListaEnArchivo(){
        try(ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(archivo))){
            escritor.writeObject(lista);
            System.out.println("Cambios guardados.");
        }catch (Exception e){
            e.getMessage();
        }
    }
    
}
