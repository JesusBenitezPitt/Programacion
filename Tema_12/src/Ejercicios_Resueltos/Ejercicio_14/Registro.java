/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Resueltos.Ejercicio_14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author usuario
 */
public class Registro implements Serializable {
    LocalTime hora;
    double temperatura;

    public Registro(double temperatura) {
        this.temperatura = temperatura;
        this.hora = LocalTime.now();
    }
    
    @Override
    public boolean equals(Object o){
        return hora.equals(((Registro) o ).hora);
    }
    
    @Override
    public String toString(){
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM).withLocale(Locale.getDefault());
        return "Hora: " + hora.format(f) + ", temperatura: " + temperatura + "ªC\n";
    }
    
    public static void guardarRegistros(String archivo, Map<LocalDate, Set<Registro>> mapa_temperaturas){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))){
            oos.writeObject(mapa_temperaturas);
            System.out.println("Registros guardados en " + archivo);
        }catch(FileNotFoundException e){
            e.getMessage();
        }catch(IOException e){
            e.getMessage();
        }
    }

    public static Map<LocalDate, Set<Registro>> cargarMapa(String archivo, Map<LocalDate, Set<Registro>> mapa_temperaturas) {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))){
            mapa_temperaturas = (Map<LocalDate, Set<Registro>>) ois.readObject();
            System.out.println("Registros cargados");
        }catch(IOException | ClassNotFoundException e){
            e.getMessage();
        }
        return mapa_temperaturas;
    }
    
}
