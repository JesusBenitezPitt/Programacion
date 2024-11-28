package Aplicación;

import java.util.Scanner;

public class Ejercicio_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Base imponible: ");
        double base = sc.nextDouble();
        
        System.out.print("IVA a aplicar: ");
        double iva = sc.nextDouble();

        sc.close();
        
        double importe = (base * (iva/100));
        System.out.println("El importe a aplicar es de: " + importe + "€");
        
        double total = base + importe;
        System.out.println("El total es: " + total + "€");
        
    }
    
}
