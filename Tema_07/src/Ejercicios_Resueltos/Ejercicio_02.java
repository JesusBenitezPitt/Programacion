/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_Resueltos;

/**
 *
 * @author usuario
 */
public class Ejercicio_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaCorriente c = new CuentaCorriente("12345678A", "Pepe");
        c.ingreso(1000);
        c.SacarDinero(2000);
        c.mostrarInformacion();
        
        c = new CuentaCorriente("12345678B", 200);
        c.SacarDinero(100);
        c.mostrarInformacion();
    }
    
}
