package aplicacion;

import mates.Matematicas;

/**
 * Esta clase representa la aplicación principal que calcula una aproximación
 * del número Pi utilizando el método de Montecarlo implementado en la clase Matematicas.
 * 
 * <p>
 * El programa espera un argumento de línea de comandos que representa el número de
 * aproximaciones a utilizar para calcular Pi mediante el método de Montecarlo.
 * </p>
 * 
 * <p>
 * El número de aproximaciones debe ser un entero positivo.
 * </p>
 * 
 * <p>
 * El resultado del cálculo se imprime en la consola.
 * </p>
 * 
 * @since 1.0
 */
public class Principal {
    /**
     * El método principal de la aplicación.
     * 
     * @param args argumentos de línea de comandos, se espera un argumento que
     *             representa el número de aproximaciones para calcular Pi.
     */
    public static void main(String[] args) {
        // Convierte el argumento de línea de comandos a un entero, calcula una aproximación del número Pi utilizando el método de Montecarlo y lo imprime
        System.out.println("Aproximación de pi con " + args[0] + " pasos: " + Matematicas.generarNumeroPiLambda(Integer.parseInt(args[0])));
    }
}
