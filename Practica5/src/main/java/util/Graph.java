package pr2;

import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.Collectors;
import java.util.function.Function;

public class Graph<V> {

    // Lista de adyacencia.
    private Map<V, Set<V>> adjacencyList = new HashMap<>();

    /**
     * Añade el vértice `v` al grafo.
     *
     * @param v vértice a añadir.
     * @return `true` si no estaba anteriormente y `false` en caso contrario.
     */
    public boolean addVertex(V v) {
        if (!adjacencyList.containsKey(v)) {
            adjacencyList.put(v, new HashSet<>());
            return true;
        }
        return false;
    }

    /**
     * Añade un arco entre los vértices `v1` y `v2` al grafo. En caso de
     * que no exista alguno de los vértices, lo añade también.
     *
     * @param v1 el origen del arco.
     * @param v2 el destino del arco.
     * @return `true` si no existía el arco y `false` en caso contrario.
     */
    public boolean addEdge(V v1, V v2) {
        if (!adjacencyList.containsKey(v1)) {
            addVertex(v1);
        }
        if (!adjacencyList.containsKey(v2)) {
            addVertex(v2);
        }
        if (!adjacencyList.get(v1).contains(v2)) {
            adjacencyList.get(v1).add(v2);
            return true;
        }
        return false;
    }

    /**
     * Obtiene el conjunto de vértices adyacentes a `v`.
     *
     * @param v vértice del que se obtienen los adyacentes.
     * @return conjunto de vértices adyacentes.
     */
    public Set<V> obtainAdjacents(V v) {
        return adjacencyList.get(v);
    }

    /**
     * Comprueba si el grafo contiene el vértice dado. 
     *
     * @param v vértice para el que se realiza la comprobación.
     * @return `true` si `v` es un vértice del grafo.
     */
    public boolean containsVertex(V v) {
        return adjacencyList.containsKey(v);
    }

    /**
     * Método `toString()` reescrito para la clase `Graph.java`.
     * @return una cadena de caracteres con la lista de adyacencia.
     */
    @Override
    public String toString() {
        return adjacencyList.entrySet().stream()
               .map(entry -> entry.getKey() + " -> " + entry.getValue())
               .collect(Collectors.joining("\n"));
    }

    /**
     * Obtiene, en caso de que exista, el camino más corto entre
     * `v1` y `v2`. En caso contrario, devuelve `null`.
     * 
     * @param v1 el vértice origen.
     * @param v2 el vértice destino.
     * @return lista con la secuencia de vértices del camino más corto
     * entre `v1` y `v2`
     **/
    public List<V> shortestPath(V v1, V v2) {
        if (!containsVertex(v1) ||!containsVertex(v2)) {
            return null;
        }
        Queue<V> queue = new ArrayDeque<>();
        queue.add(v1);
        Map<V, V> parentMap = new HashMap<>();
        while (!queue.isEmpty()) {
            V current = queue.poll();
            if (current.equals(v2)) {
                List<V> path = new ArrayList<>();
                while (current!= null) {
                    path.add(0, current);
                    current = parentMap.get(current);
                }
                return path;
            }
            for (V adjacent : obtainAdjacents(current)) {
                if (!parentMap.containsKey(adjacent)) {
                    parentMap.put(adjacent, current);
                    queue.add(adjacent);
                }
            }
        }
        return null;
    }
}

