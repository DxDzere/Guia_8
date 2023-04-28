/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercici_extra2_1.Servicios;

import ejercici_extra2_1.Entidades.Fraccion;
import java.util.Scanner;

/**
 *
 * @author Zere
 */
public class fraccionServicio {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Fraccion crearFraccion(){
        System.out.println("Ingrese el 1er numerador");
        int num1=leer.nextInt();
        System.out.println("Ingrese el 1er denominador");
        int den1=leer.nextInt();
        System.out.println("Ingrese el 2do numerador");
        int num2=leer.nextInt();
        System.out.println("Ingrese el 2do denominador");
        int den2=leer.nextInt();
        
        return new Fraccion(den1, den2, num1, num2);
    }
    
    public void sumar(Fraccion f){
        int numSuma, denSuma;
        int mcd = mcd(f.getDen1(),f.getDen2());
        denSuma = (f.getDen1()*f.getDen2())/mcd;
        int a= denSuma/f.getDen1()*f.getNum1();
        int b= denSuma/f.getDen1()*f.getNum1();
        numSuma=a+b;
        System.out.println(""+numSuma+"/"+denSuma);
    }
    
    private int mcd(int a, int b){
        if (b==0) {
            return a;
        }else{
            return mcd(b, a%b);
        }
    }
    
    public void resta(Fraccion f){
        int numSuma, denSuma;
        int mcd = mcd(f.getDen1(),f.getDen2());
        denSuma = (f.getDen1()*f.getDen2())/mcd;
        int a= denSuma/f.getDen1()*f.getNum1();
        int b= denSuma/f.getDen1()*f.getNum1();
        numSuma=a-b;
        System.out.println(""+numSuma+"/"+denSuma);
    }
    
    public void multiplicar(Fraccion f){
        System.out.println(f.getNum1()*f.getNum2()+"/"+f.getDen1()*f.getDen2());
    }
    
    public void dividir(Fraccion f){
        System.out.println(f.getNum1()*f.getDen2()+"/"+f.getDen1()*f.getNum2());
    }
}
