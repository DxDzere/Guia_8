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
    
    
    public NIF crearNif(){
        System.out.println("Ingrese el numero de documento de la persona");
        long dni = leer.nextLong();
        String l = buscarLetra(dni);
        return new NIF(dni, l);
    }
    
    public void mostrar(NIF nif){
        System.out.println(nif.getDni()+"-"+nif.getLetra());
    }
    
    public String buscarLetra(long dni){
        String[] array = new String[23];
        for(int i = 0; i < array.length; i++) {
           switch(i){
               case 0:
                   array[i] = "T";
                   break;
               case 1:
                   array[i] = "R";
                   break;
               case 2:
                   array[i] = "W";
                   break;
               case 3:
                   array[i] = "A";
                   break;
               case 4:
                   array[i] = "G";
                   break;
               case 5:
                   array[i] = "M";
                   break;
               case 6:
                   array[i] = "Y";
                   break;
               case 7:
                   array[i] = "F";
                   break;
               case 8:
                   array[i] = "P";
                   break;
               case 9:
                   array[i] = "D";
                   break;
               case 10:
                   array[i] = "X";
                   break;
               case 11:
                   array[i] = "B";
                   break;
               case 12:
                   array[i] = "N";
                   break;
               case 13:
                   array[i] = "J";
                   break;
               case 14:
                   array[i] = "Z";
                   break;
               case 15:
                   array[i] = "S";
                   break;
               case 16:
                   array[i] = "Q";
                   break;
               case 17:
                   array[i] = "V";
                   break;
               case 18:
                   array[i] = "H";
                   break;
               case 19:
                   array[i] = "L";
                   break;
               case 20:
                   array[i] = "C";
                   break;
               case 21:
                   array[i] = "K";
                   break;
               case 22:
                   array[i] = "E";
                   break;
           }
        }
        
        return array[(int)dni%23];
    }
}
