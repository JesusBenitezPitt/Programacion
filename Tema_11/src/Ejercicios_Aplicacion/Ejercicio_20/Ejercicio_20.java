package Ejercicios_Aplicacion.Ejercicio_20;

import java.util.Scanner;

public class Ejercicio_20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaCliente clientes = new ListaCliente();
        int op = 0;
        while(op != 5){
            System.out.println("1. Anadir nuevo cliente.");
            System.out.println("2. Modificar datos.");
            System.out.println("3. Dar de baja a un cliente.");
            System.out.println("4. Listar clientes.");
            System.out.println("5. Salir.");
            System.out.print("Elige una opcion: ");
            op = sc.nextInt();
            
            switch(op){
                case 1 -> clientes.nuevoCliente(sc);
                case 2 -> clientes.modificarDatos(sc);
                case 3 -> clientes.bajaCliente(sc);
                case 4 -> clientes.mostrarClientes();
                case 5 -> {
                    clientes.guardarCambios();
                    System.out.println("Guardando cambios...");
                    System.out.println("Saliendo...");
                }
            }
        }
    }
    
}
