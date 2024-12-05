/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_Aplicacion;

import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Ejercicio_05 {

    /**
     * @param args the command line arguments
     */
    //Notas aleatorias del 0 al 10
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alumno;
        int[][] tabla = new int[3][5];
        int[][] notas = rellenarNotas(tabla);
        mostrarNotas(notas);
        notaMediaDelGrupo(tabla);
        do{
            System.out.print("Alumno que desea saber su nota media: ");
            alumno = sc.nextInt();
        }while(alumno < 1 || alumno > 5);
        buscarAlumno(tabla, alumno-1);
    }
    
    public static void buscarAlumno(int[][] t, int a){
        int suma = 0;
        for(int i = 0; i < 3; i++){
            suma += t[i][a];
        }
        int media = suma/3;
        System.out.println("La nota media del alumno " + (a+1) + " es de: " + media);
    }
    
    public static int[][] rellenarNotas(int[][] t){
        for(int a = 0; a < 5; a++){
            for(int tr = 0; tr < 3; tr++){
                t[tr][a] = (int) (Math.random()*11);
            }
        }
        return t;
    }
    
    public static void mostrarNotas(int[][] t){
        for(int i = 0; i < 5; i++){
            System.out.print("Alumno " + (i+1) + ": ");
            for(int j = 0; j < 3; j++){
                if(j != t.length-1){
                    System.out.print(t[j][i] + ", ");
                } else {
                    System.out.print(t[j][i] + ".");
                }
            }
            System.out.println();
        }
    }
    
    public static void notaMediaDelGrupo(int[][] t){
        int suma;
        for(int i = 0; i < 3; i++){
            suma = 0;
            for(int j = 0; j < 5; j++){
                suma += t[i][j];
            }
            int media = suma/5;
            System.out.println("La nota media del grupo en el trimestre " + (i+1) + " es de: " + media);
        }
    }
}
