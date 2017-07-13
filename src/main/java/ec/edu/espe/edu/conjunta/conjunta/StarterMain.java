/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.edu.conjunta.conjunta;

import java.util.Scanner;

/**
 *
 * @author jeffe
 */
public class StarterMain {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Operacion obj = new Operacion();
        int a, b;
        System.out.println("Ingrese valor 1 : ");
        a = leer.nextInt();
        System.out.println("Ingrese valor 2 : ");
        b = leer.nextInt();
        System.out.println("la suma es : " + obj.sumar(a, b));
        System.out.println("la resta es : " + obj.restar(a, b));
        System.out.println("la multiplicacion es : " + obj.multiplicacion(a, b));
        System.out.println("la division es : " + obj.division(a, b));
        System.out.println("la potencia es : " + obj.potencia(a, b));
        System.out.println("el modulo es : " + obj.modulo(a, b));
       

    }

}
