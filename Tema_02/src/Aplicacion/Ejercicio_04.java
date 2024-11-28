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
        int num, resto;
        String mostrar = "", mostrar2 = "";
        
        System.out.print("Escribe un numero entre el 1 y el 99: ");
        num = sc.nextInt();
        
        if(num >= 1 && num <= 99){
            if(num >= 10 && num <= 19){
                switch(num){
                    case 10 -> System.out.println("diez");
                    case 11 -> System.out.println("once");
                    case 12 -> System.out.println("doce");
                    case 13 -> System.out.println("trece");
                    case 14 -> System.out.println("catorce");
                    case 15 -> System.out.println("quince");
                    case 16 -> System.out.println("dieciseis");
                    case 17 -> System.out.println("diecisiete");
                    case 18 -> System.out.println("dieciocho");
                    case 19 -> System.out.println("diecinueve");
                
                }
            } else if(num >= 21 && num <=29){
                switch(num){
                    case 21 -> System.out.println("veintiuno");
                    case 22 -> System.out.println("venitidos");
                    case 23 -> System.out.println("veintitres");
                    case 24 -> System.out.println("veinticuatro");
                    case 25 -> System.out.println("veinticinco");
                    case 26 -> System.out.println("veintiseis");
                    case 27 -> System.out.println("veintisiete");
                    case 28 -> System.out.println("veintiocho");
                    case 29 -> System.out.println("veintinueve");
                
                }
            } else {
                resto = num%10;
        
                num = num/10;
                
                switch(num){
                    case 2 -> mostrar = "veinte";
                    case 3 -> mostrar = "treinta";
                    case 4 -> mostrar = "cuarenta";
                    case 5 -> mostrar = "cincuenta";
                    case 6 -> mostrar = "sesenta";
                    case 7 -> mostrar = "setenta";
                    case 8 -> mostrar = "ochenta";
                    case 9 -> mostrar = "noventa";
                }
        
                switch(resto){
                    case 1 -> mostrar2 = "uno";
                    case 2 -> mostrar2 = "dos";
                    case 3 -> mostrar2 = "tres";
                    case 4 -> mostrar2 = "cuatro";
                    case 5 -> mostrar2 = "cinco";
                    case 6 -> mostrar2 = "seis";
                    case 7 -> mostrar2 = "siete";
                    case 8 -> mostrar2 = "ocho";
                    case 9 -> mostrar2 = "nueve";
                }
                
                if(resto == 0){
                    System.out.println(mostrar);
                } else if (num == 0){
                    System.out.println(mostrar2);
                } else {
                    System.out.println(mostrar + " y " + mostrar2);
                }
                
            }
        } else {
            System.out.println("El numero no esta comprendido en el rango.");
        }
        
    }
    
}
