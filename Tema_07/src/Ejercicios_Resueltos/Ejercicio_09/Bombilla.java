/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Resueltos.Ejercicio_09;

/**
 *
 * @author usuario
 */
public class Bombilla {
    public static boolean interruptorGeneral = true;
    private boolean interruptor = false;
    
    public Bombilla() {
        interruptor = false;
    }
    
    public void encender(){
        interruptor = true;
    }
    
    public void apagar(){
        interruptor = false;
    }
    
    public boolean estado(){
        return interruptorGeneral && interruptor;
    }
    
    public String mostrarEstado(){
        return estado() ? "Encendida" : "Apagada";
    }
}
