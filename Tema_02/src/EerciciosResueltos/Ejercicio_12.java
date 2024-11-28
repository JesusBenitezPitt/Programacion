/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EerciciosResueltos;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, año;
        boolean valida = false;
        
        System.out.print("Introduce el dia: ");
        dia = sc.nextInt();
        
        System.out.print("Introduce el mes: ");
        mes = sc.nextInt();
        
        System.out.print("Introduce el año: ");
        año = sc.nextInt();
        
        if (año == 0){
            valida = false;
        } else if (mes == 2 && (dia >= 0 && dia <= 28)){
            valida = true;
        } else if((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia >= 0 && dia <=31)){
            valida = true;
        } else if((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia >= 0 && dia <=30)){
            valida = true;
        }
        
        if(valida){
            System.out.println("La fecha es valida.");
        } else {
            System.out.println("La fecha no es valida.");
        }
    }
    
}
