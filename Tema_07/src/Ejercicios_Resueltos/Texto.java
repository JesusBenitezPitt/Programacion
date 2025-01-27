/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Resueltos;

import java.time.LocalDate;
import java.time.LocalDateTime;
/**
 *
 * @author usuario
 */
public class Texto {
    private String cadena;
    LocalDate creacion;
    LocalDateTime ultimaModificacion;
    private final int LONGITUD_MAX;
    static final String VOCALES = "aeiou";
    
    public Texto(int long_max){
        cadena = "";
        this.LONGITUD_MAX = long_max;
        creacion = LocalDate.now();
        ultimaModificacion = null;
    }
    
    public void añadirFinal(char c){
        if(LONGITUD_MAX > cadena.length()){
            cadena = cadena + c;
            ultimaModificacion = LocalDateTime.now();
        }
    }
    
    public void añadirFinal(String c){
        if(LONGITUD_MAX >= cadena.length() + c.length()){
            cadena = cadena + c;
            ultimaModificacion = LocalDateTime.now();
        }
    }
    
    public void añadirPrincipio(char c){
        if(LONGITUD_MAX > cadena.length()){
            cadena = c + cadena;
            ultimaModificacion = LocalDateTime.now();
        }
    }
    
    public void añadirPrincipio(String c){
        if(LONGITUD_MAX >= cadena.length() + c.length()){
            cadena = c + cadena;
            ultimaModificacion = LocalDateTime.now();
        }
    }
    
    public void mostrar(){
        System.out.println("Texto creado el " + creacion);
        System.out.println("Ultima modificacion: " + ultimaModificacion);
        System.out.println("Cadena: " + cadena);
    }
    
    public int numVocales(){
        int voc = 0;
        for(int i = 0; i < cadena.length(); i++){
            if(esVocal(cadena.charAt(i))){
                voc++;
            }
        }
        return voc;
    }
    
    private boolean esVocal(char c){
        boolean vocal = false;
        c = Character.toLowerCase(c);
        if(VOCALES.indexOf(c) != -1){
            vocal = true;
        }
        return vocal;
    }
}
