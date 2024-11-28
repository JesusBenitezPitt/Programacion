/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosResueltos;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("¿Esta lloviendo? (true/false): ");
        boolean llueve = sc.nextBoolean();
        
        System.out.print("¿Has finalizado la tarea? (true/false): ");
        boolean tarea = sc.nextBoolean();
        
        System.out.print("¿Necesitas ir a la biblioteca? (true/false): ");
        boolean biblioteca = sc.nextBoolean();

        sc.close();
        
        boolean comprobarSalir = !llueve && tarea || biblioteca;
        
        System.out.println("¿Puedes salir a la calle?: " + comprobarSalir);
    }
    
}
