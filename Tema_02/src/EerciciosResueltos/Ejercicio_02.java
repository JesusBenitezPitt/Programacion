package EerciciosResueltos;

import java.util.Scanner;

public class Ejercicio_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.print("Escribe el primer numero: ");
        num1 = sc.nextInt();

        System.out.print("Escribe el segundo numero: ");
        num2 = sc.nextInt();

        sc.close();
        
        if (num1 == num2){
            System.out.print("Son iguales");
        } else {
            System.out.print("Son distintos");
        }

    }
}
