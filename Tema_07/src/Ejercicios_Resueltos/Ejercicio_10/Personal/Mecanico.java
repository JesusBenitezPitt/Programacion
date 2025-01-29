/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Resueltos.Ejercicio_10.Personal;

/**
 *
 * @author usuario
 */
public class Mecanico {
    String nombre;
    String tlf;
    enum Especialidad { frenos, hidrahulica, electricidad, motor };
    Especialidad especialidad;
    
    public Mecanico(String nombre, String tlf, String especialidad){
        this.nombre = nombre;
        this.tlf = tlf;
        this.especialidad = Especialidad.valueOf(especialidad);
    }
}
