/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Aplicacion.Ejercicio_25;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author usuario
 */
public class Socio implements Comparable<Socio> {
    protected String apodo;
    protected String nombre;
    protected LocalDate fecha_ingreso;

    public Socio(String apodo, String nombre, LocalDate fecha_ingreso) {
        this.apodo = apodo;
        this.nombre = nombre;
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fecha_formateada = fecha_ingreso.format(f);
        this.fecha_ingreso = LocalDate.parse(fecha_formateada, f);
    }

    public String getApodo() {
        return apodo;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha_ingreso(LocalDate fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    @Override
    public String toString() {
        return "Apodo: " + apodo + ", Nombre: " + nombre + ", Fecha_ingreso: " + fecha_ingreso;
    }
    
    @Override
    public int compareTo(Socio s2){
        return this.apodo.compareToIgnoreCase(s2.apodo);
    }
    
}
