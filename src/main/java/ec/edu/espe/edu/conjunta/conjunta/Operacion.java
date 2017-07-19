/*.
 * Copyright 2017 PRUEBA_CONJUNTA.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ec.edu.espe.edu.conjunta.conjunta;

/**
 * .
 * Esta es la clase Operacion que contiene las operaciones aritmeticas.
 *
 * @author AyrtonWladimir
 * @author jhona
 * @author jeffe
 * @version 12/07/2017
 */
public class Operacion {

    public int sumar(final int num1, final int num2) {
        return num1 + num2;
    }

    public int restar(final int num1, final int num2) {
        return num1 - num2;
    }

    public int multiplicacion(final int a, final int b) {
        return a * b;
    }

    public int division(final int a, final int b) {
        if (b != 0) {
            return a / b;
        } else {
            return 0;
        }
    }

    public int modulo(final int a, final int b) {
        return a % b;
    }

    public int potencia(final int base, final int exponente) {

        return (int) (Math.pow(base, exponente));

    }
}
