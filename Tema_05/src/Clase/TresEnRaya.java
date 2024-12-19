/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clase;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class TresEnRaya {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] tablero = {{'·', '·', '·'},
                                       {'·', '·', '·'},
                                       {'·', '·', '·'}};
        
        char[] simbolos = { 'a', 'b' };
        boolean partidaFinalizada = false;
        mostrarTablero(tablero);
        while(!partidaFinalizada){
            movimientoJugador(tablero, sc, simbolos[0], simbolos);
            mostrarTablero(tablero);
            if(verificarGanador(tablero, simbolos) || tableroLleno(tablero)){
                partidaFinalizada = true;
            } else {
                movimientoJugador(tablero, sc, simbolos[1], simbolos);
                mostrarTablero(tablero);
                if(verificarGanador(tablero, simbolos) || tableroLleno(tablero)){
                    partidaFinalizada = true;
                }
            }
        }
    }
    
    public static void mostrarTablero(char[][] t){
        System.out.println("|" + t[0][0] + "|" + t[0][1] + "|" + t[0][2] + "|");
        System.out.println("+-+-+-+");
        System.out.println("|" + t[1][0] + "|" + t[1][1] + "|" + t[1][2] + "|");
        System.out.println("+-+-+-+");
        System.out.println("|" + t[2][0] + "|" + t[2][1] + "|" + t[2][2] + "|");
    }
    
    public static boolean comprobarMovimiento(char[][] t, int[] pos){
        boolean movimientoValido = false;
        if(t[pos[0]][pos[1]] == '·'){
            movimientoValido = true;
        }
        return movimientoValido;
    }
    
    public static void movimientoJugador(char[][] t, Scanner sc, char s, char[] sim){
        int[] posicion = new int[2];
        boolean valido;
        if(s == sim[0]){
            System.out.println("Jugador 1");
        } else if(s == sim[1]){
            System.out.println("Jugador 2");
        }
        do{
            valido = true;
            System.out.print("Elige la fila: ");
            posicion[0] = sc.nextInt();
            System.out.print("Elige la columna: ");
            posicion[1] = sc.nextInt();

            if(comprobarMovimiento(t, posicion)){
                t[posicion[0]][posicion[1]] = s;
            } else {
                System.out.println("Movimiento no valido, vuelvelo a intentar");
                valido = false;
            }
        }while(!valido);
    }
    
    public static boolean tableroLleno(char[][] t){
        boolean lleno = true;
        for(int i = 0; i < t.length; i++){
            for(int j = 0; j < t[i].length; j++){
                if(t[i][j] == '·'){
                     lleno = false;
                }
            }
        }
        return lleno;
    }
    
    public static boolean verificarGanador(char[][] t, char[] sim){
        boolean ganado = false;
        for(int i = 0; i < 3 && !ganado; i++){
            if(t[i][0] == t[i][1] && t[i][1] == t[i][2]){
                if(t[i][0] == sim[0]){
                    ganado = true;
                    System.out.println("El jugador 1 gana.");
                } else if(t[i][0] == sim[1]){
                    ganado = true;
                    System.out.println("El jugador 2 gana.");
                }
            }
        }
        
        for(int i = 0; i < 3 && !ganado; i++){
            if(t[0][i] == t[1][i] && t[1][i] == t[2][i]){
                if(t[0][i] == sim[0]){
                    ganado = true;
                    System.out.println("El jugador 1 gana.");
                } else if(t[0][i] == sim[1]){
                    ganado = true;
                    System.out.println("El jugador 2 gana.");
                }
            }
        }
        
        if(t[0][0] == t[1][1] && t[1][1] == t[2][2]){
            if(t[0][0] == sim[0]){
                ganado = true;
                System.out.println("El jugador 1 gana.");
            } else if(t[0][0] == sim[1]){
                ganado = true;
                System.out.println("El jugador 2 gana.");
            }
        } else if(t[2][0] == t[1][1] && t[1][1] == t[0][2]){
            if(t[2][0] == sim[0]){
                    ganado = true;
                    System.out.println("El jugador 1 gana.");
                } else if(t[2][0] == sim[1]){
                    ganado = true;
                    System.out.println("El jugador 2 gana.");
                }
        }
        return ganado;
    }
    
}
