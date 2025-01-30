/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Resueltos.Ejercicio_11;

import java.util.Arrays;

/**
 *
 * @author usuario
 */
public class Lista {
    Integer[] tabla;
    
    public Lista(){
        tabla = new Integer[0];
    }
    
    public int numeroElementos(){
        return tabla.length;
    }
    
    public void insertarFinal(int n){
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length - 1] = n;
    }
    
    public void insertarPrincipio(int n){
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, 0, tabla, 1, tabla.length - 1);
        tabla[0] = n;
    }
    
    public void insertarEnIndice(int indice, Integer n){
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, indice, tabla, indice + 1, tabla.length - indice - 1);
        tabla[indice] = n;
    }
    
    public void insertarFinal(Lista nuevaLista){
        int tamIni = tabla.length;
        tabla = Arrays.copyOf(tabla, tabla.length + nuevaLista.tabla.length);
        System.arraycopy(nuevaLista.tabla, 0, tabla, tamIni, nuevaLista.tabla.length);
    }
    
    public Integer eliminarEnIndice(int indice){
        Integer eliminado = null;
        if(indice >= 0 && indice < tabla.length){
            eliminado = tabla[indice];
            System.arraycopy(tabla, indice + 1, tabla, indice, tabla.length - 1 - indice);
            tabla = Arrays.copyOf(tabla, tabla.length - 1);
        }
        return eliminado;
    }
    
    public int buscarElemento(int n){
        Integer indice = -1;
        for(int i = 0; i < tabla.length && indice == -1; i++){
            if(tabla[i].equals(n)){
                indice = i;
            }
        }
        return indice;
    }
    
    public void mostrar(){
        System.out.println("Lista: " + Arrays.toString(tabla));
    }
}
