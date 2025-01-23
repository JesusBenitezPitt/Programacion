/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_Resueltos;

/**
 *
 * @author usuario
 */
public class CuentaCorriente {
        String dni;
        String titular;
        double saldo;

        CuentaCorriente(String dni, String titular){
            this.dni = dni;
            this.titular = titular;
            this.saldo = 0;
        }

        boolean SacarDinero(double cantidad){
            boolean operacionPosible;
            if(saldo >= cantidad){
                saldo -= cantidad;
                operacionPosible = true;
            } else {
            System.out.println("No hay saldo suficiente.");
            operacionPosible = false;
            }
            return (operacionPosible);
        }
        
        void ingreso(double cantidad){
            saldo += cantidad;
        }
        
        void mostrarInformacion(){
            System.out.println("Nombre: " + titular);
            System.out.println("DNI: " + dni);
            System.out.println("Saldo: " + saldo + " euros.");
        }
    }
