/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_Propuestos.Ejercicio5;

import java.util.Comparator;
import java.util.TreeSet;

/**
 *
 * @author usuario
 */
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TreeSet<Cliente> conjuntoClientes = new TreeSet<>();
        conjuntoClientes.add(new Cliente("111", "Marta", "12/02/2000"));
        conjuntoClientes.add(new Cliente("115", "Jorge", "16/03/1999"));
        conjuntoClientes.add(new Cliente("112", "Carlos", "01/10/2002"));
        System.out.println(conjuntoClientes);
        
        Comparator<Cliente> comparadorNombre= (c1, c2) -> c1.nombre.compareTo(c2.nombre);
        TreeSet<Cliente> conjuntoClientesOrdenadosNombre = new TreeSet<>(comparadorNombre);
        conjuntoClientesOrdenadosNombre.addAll(conjuntoClientes);
        System.out.println(conjuntoClientesOrdenadosNombre);
        
        Comparator<Cliente> comparadorEdad = (c1, c2) -> c1.edad - c2.edad;
        TreeSet<Cliente> conjuntoClientesOrdenadosEdad = new TreeSet<>(comparadorEdad);
        conjuntoClientesOrdenadosEdad.addAll(conjuntoClientes);
        System.out.println(conjuntoClientesOrdenadosEdad);
    }
    
}
