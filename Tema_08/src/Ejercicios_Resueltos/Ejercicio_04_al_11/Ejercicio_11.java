package Ejercicios_Resueltos.Ejercicio_04_al_11;

import Ejercicios_Resueltos.Ejercicio_04_al_11.Instrumento.Nota;

public class Ejercicio_11 {
    public static void main(String[] args) {
        Nota cancion[] = {Nota.DO, Nota.SI, Nota.SOL, Nota.RE, Nota.FA};

        Campana c = new Campana();
        for(Nota nota : cancion){
            c.add(nota);
        }
        c.interpretar();
    }
}
