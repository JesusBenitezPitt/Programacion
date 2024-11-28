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
public class Ejercicio_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, año;
        boolean fechavalida = true;
        
        System.out.print("Introduce el dia: ");
        dia = sc.nextInt();
        
        System.out.print("Introduce el mes: ");
        mes = sc.nextInt();
        
        System.out.print("Introduce el año: ");
        año = sc.nextInt();
        
        dia++;
        
        if(año == 0){
            fechavalida = false;
        } else if(mes == 2 && dia > 28){
            dia = 1;
            mes++;
            fechavalida = true;
        } else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 && dia > 31){
            dia = 1;
            mes++;
            fechavalida = true;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11 && dia > 30){
            dia = 1;
            mes++;
            fechavalida = true;
            
        } else if(mes == 12 && dia > 31){
                dia = 1;
                mes = 1;
                año++;
                fechavalida = true;
        }
        
        
        if(fechavalida){
            System.out.println("La fecha de mañana es: " + dia + "/" + mes + "/" + año);
        } else {
            System.out.println("La fecha no es valida.");
        }
        
    }
    
}
