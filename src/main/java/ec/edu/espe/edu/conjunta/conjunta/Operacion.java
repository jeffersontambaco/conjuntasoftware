/*
@(#)Operacion.java     1.0 12/07/2017
*
*Copyright 2017 Conjunta All rights reserved.
*Conjunta Propietary. 
*/
/**
 *Clase Operacion generada todas las operaciones aritmeticas 
 */
package ec.edu.espe.edu.conjunta.conjunta;


public class Operacion {
     public int multiplicacion(int a, int b) {
        return a * b;
    }

    public int division(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            return 0;
        }
    }
}
