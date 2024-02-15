package mates;

import java.util.Random;

public class Matematicas{
    /**
     * * Genera una aproximación al número Pi mediante el método de
     * * Montecarlo. El parámetro `pasos` indica el número de puntos
     * * generado.
     * */
    public static void main(String[] args) {
        long pasos = 1000000;
        double piAproximado = generarNumeroPiIterativo(pasos);
        System.out.println("Aproximación de pi con " + pasos + " pasos: " + piAproximado);
    }

    public static double generarNumeroPiIterativo(long pasos) {
        Random random = new Random();
        long dentroDelCirculo = 0;

        for (long i = 0; i < pasos; i++) {
            double x = random.nextDouble();
            double y = random.nextDouble();

            double distancia = x * x + y * y;

            if (distancia <= 1) {
                dentroDelCirculo++;
            }
        }

        return (double) dentroDelCirculo / (double) pasos * 4;
    }
}
       
