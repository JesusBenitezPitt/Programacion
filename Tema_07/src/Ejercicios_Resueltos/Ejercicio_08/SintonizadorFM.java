/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Resueltos.Ejercicio_08;

/**
 *
 * @author usuario
 */
public class SintonizadorFM {
    double frecuencia;
    
    SintonizadorFM(double frecuenciaInicial){
        if(frecuenciaInicial < 80){
            frecuencia = 80;
        } else if (frecuenciaInicial > 108){
            frecuencia = 180;
        } else {
            frecuencia = frecuenciaInicial;
        }
    }
    
    private void comprobarRango(){
        if(frecuencia < 80){
            frecuencia = 108;
        } else if(frecuencia > 108){
            frecuencia = 80;
        }
    }
    
    public double subirFrecuencia(){
        frecuencia += 0.5;
        comprobarRango();
        return frecuencia;
    }
    
    public double bajarFrecuencia(){
        frecuencia -= 0.5;
        comprobarRango();
        return frecuencia;
    }
    
    public void mostrarFrecuencia(){
        System.out.println("Sintonizando: " + frecuencia + " MHz.");
    }
}
