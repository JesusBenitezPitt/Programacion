/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aplicacion;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h, m, s, incrementarS;
        
        do{
            System.out.print("Introduce la hora: ");
            h = sc.nextInt();
        } while(h > 23);
        
        do{
            System.out.print("Introduce los minutos: ");
            m = sc.nextInt();
        } while(m > 59);
        
        do{
            System.out.print("Introduce los segundos: ");
            s = sc.nextInt();
        } while(s > 59);
        
        System.out.println(h + ":" + m + ":" +  s);
        
        System.out.println("Segundos quieres incrementar la hora: ");
        incrementarS = sc.nextInt();
        
        
        for(int i = 0; i < incrementarS; i++){
            s++;
        
            if(s > 59){
                s = 0;
                m++;
                if(m > 59){
                    m = 0;
                    h++;
                    if(h > 23){
                        h = 0;
                    }
                }
            }
        }
        
        System.out.println(h + ":" + m + ":" +  s);
        
        
    }
    
}
