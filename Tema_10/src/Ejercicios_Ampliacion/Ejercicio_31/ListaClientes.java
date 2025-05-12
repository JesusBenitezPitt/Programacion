/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Ampliacion.Ejercicio_31;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ListaClientes {
    protected List<Cliente> clientes = new ArrayList<>();
    
    public ListaClientes (List<Cliente> clientes){
        this.clientes = clientes;
    }
    
    public void bajaCliente(Scanner sc, List<Cliente> lista){
        System.out.print("Introduce el DNI del cliente: ");
        String DNI = sc.next();
        Cliente cliente_a_eliminar = null;
        for(Cliente c : lista){
            if(c.DNI.equals(DNI)){
                cliente_a_eliminar = c;
            }
        }
        lista.remove(cliente_a_eliminar);
        System.out.println("Cliente dado de baja.");
        Collections.sort(lista);
    }
    
    public void altaCliente(Scanner sc, List<Cliente> lista){
        String DNI = "";
        boolean DNI_existente;
        do{
            DNI_existente = false;
            System.out.print("Introduce el DNI del cliente: ");
            DNI = sc.next();
            if(comprobarDNI(DNI, lista)){
                System.err.println("El DNI ya existe.");
                DNI_existente = true;
            }
        }while(DNI_existente);
        System.out.print("Introduce el nombre del cliente: ");
        String nombre = sc.next();
        System.out.print("Introduce la fecha de nacimiento del cliente: ");
        String fecha_nacimiento = sc.next();
        System.out.print("Introduce el saldo del cliente: ");
        String saldo = sc.next();
        lista.add(new Cliente(DNI, nombre, fecha_nacimiento, saldo));
        Collections.sort(lista);
    }
    
    public void listarClientes(List<Cliente> lista){
        System.out.println();
        for(Cliente c : lista){
            System.out.println(c);
        }
        
        Comparator<Cliente> ordenar_sueldo = (c1, c2) -> Double.compare(c1.saldo, c2.saldo);
        Collections.sort(lista, ordenar_sueldo);
        System.out.println("Sueldo maximo: " + lista.getFirst().saldo + "€");
        System.out.println("Sueldo minimo: " + lista.getLast().saldo + "€");
        double total_sueldos = 0.00;
        for(Cliente c : lista){
            total_sueldos += c.saldo;
        }
        double saldo_promedio = total_sueldos / lista.size();
        System.out.println("Saldo promedio: " + saldo_promedio + "€");
        System.out.println();
        
    }
    
    public boolean cargarClientes(String archivo, List<Cliente> lista){
        boolean clientes_cargados = false;
        try(BufferedReader lector = new BufferedReader(new FileReader(archivo))){
            String linea = lector.readLine();
            while(linea != null){
                String[] datos = linea.split(";");
                lista.add(new Cliente(datos[0], datos[1], datos[2], datos[3]));
                linea = lector.readLine();
            }
            clientes_cargados = true;
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        return clientes_cargados;
    }
    
    public void guardarClientes(List<Cliente> lista, String archivo){
        try(BufferedWriter escritor = new BufferedWriter(new FileWriter(archivo))){
            for(Cliente c : lista){
                escritor.write(c.DNI + ";"  + c.nombre_completo + ";" + c.fecha_nacimiento + ";" + c.saldo);
                escritor.newLine();
            }
            System.out.println("Clientes guardados en el archivo clientes.txt");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    private boolean comprobarDNI(String DNI, List<Cliente> lista) {
        for (Cliente c : lista) {
            if (c.DNI.equals(DNI)) {
                return true;
            }
        }
        return false;
    }
    
}
