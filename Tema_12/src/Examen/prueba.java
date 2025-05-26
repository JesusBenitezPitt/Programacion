/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Examen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Stream;

/**
 *
 * @author usuario
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Producto> lProducto = metodo1();
        System.out.println(lProducto);
        lProducto = new ArrayList<>(new LinkedHashSet<>(lProducto));
        System.out.println(lProducto);
        Map<Integer, Producto> mapaProductos = metodo2(lProducto);
        System.out.println(mapaProductos);
        Set<Integer> g1 = new TreeSet<>();
        g1.add(1);
        g1.add(2);
        g1.add(3);
        g1.add(5);
        Set<Integer> g2 = new TreeSet<>();
        g2.add(2);
        g2.add(4);
        metodo5(g1, g2);
        metodo6(g1, g2);
        metodo7();
    }
    
    public static List<Producto> metodo1(){
        List<Producto> lProductos = new ArrayList<>();
        lProductos.add(new Producto(1, "p1", 10));
        lProductos.add(new Producto(2, "p2", 5));
        lProductos.add(new Producto(3, "p3", 20));
        lProductos.add(new Producto(4, "p4", 3));
        lProductos.add(new Producto(1, "p1"));
        
        return lProductos;
    }
    
    public static Map<Integer, Producto> metodo2(List<Producto> lProductos){
        Map<Integer, Producto> mapaProductos = new TreeMap<>();
        int indice = 0;
        for(Producto p : lProductos){
            mapaProductos.put(indice, p);
            indice ++;
        }
        return mapaProductos;
    }
    
    public static Map<String, Integer> metodo3(Map<Integer, Producto> mapaProductos){
        Map<String, Integer> resultados = new TreeMap<>();
        int mayores= 0, menores = 0;
        Collection<Producto> valores = mapaProductos.values();
        for(Producto p : valores){
            if(p.getStock() >= 5){
                mayores++;
            } else if (p.getStock() < 5){
                menores ++;
            }
        }
        resultados.put("mayores", mayores);
        resultados.put("menores", menores);
        return resultados;
    }
    
    public static void metodo5(Set<Integer> g1, Set<Integer> g2){
        System.out.println(g1);
        System.out.println(g2);
        g2.addAll(g1);
        System.out.println(g2);
    }
    
    public static void metodo6(Set<Integer> g1, Set<Integer> g2){
        System.out.println(g1);
        System.out.println(g2);
        g1.removeAll(g2);
        System.out.println(g1);
    }
    
    public static void metodo7(){
        List<String> palabras = List.of("java", "python", "java", "c++", "java", "python");
        Map<String, Integer> recuento_de_palabras = new TreeMap<>();
        for(String palabra : palabras){
            int contador = Collections.frequency(palabras, palabra);
            recuento_de_palabras.put(palabra, contador);
        }
        
        System.out.println(recuento_de_palabras);
    }
    
}