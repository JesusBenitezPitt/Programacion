package EerciciosResueltos;

import java.util.Scanner;

public class Ejercicio_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num;

        System.out.print("Escribe un numero: ");
        num = sc.nextInt();

        sc.close();

        if (num > -1 || num < 1 || num != 0){
            System.out.println("El numero es casi-cero");
        } else { 
            System.out.println("El numero no es casi-cero");
        }

    }
}
