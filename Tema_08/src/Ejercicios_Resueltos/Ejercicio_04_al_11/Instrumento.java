package Ejercicios_Resueltos.Ejercicio_04_al_11;

import java.util.Arrays;

public abstract class Instrumento{
    public enum Nota {DO, RE, MI, FA, SOL, LA, SI};
    protected Nota[] melodia;

    public Instrumento(){
        melodia = new Nota[0];
    }

    public void add(Nota n){
        melodia = Arrays.copyOf(melodia, melodia.length + 1);
        melodia[melodia.length - 1] = n;
    }

    abstract void interpretar();
}

