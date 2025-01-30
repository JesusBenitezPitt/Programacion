/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_Resueltos.Ejercicio_11;

/**
 *
 * @author usuario
 */
public class Ejercicio_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista L1 = new Lista();
        Lista L2 = new Lista();
        L1.insertarFinal(4);
        L1.insertarFinal(5);
        L1.insertarFinal(6);
        L1.mostrar();
        L1.insertarPrincipio(3);
        L1.insertarPrincipio(2);
        L1.insertarPrincipio(1);
        L1.mostrar();
        L1.insertarEnIndice(2, 99);
        L1.mostrar();
        L1.eliminarEnIndice(2);
        L1.mostrar();
        System.out.println(L1.buscarElemento(4));
        L2.insertarFinal(10);
        L2.insertarFinal(20);
        L2.insertarFinal(30);
        L2.insertarFinal(40);
        L2.insertarFinal(50);
        L2.mostrar();
        L1.insertarFinal(L2);
        L1.mostrar();
    }
    
}
