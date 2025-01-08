/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clase;

/**
 *
 * @author usuario
 */
public class caracteres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char c = 'a';
        char c1 = 97;
        char c2 = '\u0061';
        System.out.println(c + " " + c1 + " " + c2);
        
        c = '\u2661';
        c1 = 9825;
        System.out.println(c + " " + c1);
        
        c = '\'';
        System.out.println(c);
        
        c = '\"';
        System.out.println(c);
        
        c = '\t';
        System.out.println("1" + c + "2");
        
        int e = 'a';
        System.out.println(e);
        
        e = '\u0061';
        System.out.println(e);
        
        c = 97;
        System.out.println(c);
        
        c = 'a';
        System.out.println((int)c);
        
        e = 97;
        System.out.println((char)e);
        
        e = 97;
        c = (char) e;
        System.out.println(c);
        
        c = 'a';
        e = c;
        System.out.println(e);
        
    }
    
}
