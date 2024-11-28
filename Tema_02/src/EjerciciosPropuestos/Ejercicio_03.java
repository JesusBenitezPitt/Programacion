package EjerciciosPropuestos;

import java.util.Scanner;

public class Ejercicio_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        boolean comprobarDistinto;

        System.out.print("Introduce el primer numero: ");
        num1 = sc.nextInt();

        System.out.print("Introduce el segundo numero: ");
        num2 = sc.nextInt();

        sc.close();

        comprobarDistinto = num1 != num2 || num1 == 0 || num2 == 0;

        System.out.println("Los numeros son distintos o alguno es igual a 0: " + comprobarDistinto);

    }
}
