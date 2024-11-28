package EjerciciosPropuestos;

import java.util.Scanner;

public class Ejercicio_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        boolean comprobarMultiplo;

        System.out.print("Introduce el primer numero: ");
        num1 = sc.nextInt();

        System.out.print("Introduce el segundo numero: ");
        num2 = sc.nextInt();

        sc.close();

        comprobarMultiplo = (num1 % num2) == 0;

        System.out.println("El primer numero es multiplo del segundo: " + comprobarMultiplo);

    }
}
