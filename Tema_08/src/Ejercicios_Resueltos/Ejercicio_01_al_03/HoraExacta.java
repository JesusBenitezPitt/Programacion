/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Resueltos.Ejercicio_01_al_03;

/**
 *
 * @author jesus
 */
public class HoraExacta extends Hora {
    protected int segundos;
    public HoraExacta(int hora, int minutos, int segundos){
        super(hora, minutos);
        if(!setSegundos(segundos)){
            System.out.println("Segundos incorrectos.");
        }
    }
    
    public boolean setSegundos(int segundos){
        boolean correcto = false;
        if(0 <= segundos && segundos < 60){
            this.segundos = segundos;
            correcto = true;
        }
        return correcto;
    }
    
    @Override
    public void inc(){
        segundos ++;
        if(segundos > 59){
            segundos = 0;
            super.inc();
        }
    }
    
    @Override
    public String toString(){
        String result = super.toString();
        result += ":" + segundos;
        return result;
    }
    
    @Override
    public boolean equals(Object o){
        HoraExacta otroReloj = (HoraExacta) o;
        boolean iguales;
        if(this.hora == otroReloj.hora && this.minutos == otroReloj.minutos && this.segundos == otroReloj.segundos){
            iguales = true;
        } else {
            iguales = false;
        }
        return iguales;
    }
}
