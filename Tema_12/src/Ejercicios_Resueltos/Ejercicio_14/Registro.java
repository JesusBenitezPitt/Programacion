/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Resueltos.Ejercicio_14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
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
    
    public boolean equals(Object o){
        return hora.equals(((Registro) o ).hora);
    }
    
    @Override
    public String toString(){
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM).withLocale(Locale.getDefault());
        return "Hora: " + hora.format(f) + ", temperatura: " + temperatura + "ªC\n";
    }
    
    public static void guardarRegistros(String archivo, Set<Registro> temperaturas){
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyyMMdd");
        archivo += (LocalDate.now().format(f) + ".dat");
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))){
            oos.writeObject(temperaturas);
            System.out.println("Registros guardados en " + archivo);
        }catch(FileNotFoundException e){
            e.getMessage();
        }catch(IOException e){
            e.getMessage();
        }
    }
    
}
