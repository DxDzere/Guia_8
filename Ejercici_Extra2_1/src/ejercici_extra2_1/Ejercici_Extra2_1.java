/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercici_extra2_1;

import ejercici_extra2_1.Entidades.Fraccion;
import ejercici_extra2_1.Servicios.fraccionServicio;
import java.util.Scanner;

/**
 *
 * @author Zere
 */
public class Ejercici_Extra2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        fraccionServicio fs = new fraccionServicio();
        Fraccion fraccion = fs.crearFraccion();
        int rpta;
        do{               
        System.out.println("que desea hacer");
        System.out.println("");
        System.out.println("1-Sumar");
        System.out.println("2-Restar");
        System.out.println("3-Multiplicar");
        System.out.println("4-Dividir");
        System.out.println("5-Salir");
        System.out.println("");
        rpta = leer.nextInt();
        
        switch(rpta){
            case 1:
                fs.sumar(fraccion);
                break;
            case 2:
                fs.resta(fraccion);
                break;
            case 3:
                fs.multiplicar(fraccion);
                break;
            case 4:
                fs.dividir(fraccion);
                break;
            case 5:
                System.out.println("Adios");
                break;
            default:
                System.out.println("Opcion Incorrecta.");
                break;
        }
        }while(rpta != 5);
    }
    
}
