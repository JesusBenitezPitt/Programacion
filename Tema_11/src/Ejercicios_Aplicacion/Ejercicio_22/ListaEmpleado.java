/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Aplicacion.Ejercicio_22;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author vboxuser
 */
public class ListaEmpleado implements Serializable {

    private static final long serialVersionUID = 1L;
    protected String archivo = "src/Ejercicios_Aplicacion/Ejercicio_22/empleados.dat";
    protected List<Empleado> empleados = new ArrayList<>();

    public ListaEmpleado(){
        cargarEmpleados();
    }

    private void cargarEmpleados() {
        try (ObjectInputStream lector = new ObjectInputStream(new FileInputStream(archivo))){
            empleados = (List<Empleado>) lector.readObject();
            System.out.println("Empleados cargados.");
        } catch(IOException | ClassNotFoundException e){
            e.getMessage();
        }
    }
    
    public void nuevoEmpleado(Scanner sc){
        System.out.print("Introduce el DNI del empleado: ");
        String dni = sc.next();
        System.out.print("Introduce el nombre del empleado: ");
        String nombre = sc.next();
        System.out.print("Introduce el saldo del empleado: ");
        double telefono = sc.nextDouble();
        empleados.add(new Empleado(dni, nombre, telefono));
        System.out.println("Cliente anadido");
    }
    
    public void bajaEmpleado(Scanner sc){
        Empleado empleado_baja = null;
        System.out.print("Introduce el DNI del empleado que quieres dar de baja: ");
        String dni = sc.next();
        for(Empleado c : empleados){
            if(c.getDNI().equals(dni)){
                empleado_baja = c;
            }
        }
        if(empleado_baja == null){
            System.out.println("El empleado con DNI: " + dni + " no se ha encontrado");
        } else {
            empleados.remove(empleado_baja);
            System.out.println("Cliente dado de baja.");
        }
    }
    
    public void mostrarDatosEmpleado(Scanner sc){
        Empleado mostrar_empleado = null;
        System.out.print("Introduce el DNI del empleado: ");
        String dni = sc.next();
        for(Empleado e : empleados){
            if(e.getDNI().equals(dni)){
                mostrar_empleado = e;
            }
        }
        if(mostrar_empleado == null){
            System.out.println("El empleado con DNI: " + dni + " no se ha encontrado");
        } else {
            System.out.println("DNI: " + mostrar_empleado.getDNI());
            System.out.println("Nombre: " + mostrar_empleado.getNombre());
            System.out.println("Saldo: " + mostrar_empleado.getSaldo());
        }
    }
    
    public void mostrarEmpleados(){
        System.out.println("-----Lista de empleados-----");
        for(Empleado e : empleados){
            System.out.println("(" + e + ")");
        }
    }
    
    public void guardarCambios(){
        try(ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(archivo))){
            escritor.writeObject(empleados);
            System.out.println("Empleados guardados en " + archivo);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    
}
