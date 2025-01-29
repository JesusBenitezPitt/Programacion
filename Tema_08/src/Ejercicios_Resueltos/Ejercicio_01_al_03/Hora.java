/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Resueltos.Ejercicio_01_al_03;

/**
 *
 * @author usuario
 */
public class Hora {
    int hora, minutos;
    
    public Hora(int hora, int minutos){
        this.hora = 0;
        this.minutos = 0;
        if(!setHoras(hora)){
            System.out.println("La hora no es correcta.");
        }
        if(!setMinutos(minutos)){
            System.out.println("Los minutos no son correctos.");
        }
    }
    
    void inc(){
        minutos++;
        if(minutos > 59){
            hora++;
            minutos = 0;
            if(hora > 23){
                hora = 0;
            }
        }
    }
    
    boolean setMinutos(int min){
        boolean correcto = false;
        if(0 <= min && min < 60){
            this.minutos = min;
            correcto = true;
        }
        return correcto;
    }
    
    boolean setHoras(int h){
        boolean correcto = false;
        if(0 <= h && h < 23){
            this.hora = h;
            correcto = true;
        }
        return correcto;
    }
    
    @Override
    public String toString() {
        String result;
        result = hora + ":" + minutos;
        return result;
    }
}
