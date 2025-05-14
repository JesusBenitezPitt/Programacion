/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Propuestos.Ejercicio5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author usuario
 */
public class Cliente implements Comparable<Cliente> {
    protected String DNI;
    protected String nombre;
    protected LocalDate fecha_nacimiento;
    protected int edad;

    public Cliente(String DNI, String nombre, String fecha_nacimiento) {
        this.DNI = DNI;
        this.nombre = nombre;
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fecha_nacimiento = LocalDate.parse(fecha_nacimiento, f);
        this.edad = calcularEdad(LocalDate.now(), this.fecha_nacimiento);
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }
    
    public int getEdad(){
        return edad;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha_nacimiento(LocalDate fecha_alta) {
        this.fecha_nacimiento = fecha_alta;
    }
    
    @Override
    public int compareTo(Cliente t) {
        return DNI.compareTo(t.DNI);
    }

    @Override
    public String toString() {
        return "\nDNI: " + DNI + ", Nombre: " + nombre + ", Edad: " + edad + '.';
    }
    
    private int calcularEdad(LocalDate fecha_actual, LocalDate fecha_nacimiento){
        return fecha_actual.getYear() - fecha_nacimiento.getYear();
    }
    
}
