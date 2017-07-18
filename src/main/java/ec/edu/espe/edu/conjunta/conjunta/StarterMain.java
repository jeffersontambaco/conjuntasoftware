/*
 * Copcionyright 2017 PRUEBA_CONJUNTA.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copciony of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ec.edu.espe.edu.conjunta.conjunta;

import java.util.Scanner;

/**
 * .
 * Esta es la clase Principal "StartedMain" la cual contiene las instancias de
 * la clase Operacion y OperacionFloat.
 *
 * @author AyrtonWladimir
 * @author jhona
 * 
 * 
 */
public class StarterMain {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Operacion obj = new Operacion();
        
        OperacionFloat obj1 = new OperacionFloat();
        char opcion;
    
        int numero1, numero2;
        System.out.println("Ingrese valor 1 : ");
        numero1 = leer.nextInt();
        System.out.println("Ingrese valor 2 : ");
        numero2 = leer.nextInt();
        System.out.println("la suma es : " + obj.sumar(numero1, numero2));
        System.out.println("la resta es : " + obj.restar(numero1, numero2));
        System.out.println("la multiplicacion es : "
                + obj.multiplicacion(numero1, numero2));
        //nuevo
        System.out.println("la division es : "
                + obj.division(numero1, numero2));
        System.out.println("la potencia es : "
                + obj.potencia(numero1, numero2));
        System.out.println("el modulo es : " + obj.modulo(numero1, numero2));
        System.out.println("\n");

        float c, d;
        do {
            System.out.println("\n");
            System.out.println("a. Operacion con int");
            System.out.println("b. Operacion con float");
            System.out.println("c. Salir");
            System.out.println("\n");
            opcion = leer.next().charAt(0);
            switch (opcion) {
                case 'a':
                    System.out.println("Ingrese valor 1 : ");
                    numero1 = leer.nextInt();
                    System.out.println("Ingrese valor 2 : ");
                    numero2 = leer.nextInt();
                    System.out.println("la suma es : "
                            + obj.sumar(numero1, numero2));
                    System.out.println("la resta es : "
                            + obj.restar(numero1, numero2));
                    System.out.println("la multiplicacion es : "
                            + obj.multiplicacion(numero1, numero2));
                    System.out.println("la division es : "
                            + obj.division(numero1, numero2));
                    System.out.println("\n");
                
                    break;
                case 'b':
                    System.out.println("Ingrese valor 1 : ");
                    c = leer.nextFloat();
                    System.out.println("Ingrese valor 2 : ");
                    d = leer.nextFloat();
                    System.out.println("la suma es : " + obj1.sumar(c, d));
                    System.out.println("la resta es : " + obj1.restar(c, d));
                    System.out.println("la multiplicacion es : "
                            + obj1.multiplicacion(c, d));
                    System.out.println("la division es : "
                            + obj1.division(c, d));
                    System.out.println("\n");
                    break;
                case 'c':
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Incorrecto");

            }
        } while (opcion != 'c');

    }

}
