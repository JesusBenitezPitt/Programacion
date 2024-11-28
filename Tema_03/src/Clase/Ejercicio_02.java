/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clase;

/**
 *
 * @author usuario
 */
public class Ejercicio_02 {

    /**
     * @param args the command line arguments
     */
    
    /*
    2º Generar aleatoriamente 5 notas de 6 alumnos.
        -> Media notas de cada alumno.
        -> Nota maxima y minima de cada alumno.
        -> Media total.
        -> Nota maxima y minima de la clase.
     */
    public static void main(String[] args) {
        int nota, notas, media, notaMax = 0, notaMin = 10, notasTotal = 0, mediaTotal, notaMaxTotal = 0, notaMinTotal = 10;
        for(int i = 1; i <= 6; i++){
            notas = 0;
            for(int j = 1; j <= 5; j++){
                nota = (int) (Math.random()*11);
                if(nota > notaMax){
                    notaMax = nota;
                }
                if(nota < notaMin){
                    notaMin = nota;
                }
                if(nota > notaMaxTotal){
                    notaMaxTotal = nota;
                }
                if(nota < notaMinTotal){
                    notaMinTotal = nota;
                }
                System.out.println(nota);
                notas += nota;
            }
            notasTotal += notas;
            media = notas/5;
            System.out.println("La media del alumno " + i + " es de: " + media);
            System.out.println("La nota maxima del alumno " + i + " es de: " + notaMax + " y la minima de: " + notaMin);
            notaMax = 0;
            notaMin = 10;
            System.out.println("");
        }
        mediaTotal = notasTotal/5;
        System.out.println("La media total de la clase es: " + mediaTotal);
        System.out.println("La nota maxima de la clase es de: " + notaMaxTotal + " y la minima de: " + notaMinTotal);
    }
    
}
