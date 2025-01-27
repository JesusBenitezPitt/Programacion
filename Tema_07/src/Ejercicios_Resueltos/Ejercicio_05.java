/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_Resueltos;

/**
 *
 * @author usuario
 */
public class Ejercicio_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         CuentaCorriente c1, c2, c3;
         Gestor g1 = new Gestor("Antonio Gonzalez", "666 555 444");
         Gestor g2 = new Gestor("Bea Rodriguez", "987 543 210");
        c1 = new CuentaCorriente("12345678A", "Pepe", g1);
        c2 = new CuentaCorriente("12345678B", "Roberto", g1);
        c3 = new CuentaCorriente("11222333Z", "Sancho");
        
        c1.mostrarInformacion();
        c2.mostrarInformacion();
        c3.mostrarInformacion();
        c1.setGestor(g2);
        c1.mostrarInformacion();
    }
    
}
