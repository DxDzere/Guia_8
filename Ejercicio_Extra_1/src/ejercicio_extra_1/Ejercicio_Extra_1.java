/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_extra_1;

import ejercicio_extra_1.Entidades.Raices;
import ejercicio_extra_1.Servicios.RaicesServicio;

/**
 *
 * @author Zere
 */
public class Ejercicio_Extra_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Raices r = new Raices(10,20,10);
        RaicesServicio rs = new RaicesServicio();
        
        rs.calcular(r);
    }
    
}
