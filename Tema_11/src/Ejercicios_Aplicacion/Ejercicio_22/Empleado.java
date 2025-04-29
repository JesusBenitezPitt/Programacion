package Ejercicios_Aplicacion.Ejercicio_22;

import java.io.Serializable;

public class Empleado implements Serializable {
    protected String DNI;
    protected String nombre;
    protected double saldo;

    public Empleado(String DNI, String nombre, double saldo) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "DNI: " + DNI + ", Nombre: " + nombre + ", Saldo: " + saldo;
    }
    
    
}
