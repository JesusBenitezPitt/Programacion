package Ejercicios_Aplicacion.Ejercicio_22;

import java.util.Scanner;

public class Ejercicio_22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaEmpleado empleados = new ListaEmpleado();
        int op = 0;
        while(op != 5){
            System.out.println("1. Anadir nuevo empleado.");
            System.out.println("2. Dar de baja a un empleado.");
            System.out.println("3. Mostrar datos de un empleado.");
            System.out.println("4. Listar clientes.");
            System.out.println("5. Salir.");
            System.out.print("Elige una opcion: ");
            op = sc.nextInt();
            
            switch(op){
                case 1 -> empleados.nuevoEmpleado(sc);
                case 2 -> empleados.bajaEmpleado(sc);
                case 3 -> empleados.mostrarDatosEmpleado(sc);
                case 4 -> empleados.mostrarEmpleados();
                case 5 -> {
                    empleados.guardarCambios();
                    System.out.println("Guardando cambios...");
                    System.out.println("Saliendo...");
                }
            }
        }
    }
    
}
