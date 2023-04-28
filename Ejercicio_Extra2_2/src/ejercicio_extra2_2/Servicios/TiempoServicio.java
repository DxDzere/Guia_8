/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_extra2_2.Servicios;

import ejercicio_extra2_2.Entidades.Tiempo;
import java.util.Scanner;

/**
 *
 * @author Zere
 */
public class TiempoServicio {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Tiempo crearTiempo(){
        System.out.println("Ingrese una hora");
        int hora = leer.nextInt();
        while(hora<0 || hora >23){
            System.out.println("Hora incorrecta. Ingrese de nuevo");
            hora = leer.nextInt();
        }
        System.out.println("Ingrese Minutos");
        int minutos = leer.nextInt();
        while(hora<0 || hora >59){
            System.out.println("Minutos incorrecta. Ingrese de nuevo");
            minutos = leer.nextInt();
        }
        System.out.println("Ingrese segundos");
        int segundos = leer.nextInt();
        while(hora<0 || hora >59){
            System.out.println("Segundos incorrecta. Ingrese de nuevo");
            segundos = leer.nextInt();
        }
        
        return new Tiempo(hora, minutos, segundos);
    }
    
    private void restarHora(Tiempo t){
        t.setHora(t.getHora()-1);
    }
    
    private void restarMinutos(Tiempo t){
        t.setMinutos(t.getMinutos()-1);
    }
    
    private void restarSegundos(Tiempo t){
        t.setSegundos(t.getSegundos()-1);
    }
    
    public void imprimirHora(Tiempo t){
        System.out.println(t.getHora()+":"+t.getMinutos()+":"+t.getSegundos());
        pausa(1000);
        correrHora(t);
    }
    
    private void correrHora(Tiempo t){
        for (int i = t.getHora(); i >= 0; i++) {            
            for (int j = t.getMinutos(); j > 0; j++) {
                for (int k = t.getSegundos(); k > 0; k++) {
                    System.out.println(t.getHora()+":"+t.getMinutos()+":"+t.getSegundos());
                    pausa(1000);
                    restarSegundos(t);
                }
                if(t.getSegundos()==0){
                    t.setSegundos(59);
                }
                restarMinutos(t);
            }
            if(t.getMinutos()==0){
                t.setMinutos(59);
            }
            restarHora(t);
        }
    }
    
    private void pausa(long sleeptime) {
        try {
            Thread.sleep(sleeptime);
        } catch (InterruptedException ex) {
        }
    }
}
