package Ejercicios_Aplicacion.Ejercicio_20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaCliente implements Serializable {
    private static final long serialVersionUID = 1L;
    protected String archivo = "src/Ejercicios_Aplicacion/Ejercicio_20/clientes.dat";
    protected List<Cliente> clientes = new ArrayList<>();
    
    public ListaCliente(){
        cargarClientes();
    }

    private void cargarClientes() {
        try (ObjectInputStream lector = new ObjectInputStream(new FileInputStream(archivo))){
            clientes = (List<Cliente>) lector.readObject();
            System.out.println("Clientes cargados.");
        } catch(IOException | ClassNotFoundException e){
            e.getMessage();
        }
    }
    
    public void nuevoCliente(Scanner sc){
        System.out.print("Introduce el nombre del cliente: ");
        String nombre = sc.next();
        System.out.print("Introduce el numero de telefono del cliente: ");
        String telefono = sc.next();
        int id = clientes.size() + 1;
        clientes.add(new Cliente(id, nombre, telefono));
        System.out.println("Cliente anadido");
    }
    
    public void modificarDatos(Scanner sc){
        Cliente cliente_a_modificar = null;
        System.out.print("Introduce el ID del cliente que quieres modificar: ");
        int id = sc.nextInt();
        for(Cliente c : clientes){
            if(c.getId() == id){
                cliente_a_modificar = c;
            }
        }
        if(cliente_a_modificar == null){
            System.out.println("El cliente con ID: " + id + " no se ha encontrado");
        } else {
            System.out.print("Introduce el nuevo nombre del cliente: ");
            String nombre = sc.next();
            System.out.print("Introduce el nuevo numero de telefono del cliente: ");
            String telefono = sc.next();
            cliente_a_modificar.setNombre(nombre);
            cliente_a_modificar.setTelefono(telefono);
            System.out.println("Cliente " + cliente_a_modificar.getId() + " actualizado.");
        }
    }
    
    public void bajaCliente(Scanner sc){
        Cliente cliente_baja = null;
        System.out.print("Introduce el ID del cliente que quieres dar de baja: ");
        int id = sc.nextInt();
        for(Cliente c : clientes){
            if(c.getId() == id){
                cliente_baja = c;
            }
        }
        if(cliente_baja == null){
            System.out.println("El cliente con ID: " + id + " no se ha encontrado");
        } else {
            clientes.remove(cliente_baja);
            System.out.println("Cliente dado de baja.");
        }
    }
    
    public void mostrarClientes(){
        System.out.println("-----Lista de clientes-----");
        for(Cliente c : clientes){
            System.out.println("(" + c + ")");
        }
    }
    
    public void guardarCambios(){
        try(ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(archivo))){
            escritor.writeObject(clientes);
            System.out.println("Clientes guardados en " + archivo);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
