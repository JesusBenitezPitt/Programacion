/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ampliacion;

/**
 *
 * @author usuario
 */
public class EJ2 {

    /**
     * Genera y muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) separados por espacios.
     * Muestra también el máximo, el mínimo y la media de esos números.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int max = 99, min = 200, nums = 0, cont = 0;
        double media;
        while(cont != 50){
            int num = (int) ((Math.random()*199)+1);
            if(num >= 100){
                cont++;
                if(num < min){
                    min = num;
                }
                if(num > max){
                    max = num;
                }
                System.out.print(num + " ");
                nums+=num;
            }
        }
        System.out.println("\nNumero maximo: " + max);
        System.out.println("Numero minimo: " + min);
        media = nums/50;
        System.out.println("Media de todos los numeros: " + media);
    }
    
}
