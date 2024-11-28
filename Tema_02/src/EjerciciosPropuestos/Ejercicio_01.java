package EjerciciosPropuestos;

import java.util.Scanner;

public class Ejercicio_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean mayor, mayorIgual, menor, menorIgual, igual, distinto;
        int num1, num2;

        System.out.print("Escribe el primer numero: ");
        num1 = sc.nextInt();

        System.out.print("Escribe el segundo numero: ");
        num2 = sc.nextInt();

        sc.close();

        mayor = num1 > num2;
        mayorIgual = num1 >= num2;
        menor = num1 < num2;
        menorIgual = num1 <= num2;
        igual = num1 == num2;
        distinto = num1 != num2;

        System.out.println(num1 + " es mayor que " + num2 + ": " + mayor);
        System.out.println(num1 + " es mayor o igual que " + num2 + ": " + mayorIgual);
        System.out.println(num1 + " es menor que " + num2 + ": " + menor);
        System.out.println(num1 + " es menor o igual que " + num2 + ": " + menorIgual);
        System.out.println(num1 + " es igual que " + num2 + ": " + igual);
        System.out.println(num1 + " es distinto que " + num2 + ": " + distinto);

    }
    
}
