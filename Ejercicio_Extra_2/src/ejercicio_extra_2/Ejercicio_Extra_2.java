/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_extra_2;

import ejercicio_extra_2.Entidades.NIF;
import ejercicio_extra_2.Servicios.NIFServicio;

/**
 *
 * @author Zere
 */
public class Ejercicio_Extra_2 {
    
    public static void main(String[] args) {
        NIFServicio ns = new NIFServicio();
        NIF nif1 = ns.crearNif();
        ns.mostrar(nif1);
        
    }  
}
