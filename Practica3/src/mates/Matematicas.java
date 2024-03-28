package mates;

import java.util.stream.LongStream;
import java.util.Random;
/**
 * La clase Matematicas proporciona métodos para calcular aproximaciones de pi utilizando
 * el método de Montecarlo.
 * 
 * <p>
 * El método de Montecarlo es una técnica de simulación que utiliza números aleatorios
 * para resolver problemas numéricos. En este caso, se utiliza para aproximar el valor de Pi
 * generando puntos aleatorios dentro de un cuadrado unitario y contando cuántos caen dentro
 * de un círculo inscrito en ese cuadrado.
 * </p>
 */
public class Matematicas{
    /**
     * El método main es el punto de entrada principal para la clase Matematicas.
     * 
     * <p>
     * Genera una aproximación al número Pi mediante el método de
     * Montecarlo.
     * </p>
     *
     * @param pasos el número de pasos o iteraciones para generar puntos aleatorios
     * @param args los argumentos de la línea de comandos (no se utilizan en este caso)
     */ 
    public static void main(String[] args) {
        // Número de pasos o iteraciones para el método de Montecarlo
	long pasos = 1000000; 
	
        // Calcula la aproximación de pi utilizando el método de Montecarlo
	double piAproximado = generarNumeroPiLambda(pasos);

        // Imprime la aproximación de pi obtenida
	System.out.println("Aproximación de pi con " + pasos + " pasos: " + piAproximado); 
    }
    
    /**
     * Este método calcula una aproximación de pi utilizando el método de Montecarlo.
     *
     * <p>
     * Genera un número especificado de puntos aleatorios dentro de un cuadrado unitario,
     * calcula la distancia de cada punto al origen, y cuenta cuántos puntos caen dentro
     * del círculo unitario inscrito en el cuadrado. La relación entre los puntos dentro
     * del círculo y el total de puntos arroja una aproximación del valor de pi.
     * </p>
     *
     * @return una aproximación del valor de pi calculada con el método de Montecarlo
     */

    
    public static double generarNumeroPiLambda(long pasos) {
        Random random = new Random();

        // Utilizamos LongStream para generar una secuencia de números desde 0 hasta pasos-1
        long dentroDelCirculo = LongStream.range(0, pasos)
                                           .filter(i -> {
                                               double x = random.nextDouble();
                                               double y = random.nextDouble();
                                               double distancia = x * x + y * y;
                                               return distancia <= 1;
                                           })
                                           .count();

        return (double) dentroDelCirculo / pasos * 4;
    }
}
