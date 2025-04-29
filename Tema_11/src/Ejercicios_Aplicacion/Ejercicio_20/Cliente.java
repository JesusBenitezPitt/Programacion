package Ejercicios_Aplicacion.Ejercicio_20;

import java.io.Serializable;

public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;
    protected int ID;
    protected String nombre;
    protected String telefono;
    
    public Cliente(int id, String nombre, String telefono){
        this.ID = id;
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
    public int getId(){
        return this.ID;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getTelefono(){
        return this.telefono;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    
    @Override
    public String toString(){
        return "ID: " + this.ID + ", Nombre: " + this.nombre + ", Telefono: " + this.telefono;
    }
}
