package palabras;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
import java.math.*;

public class CalculadoraDistancias{
    /**
     * * Calcula la distancia de edición, tal y como la expone
     * * Jurafsky entre las cadenas `s1` y `s2`.
     *
     * @param s1 Primera cadena.
     * @param s2 Segunda cadena.
     * @return La distancia de edición entre `s1` y `s2`.
     */
    public static int calcularDistancia(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        // Creamos una matriz para almacenar la distancia de edición parcial
        int[][] distanciaParcial = new int[m + 1][n + 1];

	// Convertimos las cadenas en arrays de caracteres para comparar dos letras de s1 y s2 y poder llevar a cabo las operaciones del programa
	char[] X = s1.toCharArray();
	char[] Y = s2.toCharArray();

        // Caso base: la distancia de una cadena vacía a otra de longitud n requiere n operaciones
        for (int i = 0; i < m + 1; i++) {
            distanciaParcial[i][0] = i;
        }
        // La distancia de una cadena de longitud m a una cadena vacía requiere m operaciones
        for (int j = 0; j < n + 1; j++) {
            distanciaParcial[0][j] = j;
        }

        // Llenar la matriz distanciaParcial
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if ((X[i - 1]) == (Y[j - 1])) {
                    distanciaParcial[i][j] = distanciaParcial[i - 1][j - 1];
		    // Caracteres iguales, no hay costo adicional o aumento en la distancia
                } else {
                    // Costo de la operación de edición:
                    // Insertar (distanciaParcial[i][j-1]), Eliminar (distanciaParcial[i-1][j]), o Sustituir (distanciaParcial[i-1][j-1])
                    distanciaParcial[i][j] = 1 + Math.min(distanciaParcial[i][j - 1], // Insertar
                                            Math.min(distanciaParcial[i - 1][j], // Eliminar
                                                     distanciaParcial[i - 1][j - 1])); // Sustituir
                }
            }
        }

        // La distancia de edición entre las cadenas completas s1 y s2
        return distanciaParcial[m][n];
    }
}
