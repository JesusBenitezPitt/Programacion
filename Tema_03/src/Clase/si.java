/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clase;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class si {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip, masc;
        
        System.out.println("Escribe una direccion ip: ");
        ip = sc.nextLine();
        System.out.println("Escribe la mascara de red: ");
        masc = sc.nextLine();
        
        comprobarIp(ip);
        comprobarMasc(masc);
        
    }
    
    public static void comprobarMasc(String ip){
        String[] mascSeparada;
        String mascara = "";
        boolean esValida = true;
        mascSeparada = ip.split("\\.");
        
        for(int i = 0; i < mascSeparada.length && esValida == true; i++){
            if(mascSeparada[i].length() > 3 || Integer.parseInt(mascSeparada[i]) > 255){
                System.out.println("La ip no es valida");
                esValida = false;
            }else{
                int exp = 0;
                int binario = 0;
                int num = Integer.parseInt(mascSeparada[i]);
                while(num != 0){
                    int digito = num % 2;
                    binario = (int) (binario + digito * Math.pow(10, exp));
                    exp++;
                    num = num/2;
                }
                mascara += Integer.toString(binario);
                if(i != 3){
                    mascara += ".";
                }
                System.out.println(i+1 + ": " + mascSeparada[i] + " " + binario);
                if(Integer.toString(binario).contains("01")){
                    System.out.println("No es valida");
                }
            }
        }
        System.out.println(mascara);
    }
    
    public static void comprobarIp(String ip){
        String[] ipSeparada;
        String IP = "";
        boolean esValida = true;
        ipSeparada = ip.split("\\.");
        
        for(int i = 0; i < ipSeparada.length && esValida == true; i++){
            if(ip.length() < 15 || ipSeparada[i].length() > 3 || Integer.parseInt(ipSeparada[i]) > 255){
                System.out.println("La ip no es valida");
                esValida = false;
            }else{
                int exp = 0;
                int binario = 0;
                int num = Integer.parseInt(ipSeparada[i]);
                while(num != 0){
                    int digito = num % 2;
                    binario = (int) (binario + digito * Math.pow(10, exp));
                    exp++;
                    num = num/2;
                }
                if(Integer.toString(binario).length() < 8){
                    for(int j = 1; j <= 8-Integer.toString(binario).length(); j++){
                        IP += "0";
                    }
                }
                IP += Integer.toString(binario);
                if((i != 3)){
                    IP += ".";
                }
                System.out.println(i+1 + ": " + ipSeparada[i]);
            }
        }
        System.out.println(IP);
    }
    
}
