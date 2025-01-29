/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Resueltos.Ejercicio_10.Maquinaria;

import Ejercicios_Resueltos.Ejercicio_10.Personal.Maquinista;
/**
 *
 * @author usuario
 */
public class Tren {
    Locomotora locomotora;
    Vagon vagones[];
    Maquinista responsable;
    private int numVagones;
    
    public Tren(Locomotora locomotora,  Maquinista responsable){
        this.locomotora = locomotora;
        this.responsable = responsable;
        vagones = new Vagon[5];
        numVagones = 0;
    }
    
    public void engancharVagon(int cargaMax, int cargaAct, String mercancia){
        if(numVagones >= 5){
            System.out.println("El tren no admite mas vagones.");
        } else {
            Vagon v = new Vagon(numVagones, cargaMax, cargaAct, mercancia);
            vagones[numVagones] = v;
            numVagones++;
        }
    }
}
