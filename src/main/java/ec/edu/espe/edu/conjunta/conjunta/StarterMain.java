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
        OperacionesFloat obj1 = new OperacionesFloat();
        int op;
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
       
        float c, d;
        do {
            System.out.println("1. Operacion con int");
            System.out.println("2. Operacion con float");
            System.out.println("3. Salir");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Ingrese valor 1 : ");
                    a = leer.nextInt();
                    System.out.println("Ingrese valor 2 : ");
                    b = leer.nextInt();
                    System.out.println("la suma es : " + obj.sumar(a, b));
                    System.out.println("la resta es : " + obj.restar(a, b));
                    System.out.println("la multiplicacion es : " + obj.multiplicacion(a, b));
                    System.out.println("la division es : " + obj.division(a, b));
                    break;
                case 2:
                    System.out.println("Ingrese valor 1 : ");
                    c = leer.nextFloat();
                    System.out.println("Ingrese valor 2 : ");
                    d = leer.nextFloat();
                    System.out.println("la suma es : " + obj1.sumar(c, d));
                    System.out.println("la resta es : " + obj1.restar(c, d));
                    System.out.println("la multiplicacion es : " + obj1.multiplicacion(c, d));
                    System.out.println("la division es : " + obj1.division(c, d));
                    break;
                case 3:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Incorrecto");

            }
        } while (op != 3);
        

    }

}
