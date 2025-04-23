package Ejercicios_Aplicacion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio_19 {
    public static void main(String[] args) {
        String archivo_original = "src/Ejercicios_Aplicacion/original.txt";
        String alfabeto_cod = "src/Ejercicios_Aplicacion/codec.txt";
    }
    
    public void cifrarArchivo(String org, String alfabeto_cod){
         String archivo_cifrado = "src/Ejercicios_Aplicacion/cifrado.txt";
         try(BufferedReader lector = new BufferedReader(new FileReader(org)); BufferedReader lector_alfabeto = new BufferedReader(new FileReader(alfabeto_cod)); BufferedWriter escritor = new BufferedWriter(new FileWriter(archivo_cifrado))){
         
         } catch(IOException e){
             System.out.println(e.getMessage());
         }
    }
    
}
