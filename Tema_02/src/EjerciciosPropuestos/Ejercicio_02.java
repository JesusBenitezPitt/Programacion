package EjerciciosPropuestos;

import java.util.Scanner;

public class Ejercicio_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        boolean comprobarPositivo;

        System.out.print("Escribe un numero: ");
        num = sc.nextInt();

        sc.close();

        comprobarPositivo = num >= 0;

        System.out.println("El numero es positivo: " + comprobarPositivo);
    }
}
