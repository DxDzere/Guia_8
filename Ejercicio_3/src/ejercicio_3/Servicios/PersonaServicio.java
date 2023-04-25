/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_3.Servicios;

import ejercicio_3.Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Zere
 */
public class PersonaServicio {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    //Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve 
    //un booleano.

    public boolean esMayorDeEdad(Persona p){
        return p.getEdad()>18;
    }
    
    //Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario
    //y después se le asignan a sus respectivos atributos para llenar el objeto Persona. Además, 
    //comprueba que el sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se 
    //deberá mostrar un mensaje
    public Persona crearPersona(){
        System.out.println("Ingrese el nombre de la persona");
        String nombre= leer.next();
        System.out.println("Ingrese el DNI de la persona");
        long dni = leer.nextLong();
        System.out.println("Ingrese la edad");
        int edad= leer.nextInt();
        System.out.println("Ingrese peso");
        double peso= leer.nextDouble();
        System.out.println("Ingrese la altura");
        double altura= leer.nextDouble();
        System.out.println("ingrese el sexo (H|M|O)");
        char sexo= leer.next().toUpperCase().charAt(0);
        
        while(sexo!='H' && sexo!='M' && sexo !='O'){
            System.out.println("Caracter incorrecto, Ingrese nuevamente el sexo (H|M|O) ");
             sexo= leer.next().toUpperCase().charAt(0);     
      
        }
        return new Persona( nombre,edad,altura,sexo,peso,dni);
    }
    //Método /*calcularIMC(): calculara si la persona está en su peso ideal 
    //(peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor
    //      menor que 20, significa que la persona está por debajo de su peso ideal 
    //    y la función devuelve un -1. Si la fórmula da por resultado un número entre
    //  20 y 25 (incluidos), significa que la persona está en su peso ideal y la función 
    //devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25 
    //significa que la persona tiene sobrepeso, y la función devuelve un 1.

    public int calculrIMC(Persona p){
        
        if((p.getPeso()/Math.pow(p.getAltura(),2)<20)){
           return-1;
           
        }else if((p.getPeso()/Math.pow(p.getAltura(),2))<=25){
            return 0;
        }else{
            return 1;
        }
    }
}
