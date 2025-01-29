/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Resueltos.Ejercicio_10.Personal;

import java.time.LocalDateTime;
/**
 *
 * @author usuario
 */
public class JefeEstacion {
    String nombre;
    String dni;
    LocalDateTime fechaNombramiento;
    
    public JefeEstacion(String nombre, String dni, LocalDateTime fechaNombramiento){
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNombramiento = fechaNombramiento;
    }
}
