package Ejercicios_Resueltos.Ejercicio_04_al_11;

public class Campana extends Instrumento {
    public Campana() {
        super();
    }

    @Override
    public void interpretar() {
        for(Nota n : melodia){
            switch (n) {
                case DO -> {
                    System.out.print("do ");
                }
                case RE -> {
                    System.out.print("re ");
                }
                case MI -> {
                    System.out.print("mi ");
                }
                case FA -> {
                    System.out.print("fa ");
                }
                case SOL -> {
                    System.out.print("sol ");
                }
                case LA -> {
                    System.out.print("la ");
                }
                case SI -> {
                    System.out.print("si ");
                }
            }
        }
        System.out.println("");
    }
}