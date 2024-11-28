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
public class Ejercicio_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d, h, m;
        
        System.out.print("Introduce un numero de dias: ");
        d = sc.nextInt();
        
        System.out.print("Introduce un numero de horas: ");
        h = sc.nextInt();
        
        System.out.print("Introduce un numero de minutos: ");
        m = sc.nextInt();
        
        System.out.println("Existen " + calcularSegundos(d, h, m) + " segundos en los datos que has introducido");
        
    }
    
    static int calcularSegundos(int dias, int horas, int min){
        int totalS = (((dias*24)*60)*60) + ((horas*60)*60) + (min*60);
        
        return(totalS);
    }
    
}
