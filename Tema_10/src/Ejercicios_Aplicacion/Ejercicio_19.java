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
        
        cifrarArchivo(archivo_original, alfabeto_cod);
    }
    
    public static void cifrarArchivo(String org, String alfabeto_cod){
         String archivo_cifrado = "src/Ejercicios_Aplicacion/cifrado.txt";
         String texto_cifrado;
         char[] alfabeto = null;
         char[] codificado = null;
         try(BufferedReader lector = new BufferedReader(new FileReader(org)); BufferedReader lector_alfabeto = new BufferedReader(new FileReader(alfabeto_cod)); BufferedWriter escritor = new BufferedWriter(new FileWriter(archivo_cifrado))){
             String linea = lector_alfabeto.readLine();
             int cont = 1;
             while(linea != null){
                 if(cont == 1){
                     alfabeto = linea.toCharArray();
                 } else if (cont == 2) {
                     codificado = linea.toCharArray();
                 }
                 linea = lector_alfabeto.readLine();
                 cont++;
             }
             String linea2 = lector.readLine();
            while(linea2 != null){
                texto_cifrado = "";
                for(int i = 0; i < linea2.length(); i++){
                    boolean encontrado = false;
                    int f = 0;
                    while(f < alfabeto.length && !encontrado){
                        if(alfabeto[f] == linea2.charAt(i)){
                            encontrado = true;
                            texto_cifrado += codificado[f];
                        }
                        f++;
                    }
                }
            escritor.write(texto_cifrado);
            escritor.newLine();
            linea2 = lector.readLine();
            }
         } catch(IOException e){
             System.out.println(e.getMessage());
         }
    }
    
}
