/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_Aplicacion;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] participantes = new int[0];
        int dorsal = 0, cont = 0;
        while(dorsal != -1){
            System.out.print("Escribe el dorsal que tiene el participante que llego a la meta (Para terminar escribir -1): ");
            dorsal = sc.nextInt();
            if(dorsal != -1){
                participantes = Arrays.copyOf(participantes, participantes.length + 1);
                participantes[cont] = dorsal;
                cont++;
            }
        }
        System.out.println("Dorsales de los participantes: " + Arrays.toString(participantes));
        menores(participantes, sc);
        dopaje(participantes, sc);
        sinpagar(participantes, sc);
        ganadores(participantes);
    }
    
    public static void menores(int[] t, Scanner sc){
        int menores = 0, pos = 0;
        boolean encontrado = false;
        while(menores != -1){
            System.out.print("Introduce los dorsales de todos los participantes menores de edad (-1 para terminar): ");
            menores  = sc.nextInt();
            if(menores != -1){
                for(int i = 0; i < t.length && !encontrado; i++){
                    if(t[i] == menores){
                        pos = i;
                        encontrado = true;
                    }
                }
                int temp = t[pos];
                t[pos] = t[pos-1];
                t[pos-1] = temp;
            }
        }
        System.out.println("Orden: " + Arrays.toString(t));
    }
    
    public static void dopaje(int[] t, Scanner sc){
        int dopaje = 0, pos;
        while(dopaje != -1){
            System.out.print("Introduce los dorsales de todos los participantes que han dado positivo (-1 para terminar): ");
            dopaje  = sc.nextInt();
            if(dopaje != -1){
                for(int i = 0; i < t.length; i++){
                    if(t[i] == dopaje){
                        pos = i;
                        for(int j = pos; j < t.length && j != t.length - 1; j++){
                            t[j] = t[j+1];
                        }
                        t = Arrays.copyOf(t, t.length - 1);
                    }
                }
            }
        }
        System.out.println("Orden: " + Arrays.toString(t));
    }
    
    public static void sinpagar(int[] t, Scanner sc){
        int sinpagar = 0, cont = 0;
        int[] sinpagarT = new int[0];
        while(sinpagar != -1){
            System.out.print("Introduce los dorsales de los participantes que no han pagado (-1 para terminar): ");
            sinpagar  = sc.nextInt();
            if(sinpagar != -1){
                for(int i = 0; i < t.length; i++){
                    if(t[i] == sinpagar){
                        sinpagarT = Arrays.copyOf(sinpagarT, sinpagarT.length + 1);
                        sinpagarT[cont] = sinpagar;
                        cont++;
                        for(int j = i; j < t.length; j++){
                            if(j != t.length - 1){
                                t[j] = t[j+1];
                            }
                        }
                        t = Arrays.copyOf(t, t.length - 1);
                    }
                }
                for(int i = 0; i < sinpagarT.length; i++){
                    t = Arrays.copyOf(t, t.length + 1);
                    t[t.length - 1] = sinpagarT[i];
                }
            }
        }
        System.out.println(Arrays.toString(t));
    }
    
    public static void ganadores(int[] t){
        int[] podio = new int[3];
        int cont = 0;
        for(int i = 0; i < 3; i++){
            podio[cont] = t[i];
            cont++;
        }
        System.out.println("El ganador de la medalla de oro es el dorsal " + podio[0]);
        System.out.println("El ganador de la medalla de plata es el dorsal " + podio[1]);
        System.out.println("El ganador de la medalla de bronce es el dorsal " + podio[2]);
    }
    
}