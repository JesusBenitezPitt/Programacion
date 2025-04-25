/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_Ampliacion.Ejercicio_31;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio_31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String archivo_clientes = "src/Ejercicios_Ampliacion/Ejercicio_31/clientes.txt";
        Scanner sc = new Scanner(System.in);
        List<Cliente> clientes = new ArrayList<>();
        ListaClientes lista_clientes = new ListaClientes(clientes);
        if(lista_clientes.cargarClientes(archivo_clientes, clientes)){
            System.out.println("Clientes cargados.");
        }
        int op = 0;
        while(op != 4){
            System.out.println("-----Gestion de clientes-----");
            System.out.println("1. Alta cliente");
            System.out.println("2. Baja cliente");
            System.out.println("3. Listar clientes");
            System.out.println("4. Salir");
            System.out.println();
            System.out.print("Elige una opcion: ");
            op = sc.nextInt();
            switch(op){
                case 1 -> lista_clientes.altaCliente(sc, clientes);
                case 2 -> lista_clientes.bajaCliente(sc, clientes);
                case 3 -> lista_clientes.listarClientes(clientes);
                case 4 -> {
                    lista_clientes.guardarClientes(clientes, archivo_clientes);
                    System.out.println("Saliendo...");
                }
            }
        }
    }
}