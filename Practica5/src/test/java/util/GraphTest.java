package pr2;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.List;
import java.util.ArrayList;

public class GraphTest{
  /**
   * Prueba agregando un vértice al gráfico.
   * Verifica que el gráfico contenga el vértice después de haberlo agregado.
   */
  @Test
  public void addVertex(){
	  Graph<Integer> g = new Graph<>();
	  g.addVertex(1);
	  assertTrue(g.containsVertex(1));
  }
  
  /**
   * Prueba de comprobación de la existencia de un vértice en el gráfico.
   * Comprueba que el gráfico no contiene el vértice cuando este no ha sido agregado.
   */
  @Test
  public void containsVertexFalse(){
	  Graph<Integer> g = new Graph<>();
	  assertFalse(g.containsVertex(1));
  }
  
  /**
   * Prueba agregando una arista al gráfico.
   * Verifica que el gráfico contenga la arista después de haberla agregado.
   */
  @Test
  public void addEdge1(){
	  try{
		  Graph<Integer> g = new Graph<>();
		  g.addEdge(1, 2);
		  assertTrue(g.containsVertex(1) && g.containsVertex(2) && g.obtainAdjacents(1).contains(2));
	  }catch(Exception e){
		  System.err.println(e);
	}
  }


    /*
     * Esta prueba comprueba que el método `shortestPath(V v1, V v2)` encuentre 
     * la mejor ruta entre `v1` y `v2` cuando exista.
     *
     */
    @Test
    public void shortestPathFindsAPath(){
        System.out.println("\nTest shortestPathFindsAPath"); 
        System.out.println("----------------------------"); 
        // Construimos el grafo
        Graph<Integer> g = new Graph<>();
        g.addEdge(1, 2);
        g.addEdge(1, 5);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(5, 4);

        // Construimos el camino esperado
        List<Integer> expectedPath = new ArrayList<>();
        expectedPath.add(1);
        expectedPath.add(5);
        expectedPath.add(4);
        // Comprobamos si la ruta devuelta es igual a la esperada.
        assertEquals(expectedPath, g.shortestPath(1, 4));
    }
}

