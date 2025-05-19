/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_Resueltos.Ejercicio_14;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<LocalDate, Set<Registro>> mapa_temperaturas = new LinkedHashMap<>();
        mapa_temperaturas = Registro.cargarMapa("src/Ejercicios_Resueltos/Ejercicio_14/registros.dat", mapa_temperaturas);
        Set<Registro> temperaturas = new LinkedHashSet<>();
        int op;
        do{
            System.out.println("1. Nuevo registro.");
            System.out.println("2. Listar registros del dia.");
            System.out.println("3. Mostrar Estadisticas de un dia en concreto.");
            System.out.println("4. Salir.");
            System.out.print("Introduce una opcion: ");
            op = new Scanner(System.in).nextInt();
            switch(op){
                case 1 -> {
                    System.out.print("Introducir Temperatura: ");
                    double temperatura = new Scanner(System.in).useLocale(Locale.US).nextDouble();
                    temperaturas.add(new Registro(temperatura));
                    mapa_temperaturas.put(LocalDate.now(), temperaturas);
                }
                case 2 -> System.out.println(mapa_temperaturas);
                case 3 -> {
                    if(!mapa_temperaturas.isEmpty()){
                        System.out.println("Introduce el dia (dd/MM/yyyy): ");
                        String dia = new Scanner(System.in).next();
                        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                        LocalDate fecha = LocalDate.parse(dia, f);
                        if(mapa_temperaturas.get(fecha) != null){
                            Set<Registro> registros = mapa_temperaturas.get(fecha);
                            System.out.println(registros);
                            Comparator<Registro> c = (Registro o1, Registro o2) -> (int) Math.signum(o1.temperatura - o2.temperatura);
                            System.out.println("Maxima: " + Collections.max(registros, c));
                            System.out.println("Minima: " + Collections.min(registros, c));
                            double suma = 0;
                            for(Registro r : registros){
                                suma += r.temperatura;
                            }
                            System.out.println("Media: " + suma / registros.size());
                        } else {
                            System.out.println("No hay registros para ese dia.");
                        }
                    } else {
                        System.out.println("No hay registros guardados.");
                    }
                }
                case 4 -> {
                    System.out.println("Guardando registros...");
                    Registro.guardarRegistros("src/Ejercicios_Resueltos/Ejercicio_14/registros.dat", mapa_temperaturas);
                    System.out.println("Saliendo..");
                }
            }
        }while(op != 4);
    }
    
}
