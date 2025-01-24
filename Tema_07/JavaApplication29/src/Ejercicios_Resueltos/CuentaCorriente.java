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
        public String titular;
        private double saldo;
        static private String nombre_banco = "International Java Bank";

        CuentaCorriente(String dni, String titular){
            this(dni, titular, 0);
        }
        
        CuentaCorriente(String dni, double saldo){
            this(dni, "Sin Asignar", saldo);
        }

        CuentaCorriente(String dni, String titular, double saldo){
            this.dni = dni;
            this.titular = titular;
            this.saldo = saldo;
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
            System.out.println("Banco: " + getBanco());
        }
        
        static void setBanco(String nuevonombre){
            nombre_banco = nuevonombre;
        }
        
        static String getBanco(){
            return nombre_banco;
        }
    }
