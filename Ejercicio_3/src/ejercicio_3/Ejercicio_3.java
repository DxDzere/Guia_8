/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_3;
import ejercicio_3.Entidad.Persona;
import ejercicio_3.Servicios.PersonaServicio;
/**
 *
 * @author Zere
 */
public class Ejercicio_3 {
    static void porcentajeMayores(boolean[] bool) {

        double cont = 0;

        for (int i = 0; i < bool.length; i++) {

            if (bool[i] == true) {
                cont++;
            }

        }
        System.out.println("El promedio de mayores de edad es: " + (cont / bool.length) * 100 + " % ");

    }

    static void promediopeso(int[] n) {
        double cont1 = 0, cont2 = 0, cont3 = 0;
        for (int i = 0; i < n.length; i++) {
            switch (n[i]) {
                case -1:
                    cont1++;
                    break;
                case 0:
                    cont2++;
                    break;
                case 1:
                    cont3++;
                    break;

            }

        }
        System.out.println("el promedio de personas con sobre peso es = " + (cont3 / n.length) * 100 + " % ");
        System.out.println("el promedio de personas con peso ideal = " + (cont2 / n.length) * 100 + " % ");
        System.out.println("el promedio de personas con bajo peso es = " + (cont1 / n.length) * 100 + " % ");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        PersonaServicio ps = new PersonaServicio();

        Persona p1 = ps.crearPersona();
        Persona p2 = ps.crearPersona();
        Persona p3 = ps.crearPersona();
        Persona p4 = ps.crearPersona();

        boolean[] mayoresOmenores = new boolean[4];
        int[] pesoIdeal = new int[4];

        for (int i = 0; i < mayoresOmenores.length; i++) {
            switch (i) {
                case 0:
                    mayoresOmenores[i] = ps.esMayorDeEdad(p1);
                    break;
                case 1:
                    mayoresOmenores[i] = ps.esMayorDeEdad(p2);
                    break;
                case 2:
                    mayoresOmenores[i] = ps.esMayorDeEdad(p3);
                    break;
                case 3:
                    mayoresOmenores[i] = ps.esMayorDeEdad(p4);
                    break;
            }
        }

        for (int i = 0; i < pesoIdeal.length; i++) {
            switch (i) {
                case 0:
                    pesoIdeal[i] = ps.calculrIMC(p1);
                    break;
                case 1:
                    pesoIdeal[i] = ps.calculrIMC(p2);
                    break;
                case 2:
                    pesoIdeal[i] = ps.calculrIMC(p3);
                    break;
                case 3:
                    pesoIdeal[i] = ps.calculrIMC(p4);
                    break;
            }

        }
        porcentajeMayores(mayoresOmenores);
        promediopeso(pesoIdeal);
    }
}
