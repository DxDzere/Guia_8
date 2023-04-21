/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_1;

import ejercicio_1.Entidades.CuentaBancaria;
import ejercicio_1.Servicios.CuentaBancariaServicio;
import java.util.Scanner;

/**
 *
 * @author Zere
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
       int rpta;
       double rpta2;
       CuentaBancariaServicio cbs = new CuentaBancariaServicio();
       CuentaBancaria cb = cbs.crearCuenta();
       
       do{               
        System.out.println("que desea hacer");
        System.out.println("");
        System.out.println("1-ingresar dinero");
        System.out.println("2-retirar dinero");
        System.out.println("3-extraccion rapida");
        System.out.println("4-Consultar saldo");
        System.out.println("5-Consultar Datos");
        System.out.println("6-Salir");
        System.out.println("");
        rpta = leer.nextInt();
        
        switch(rpta){
            case 1:
                System.out.println("Cuanto dinero quiere ingresar a su cuenta");
                rpta2 = leer.nextDouble();
                cbs.Ingresar(rpta2, cb);
                System.out.println("");
                break;
            case 2:
                System.out.println("Cuanto dinero quiere retirar a su cuenta");
                rpta2 = leer.nextDouble();
                cbs.Retirar(rpta2, cb);
                System.out.println("");
                break;
            case 3:
                cbs.ExtraccionRapida(cb);
                System.out.println("");
                break;
            case 4:
                cbs.consultarSaldo(cb);
                System.out.println("");
                break;
            case 5:
                System.out.println(cbs.consultarDatos(cb));
                System.out.println("");
                break;
            case 6:
                break;
        }
        }while(rpta != 6);
    }
    
}
