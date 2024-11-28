package Aplicacion;

import java.util.Scanner;

public class Ejercicio_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, mil, cent, dec, uni;
        boolean capicua = false;

        System.out.print("Escribe un numero entre el 0 y el 9999: ");
        num = sc.nextInt();

        if (num < 0 || num > 9999){
            System.out.println("El numero esta fuera del rango");
        } else if (num < 10){
            capicua = true;
        } else if (num < 100){
            dec = num / 10;
            uni = num % 10;
            if (dec == uni){
                capicua = true;
            }
        } else if (num < 1000){
            cent = num / 100;
            uni = num % 10;
            if (cent == uni){
                capicua = true;
            }
        } else {
            mil = num / 1000;
            cent = (num / 100) % 10;
            dec = (num / 10) % 10;
            uni = num % 10;
            if (mil == uni && cent == dec){
                capicua = true;
            }
        }
        
        if(capicua){
            System.out.println("El numero " + num + " es capicua.");
        } else {
            System.out.println("El numero " + num + " no es capicua.");
        }
    }
}
