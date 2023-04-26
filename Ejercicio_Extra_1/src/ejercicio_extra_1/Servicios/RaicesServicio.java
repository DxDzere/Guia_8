/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_extra_1.Servicios;

import ejercicio_extra_1.Entidades.Raices;

/**
 *
 * @author Zere
 */
public class RaicesServicio {
    public double getDiscriminante(Raices r){
        
        return (Math.pow(r.getB(), 2)-4*r.getA()*r.getC());
    }
    
    public boolean tieneRaices(Raices r){
        
        return this.getDiscriminante(r)>=0;
    }
    
    public boolean tieneRaiz(Raices r){
        return this.getDiscriminante(r)==0;
    }
    
    public void obtenerRaices(Raices r){
        if(this.tieneRaices(r)){
            
        }
    }
    
    public void obtenerRaiz(Raices r){
        if(this.tieneRaiz(r)){
            
        }
    }
    
    public void calcular(Raices r){
        
    }
}
