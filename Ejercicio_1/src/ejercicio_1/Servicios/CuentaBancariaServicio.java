/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_1.Servicios;

import ejercicio_1.Entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Zere
 */
public class CuentaBancariaServicio {
   private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    public CuentaBancaria crearCuenta(){
        
        System.out.println("Introducir numero de cuenta");
        int numeroCuenta = leer.nextInt();
        
        System.out.println("Introducir DNI del cliente");
        long dniCliente = leer.nextLong();
        
        System.out.println("Introducir Saldo Actual");
        double saldoActual = leer.nextDouble();
        
        return new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);
    }
    
    public void Ingresar(double dinero, CuentaBancaria cb){
        cb.setSaldoActual(cb.getSaldoActual() + dinero);
    }
    
    public void Retirar(double dinero, CuentaBancaria cb){
        if(cb.getSaldoActual()>=dinero){
          cb.setSaldoActual(cb.getSaldoActual() - dinero);  
        }else{
            System.out.println("Su saldo es menor al monto ingresado");
            System.out.println("Se retiro: " + cb.getSaldoActual());
            cb.setSaldoActual(0);
        }
    }
    
    public void ExtraccionRapida(CuentaBancaria cb){
        double aux=cb.getSaldoActual()*0.2;
        
        
        System.out.println("Se retiro de tu cuenta: $" + aux);
        
        cb.setSaldoActual(cb.getSaldoActual()-aux);
    }
    
    public void consultarSaldo(CuentaBancaria cb){
        System.out.println("Su saldo es: $" + cb.getSaldoActual());
    }
    
    public String consultarDatos(CuentaBancaria cb){
        return "CuentaBancaria{" + "numeroCuenta=" + cb.getNumeroCuenta() + ", dniCliente=" + cb.getDniCliente() + ", saldoActual=" + cb.getSaldoActual() + '}';
    }
}

