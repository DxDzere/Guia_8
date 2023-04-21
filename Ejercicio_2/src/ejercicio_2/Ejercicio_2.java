/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_2;

import ejercicio_2.Entidades.Cafetera;
import ejercicio_2.Servicios.CafeteraServicio;
import java.util.Scanner;

/**
 *
 * @author Zere
 */
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cafetera c = new Cafetera(10000,1000);
        CafeteraServicio cs = new CafeteraServicio();
        
        System.out.println("Ingrese el tamaño de la taza");
        cs.servirTaza(leer.nextInt(), c);
        
        System.out.println("Ingrese el tamaño de la taza");
        cs.servirTaza(leer.nextInt(), c);
        
        System.out.println("Ingrese una cantidad de cafe");
        cs.agregarCafe(leer.nextInt(), c);
        System.out.println(c.getCantidadActual());
    }
    
    
}
