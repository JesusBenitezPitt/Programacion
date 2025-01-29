/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_Resueltos.Ejercicio_01_al_05;

/**
 *
 * @author usuario
 */
public class Ejercicio_01 {
    
    public static void main(String[] args) {
        CuentaCorriente c = new CuentaCorriente("12345678A", "Pepe");
        c.ingreso(1000);
        c.SacarDinero(2000);
        c.mostrarInformacion();
    }
    
}
