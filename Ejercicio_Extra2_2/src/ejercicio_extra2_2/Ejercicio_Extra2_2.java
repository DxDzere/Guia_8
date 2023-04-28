/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_extra2_2;

import ejercicio_extra2_2.Entidades.Tiempo;
import ejercicio_extra2_2.Servicios.TiempoServicio;

/**
 *
 * @author Zere
 */
public class Ejercicio_Extra2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TiempoServicio ts = new TiempoServicio();
        Tiempo t = ts.crearTiempo();
        
        ts.imprimirHora(t);
    }
    
}
