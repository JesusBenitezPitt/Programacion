/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_Resueltos;

/**
 *
 * @author usuario
 */
public class Ejercicio_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaCorriente c = new CuentaCorriente("12345678A", "Pepe");
        CuentaCorriente c2 = new CuentaCorriente("12345678B", "Roberto");
        c.mostrarInformacion();
        c2.mostrarInformacion();
        CuentaCorriente.setBanco("Banco Central");
        c.mostrarInformacion();
        c2.mostrarInformacion();
        CuentaCorriente.setBanco("Do-While Bank");
        c.mostrarInformacion();
        c2.mostrarInformacion();
    }
    
}
