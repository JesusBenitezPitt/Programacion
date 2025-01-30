package Ejercicios_Resueltos.Ejercicio_04_al_11;

import Ejercicios_Resueltos.Ejercicio_04_al_11.Instrumento.Nota;

public class Ejercicio_05 {
    public static void main(String[] args) {
        Nota cancion[] = {Nota.DO, Nota.SI, Nota.SOL, Nota.RE, Nota.FA};

        Piano p = new Piano();
        for(Nota nota : cancion){
            p.add(nota);
        }
        p.interpretar();
    }
}