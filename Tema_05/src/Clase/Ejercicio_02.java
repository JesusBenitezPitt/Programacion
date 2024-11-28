/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clase;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Rellenar un vector con 10 elementos de forma aleatoria con valores entre 20 y 50 y mostrarlos y a continuacion mostrarlos en orden inverso.
 * Crear un segundo vector que contenga los valores del primero pero al cuadrado.
 * A continuacion, volver a mostrar el contenido del vector original diciendo de cada uno de los elementos si es par o impar.
 * Y al final cuantos pares e impares hay.
 * Obtener el maximo y el minimo del vector original.
 * A continuacion crear un vector nuevo para almacenar solamente los que sean multiplo de 5.
 * A continuacion pedir un numero por teclado y decir si esta o no esta y en que posicion.
 * A continuacion ordenar el vector.
 * A continuacion pedir un valor por teclado y decir si esta o no y en que posicion una vez el vector esta ordenado.
 *
 * @author usuario
 */
public class Ejercicio_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] crearVector = crearVector();
        System.out.println("Vector original: " + Arrays.toString(crearVector));
        
        int[] ordenInverso = ordenInverso(crearVector);
        System.out.println("Orden inverso: " + Arrays.toString(ordenInverso));
        
        int[] vectorAlCuadrado = vectorAlCuadrado(crearVector);
        System.out.println("Vector original al cuadrado: " + Arrays.toString(vectorAlCuadrado));
        
        esParoImpar(crearVector);
        maximoYMinimo(crearVector);
        
        multiplosDe5(crearVector);
        
        buscarNumero(crearVector);
        
        int[] ordenarVector = ordenarVector(crearVector);
        System.out.println("Vector ordenado: " + Arrays.toString(ordenarVector));
        
        buscarNumeroVectorOrdenado(ordenarVector);
    }
    
    static int[] crearVector(){
        int[] tabla = new int[10];
        int cont = 0;
        while(cont != 10){
            int num = (int) (Math.random()*50)+1;
            if(num >= 20){
                tabla[cont] = num;
                cont++;
            }
        }
        return tabla;
    }
    
    static int[] ordenInverso(int[] tabla){
        int cont = 0;
        int[] tabla2 = new int[10];
        for(int i = tabla.length -1; i >= 0; i--){
            tabla2[cont] = tabla[i];
            cont++;
        }
        return tabla2;
    }
    
    static int[] vectorAlCuadrado(int[] tabla){
        int[] tablaTemp = new int[10];
        for(int i = 0; i < tabla.length; i++){
            tablaTemp[i] = (int) (Math.pow(tabla[i], 2));
        }
        return tablaTemp;
    }
    
    static void esParoImpar(int[] tabla){
        int pares = 0, impares = 0;
        System.out.println("Vector original: " + Arrays.toString(tabla));
        for(int i = 0; i < tabla.length; i++){
            if(tabla[i] % 2 == 0){
                System.out.println("---- El elemento " + i + " (" + tabla[i] + ") es Par.");
                pares++;
            } else {
                System.out.println("---- El elemento " + i + " (" + tabla[i] + ") es impar.");
                impares++;
            }
        }
        System.out.println("---- Hay " + pares + " pares y " + impares + " impares.");
    }
    
    static void maximoYMinimo(int[] tabla){
        int minimo = 51, maximo = 19;
        for(int i = 0; i < tabla.length; i++){
            if(tabla[i] >= maximo){
                maximo = tabla[i];
            }
            if(tabla[i] <= minimo){
                minimo = tabla[i];
            }
        }
        System.out.println("El maximo es: " + maximo);
        System.out.println("El minimo es: " + minimo);
    }
    
    static void multiplosDe5(int[] tabla){
        int cont = -1;
        int[] tablaMultiplos = new int[0];
        for(int i = 0; i < tabla.length; i++){
            if(tabla[i] % 5 == 0){
                cont ++;
                tablaMultiplos = Arrays.copyOf(tablaMultiplos, tablaMultiplos.length +1);
                tablaMultiplos[cont] = tabla[i];
            }
        }
        if(cont < 0){
            System.out.println("No hay multiplos de 5.");
        } else {
            System.out.println("Multiplos de 5: " + Arrays.toString(tablaMultiplos));
        }
    }
    
    static void buscarNumero(int[] tabla){
        Scanner sc = new Scanner(System.in);
        boolean existe= false;
        int pos = 0;
        System.out.print("Que numero quieres buscar: ");
        int num = sc.nextInt();
        
        for(int i = 0; i < tabla.length && !existe; i++){
            if(tabla[i] == num){
                existe = true;
                pos = i;
            }
        }
        if(existe){
            System.out.println("El numero esta en la posicion: " + pos);
        } else {
            System.out.println("El numero no existe");
        }
    }
    
    static int[] ordenarVector(int[] tabla){
        Arrays.sort(tabla);
        return tabla;
    }
    
    static void buscarNumeroVectorOrdenado(int[] tabla){
        Scanner sc = new Scanner(System.in);
        System.out.print("Que numero quieres buscar: ");
        int num = sc.nextInt();
        if(Arrays.binarySearch(tabla, num) > 0){    
            System.out.println("El numero esta en la posicion: " + Arrays.binarySearch(tabla, num));
        } else {
            System.out.println("El numero no existe");
        }
    }
    
}
