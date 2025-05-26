/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Aplicacion.Ejercicio_25;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author usuario
 */
public class MapaSocios implements Serializable {
    protected String archivo_bin = "src/Ejercicios_Aplicacion/Ejercicio_25/club.dat";
    protected Map<String, Socio> mapa_socios = new TreeMap<>();
    
    public MapaSocios(){
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo_bin))){
            mapa_socios = (Map) ois.readObject();
        }catch(IOException | ClassNotFoundException e){
            e.getMessage();
        }
    }

    public String getArchivo_bin() {
        return archivo_bin;
    }

    public Map<String, Socio> getMapa_socios() {
        return mapa_socios;
    }

    public void setArchivo_bin(String archivo_bin) {
        this.archivo_bin = archivo_bin;
    }

    public void setMapa_socios(Map<String, Socio> mapa_socios) {
        this.mapa_socios = mapa_socios;
    }
    
    
    public void altaSocio(){
        System.out.print("Introduce su apodo: ");
        String apodo = new Scanner(System.in).next();
        if(mapa_socios.containsKey(apodo)){
            System.out.println("El apodo ya existe.");
        } else {
            System.out.print("Introduce su nombre: ");
            String nombre = new Scanner(System.in).next();
            mapa_socios.put(apodo, new Socio(apodo, nombre, LocalDate.now()));
            System.out.println("Socio dado de alta correctamente.");
        }
    }
    
    public void bajaSocio(){
        System.out.print("Introduce su apodo: ");
        String apodo = new Scanner(System.in).next();
        if(!mapa_socios.containsKey(apodo)){
            System.out.println("El socio con ese apodo no existe.");
        } else {
            mapa_socios.remove(apodo);
            System.out.println("Socio dado de baja correctamente.");
        }
    }
    
    public void modificacionSocio(){
        System.out.print("Introduce su apodo: ");
        String apodo = new Scanner(System.in).next();
        if(!mapa_socios.containsKey(apodo)){
            System.out.println("El socio con ese apodo no existe.");
        } else {
            Socio s = mapa_socios.get(apodo);
            System.out.println("Introduce su nuevo apodo:");
            String apodo2 = new Scanner(System.in).next();
            System.out.println("Introduce su nuevo nombre: ");
            String nombre = new Scanner(System.in).next();
            s.setApodo(apodo2);
            s.setNombre(nombre);
            mapa_socios.remove(apodo);
            mapa_socios.put(apodo, s);
            System.out.println("Socio modificado correctamente.");
        }
    }
    
    public void listarPorApodos(){
        Collection<Socio> socios = mapa_socios.values();
        for(Socio s : socios){
            System.out.println(s);
        }
    }
    
    public void listarPorAntiguedad(){
        Comparator<Socio> antiguedad = (Socio s1, Socio  s2) -> Integer.compare(s1.getFecha_ingreso().getYear(), s2.getFecha_ingreso().getYear());
        Collection<Socio> socios = mapa_socios.values();
        List<Socio> ls = new ArrayList<>(socios);
        Collections.sort(ls, antiguedad);
        for(Socio s : ls){
            System.out.println(s);
        }
    }
    
    public void listarPorAltaAnteriorAUnAnoDeterminado(){
        Collection<Socio> socios = mapa_socios.values();
        List<Socio> ls = new ArrayList<>(socios);
        System.out.print("Introduce el año: ");
        int a = new Scanner(System.in).nextInt();
        for(Socio s : socios){
            if((a - s.getFecha_ingreso().getYear()) >= 1){
                System.out.println(s);
            }
        }  
    }
    
    public void guardarCambios(){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo_bin))){
            oos.writeObject(mapa_socios);
            System.out.println("Cambios guardados correctamente en '" + archivo_bin +  "'.");
        } catch (IOException e){
            e.getMessage();
        }
    }
    
}
