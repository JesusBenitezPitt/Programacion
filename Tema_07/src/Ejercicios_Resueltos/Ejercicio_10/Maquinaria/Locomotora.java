/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Resueltos.Ejercicio_10.Maquinaria;

import Ejercicios_Resueltos.Ejercicio_10.Personal.Mecanico;
/**
 *
 * @author usuario
 */
public class Locomotora {
    String matricula;
    int potencia;
    int añoFabricacion;
    Mecanico mec;
    
    public Locomotora(String matricula, int potencia, int añoFabricacion, Mecanico mec){
        this.matricula = matricula;
        this.potencia = potencia;
        this.añoFabricacion = añoFabricacion;
        this.mec = mec;
    }
}
