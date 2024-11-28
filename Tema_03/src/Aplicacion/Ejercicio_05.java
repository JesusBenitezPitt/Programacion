/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aplicacion;

/**
 *
 * @author usuario
 */
import java.util.Scanner;

public class Ejercicio_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número de filas para el Triángulo de Pascal: ");
        int filas = sc.nextInt();

        //Calcula las lineas del triangulo
        for (int i = 0; i < filas; i++) {
            //Crea los espacios para formar el triangulo.
            for (int k = filas; k > i; k--){
                System.out.print(" ");
            }
            
            //Calcula las columnas del triangulo
            for (int j = 0; j <= i; j++) {
                long factorialN = 1, factorialM = 1, factorialNM = 1;

                //Realiza el factorial de N dependiendo de cuantas filas tenga.
                for (int n = 1; n <= i; n++) {
                    factorialN *= n;
                }

                //Realiza el factorial de M dependiendo de cuantas filas tenga.
                for (int m = 1; m <= j; m++) {
                    factorialM *= m;
                }

                //Realiza el factorial de N-M dependiendo de cuantas filas tenga.
                for (int nm = 1; nm <= (i - j); nm++) {
                    factorialNM *= nm;
                }

                //Calcula el numero para meter en el triangulo.
                long coeficiente = factorialN / (factorialM * factorialNM);

                System.out.print(coeficiente + " ");
            }
            System.out.println();
        }
    }
}
