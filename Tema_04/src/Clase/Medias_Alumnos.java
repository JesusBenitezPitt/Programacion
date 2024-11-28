/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clase;

import java.util.Scanner;

/**
 *
 * @author usuario
 */

/*
Escribe una funcion que recibe como parametro el numero de alumnos
que hay en una clase, dentro de la funcion, se generaran aleatoriamente, segun el numero de alumnos, 
el mismo numero de notas y calcular la media y devolverla para visualizarla desde el main.
*/
public class Medias_Alumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alumnos;
        
        System.out.print("Introduce un numero de alumnos: ");
        alumnos = sc.nextInt();
        
        System.out.println(mediaNotasAlumnos(alumnos));
        
    }

    static double mediaNotasAlumnos(int alumnos) {
        int notas = 0;
        double media;
        
        for(int i = 1; i <= alumnos; i++){
            for(int j = 1; j <= alumnos; j++){
                notas += (Math.random()*11);
            }
        }
        
        media = notas/alumnos;
        
        return (media);
        
    }
    
}
