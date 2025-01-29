/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_Resueltos.Ejercicio_07;

/**
 *
 * @author usuario
 */
public class Ejercicio_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Texto t = new Texto(5);
        t.añadirPrincipio("Ho");
        t.añadirPrincipio(";");
        t.añadirFinal("la");
        t.añadirFinal("X");
        t.mostrar();
        System.out.println("Numero de vocales: " + t.numVocales());
    }
    
}
