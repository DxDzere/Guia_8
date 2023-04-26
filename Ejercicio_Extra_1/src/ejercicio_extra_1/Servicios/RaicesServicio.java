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
        
        return this.getDiscriminante(r) > 0;
    }
    
    public boolean tieneRaiz(Raices r){
        return this.getDiscriminante(r) == 0;
    }
    
    public void obtenerRaices(Raices r){
        if(this.tieneRaices(r)){
            double x1 = ((-r.getB())+Math.sqrt(getDiscriminante(r)))/(2*r.getA());
            double x2 = ((-r.getB())-Math.sqrt(getDiscriminante(r)))/(2*r.getA());
            System.out.println("El 1er resultado es: "+x1);
            System.out.println("El 2do resultado es: "+x2);
        }
    }
    
    public void obtenerRaiz(Raices r){
        if(this.tieneRaiz(r)){
            double x = (-r.getB())/(2*r.getA());
            System.out.println("La unica solucion posible es: " + x);
        }
    }
    
    public void calcular(Raices r){
        if (this.tieneRaices(r)) {
            this.obtenerRaices(r);
        }else if(this.tieneRaiz(r)){
            this.obtenerRaiz(r);
        }else{
            System.out.println("No tiene soluciones reales");
        }
    }
}
