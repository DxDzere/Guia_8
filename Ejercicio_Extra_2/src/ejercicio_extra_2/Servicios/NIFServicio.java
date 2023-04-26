/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_extra_2.Servicios;

import ejercicio_extra_2.Entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author Zere
 */
public class NIFServicio {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    public NIF crearNif(String[] letra){
        System.out.println("Ingrese el numero de documento de la persona");
        long dni = leer.nextLong();
        String l = letra[(int)dni%23];
        return new NIF(dni, l);
    }
    
    public void mostrar(NIF nif){
        System.out.println(nif.getDni()+"-"+nif.getLetra());
    }
}
