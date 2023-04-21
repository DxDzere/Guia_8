/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_2.Servicios;


import ejercicio_2.Entidades.Cafetera;


/**
 *
 * @author Zere
 */
public class CafeteraServicio {
    
    public void llenarCafetera(Cafetera c){
        c.setCantidadActual(c.getCantidadMaxima());
    }
    
    public void servirTaza(int taza, Cafetera c){
        if(c.getCantidadActual()>=taza){
            c.setCantidadActual(c.getCantidadActual()-taza);
            System.out.println("La taza se lleno por completo");
        }else{
            System.out.println("La taza no se lleno");
            System.out.println("La taza quedo con: " + c.getCantidadActual()+ " cafe.");
            vaciarCafetera(c);
        }
    }
    
    public void vaciarCafetera(Cafetera c){
        c.setCantidadActual(0);
    }
    
    public void agregarCafe(int cafe, Cafetera c){
        c.setCantidadActual(c.getCantidadActual()+cafe);
    }
}
