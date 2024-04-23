package palabras;

public class CalculadoraDistancias{
    /**
     * * Calcula la distancia de edició n, tal y como la expone
     * * Jurafsky entre las cadenas ` s1` y ` s2`.
     *
     * @param s1 Primera cadena.
     * @param s2 Segunda cadena.
     * @return La distancia de edición entre `s1` y `s2`.
     */
    public static int calcularDistancia(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        // Creamos una matriz para almacenar la distancia de edición parcial
        int[][] dp = new int[m + 1][n + 1];

        // Caso base: la distancia de una cadena vacía a otra de longitud n requiere n operaciones
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i;
        }
        // La distancia de una cadena de longitud m a una cadena vacía requiere m operaciones
        for (int j = 0; j <= n; j++) {
            dp[0][j] = j;
        }

        // Llenar la matriz dp
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1]; // Caracteres iguales, no hay costo adicional
                } else {
                    // Costo de la operación de edición:
                    // Insertar (dp[i][j-1]), Eliminar (dp[i-1][j]), o Sustituir (dp[i-1][j-1])
                    dp[i][j] = 1 + Math.min(dp[i][j - 1], // Insertar
                                            Math.min(dp[i - 1][j], // Eliminar
                                                     dp[i - 1][j - 1])); // Sustituir
                }
            }
        }

        // La distancia de edición entre las cadenas completas s1 y s2
        return dp[m][n];
    }

    public static void main(String[] args) {
        String s1 = "kitten";
        String s2 = "sitting";

        int distancia = calcularDistancia(s1, s2);
        System.out.println("La distancia de edición entre '" + s1 + "' y '" + s2 + "' es: " + distancia);
    }
}

