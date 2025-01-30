/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_Resueltos.Ejercicio_11;

/**
 *
 * @author usuario
 */
public class Ejercicio_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista l1 = new Lista();
        Lista l2 = new Lista();
        l1.insertarFinal(1); l1.insertarFinal(2); l1.insertarFinal(3);
        l2.insertarFinal(10); l2.insertarFinal(20); l2.insertarFinal(30);
        
        Lista concatenacion = Lista.concatena(l1, l2);
        concatenacion.mostrar();
    }
    
}
