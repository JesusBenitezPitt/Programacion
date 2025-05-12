/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Ampliacion.Ejercicio_31;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cliente implements Comparable<Cliente> {
    String DNI;
    String nombre_completo;
    LocalDate fecha_nacimiento;
    double saldo;
    
    public Cliente(String DNI, String nombre_completo, String fecha_nacimiento, String saldo){
        this.DNI = DNI;
        this.nombre_completo = nombre_completo;
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fecha_nacimiento = LocalDate.parse(fecha_nacimiento, f);
        this.saldo = Double.parseDouble(saldo);
    }
    
    private int calcularEdad(LocalDate fecha_nacimiento){
        LocalDate hoy = LocalDate.now();
        int edad = hoy.getYear() - fecha_nacimiento.getYear();
        return edad;
    }
    
    @Override
    public String toString(){
        return "DNI: " + DNI + ", Nombre: " + nombre_completo + ", Saldo: " + saldo + "€, Edad: " + calcularEdad(fecha_nacimiento) + " años.";
    }

    @Override
    public int compareTo(Cliente c) {
        return this.DNI.compareTo(c.DNI);
    }
    
    
}
