/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Resueltos.Ejercicio_01_al_03;

/**
 *
 * @author usuario
 */
public class Ejercicio_03 {
    public static void main(String[] args) {
        HoraExacta a = new HoraExacta(11, 11, 11);
        HoraExacta b = new HoraExacta(22, 22, 22);
        HoraExacta c = new HoraExacta(11, 11, 11);
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
    }
}
