/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercici_extra2_1.Entidades;

/**
 *
 * @author Zere
 */
public class Fraccion {
    private int den1, den2, num1,num2;

    public int getDen1() {
        return den1;
    }

    public void setDen1(int den1) {
        this.den1 = den1;
    }

    public int getDen2() {
        return den2;
    }

    public void setDen2(int den2) {
        this.den2 = den2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public Fraccion(int den1, int den2, int num1, int num2) {
        this.den1 = den1;
        this.den2 = den2;
        this.num1 = num1;
        this.num2 = num2;
    }

    public Fraccion() {
    }
}
