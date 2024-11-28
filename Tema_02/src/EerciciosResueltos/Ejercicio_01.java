package EerciciosResueltos;

import java.util.Scanner;

public class Ejercicio_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Escribe un numero: ");
        num = sc.nextInt();

        sc.close();

        if ((num % 2) == 0){
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }

    }
}
