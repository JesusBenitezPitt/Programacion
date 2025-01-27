/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Resueltos;

/**
 *
 * @author usuario
 */
public class Hora {
    private byte hora;
    private byte minuto;
    private byte segundo;
    
    public int getHora(){
        return hora;
    }
    
    public void setHora(int hora){
        if(0 <= hora && hora <= 23){
            this.hora = (byte) hora;
        } else {
            this.hora = 0;
        }
    }
    
    public int getMinuto(){
        return minuto;
    }
    
    public void setMinuto(int minuto){
        if(0 <= minuto && minuto <= 59){
            this.minuto = (byte) minuto;
        } else {
            this.minuto = 0;
        }
    }
    
    public byte getSegundo(){
        return segundo;
    }
    
    public void setSegundo(int segundo){
        if(0 <= minuto && minuto <= 59){
            this.minuto = (byte) minuto;
        } else {
            this.minuto = 0;
        }
    }
    
    public void incrementarSegundo(){
        segundo ++;
        if(segundo == 60){
            minuto++;
            segundo = 0;
            if(minuto == 60){
                hora++;
                minuto = 0;
                if(hora == 24){
                    hora = 0;
                }
            }
        }
    }
}
