import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import grafo.*;
import junit.framework.Assert;
import biblioteca.*;

import org.junit.jupiter.api.Test;

class LibraryTests {
	
	public BibliotecaController library;
	public Graph negativeGraph;
	
	@Before
	public void init() throws Exception {


	}
	
	/**
	 * Teste para ler um grafo com vertices negativos
	 * @throws Exception
	 */
	@Test
	public void testReadNegativeGraph() throws Exception {
		library = new BibliotecaController();
		library.readGraph("negativegraph.txt");
	}
	
	/**
	 * Teste para ler um grafo com vertices alfabeticos
	 * @throws Exception
	 */
	@Test
	public void testReadAlphabeticGraph() throws Exception {
		library = new BibliotecaController();
		library.readGraph("alphabeticgraph.txt");
	}
	
	/**
	 * Teste para ler um grafo sem pesos e pequeno
	 * @throws Exception
	 */
	@Test
	public void testReadNormalGraph() throws Exception{
		library = new BibliotecaController();
		library.readGraph("normalGraph.txt");
	}
	
	/**
	 * Teste para ler um grafo sem pesos e de medio porte
	 * @throws Exception
	 */
	@Test
	public void testReadMediumSizeGraph() throws Exception {
		library = new BibliotecaController();
		library.readGraph("mediumSizeGraph.txt");
	}
	
	/**
	 * Teste para ler um grafo com pesos de tamanho pequeno.
	 * @throws Exception
	 */
	@Test
	public void testReadWeightedGraph() throws Exception {
		library = new BibliotecaController();
		library.readWeightGraph("weightedGraph.txt");

	}
	
	/**
	 * Teste para obter numero de vertices de um grafo
	 * @throws Exception
	 */
	@Test
	public void testNumberOfVertices() throws Exception {
		library = new BibliotecaController();
		library.readGraph("mediumSizeGraph.txt");
		library.readWeightGraph("weightedGraph.txt");
		assertEquals(library.getVertexNumber(1), 50);
		assertEquals(library.getVertexNumber(2), 7);
	}
	
	/**
	 * Teste para obter numero de arestas de um grafo
	 * @throws Exception
	 */
	@Test
	public void testNumberOfEdges() throws Exception {
		library = new BibliotecaController();
		library.readGraph("mediumSizeGraph.txt");
		library.readWeightGraph("weightedGraph.txt");
		assertEquals(library.getEdgeNumber(1), 25);
		assertEquals(library.getEdgeNumber(2), 6);

	}
	
	/**
	 * Teste para calcular o valor medio dos pesos das arestas
	 * @throws Exception
	 */
	@Test
	public void testMeanEdge() throws Exception {
		library = new BibliotecaController();
		library.readWeightGraph("weightedGraph.txt");
		Assert.assertEquals(library.getMeanEdge(1), -199.65, 0.000001);
	}
	
	
	
	

}
