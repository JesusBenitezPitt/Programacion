/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aplicacion;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int comidaDiaria, numAnimales, kilosPorAnimal;
        
        System.out.print("Introduce la cantidad de comida diaria: ");
        comidaDiaria = sc.nextInt();
        
        System.out.print("Introduce la cantidad de animales: ");
        numAnimales = sc.nextInt();
        
        System.out.print("Introduce la cantidad de kilos que comen por animal: ");
        kilosPorAnimal = sc.nextInt();
        
        if(comidaDiaria == 0 || kilosPorAnimal == 0 || numAnimales == 0){
            System.out.println("No valido");
        }else if((comidaDiaria / kilosPorAnimal) < numAnimales){
            if((comidaDiaria / numAnimales) < 1){
                System.out.println("No hay comida suficiente");
            } else {
                System.out.println("A cada animal le corresponden: " + (comidaDiaria / numAnimales) + "Kg.");
            }
        } else {
            System.out.println("Todo esta bien.");
        }
        
    }
    
}
