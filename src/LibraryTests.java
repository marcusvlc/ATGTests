import static org.junit.Assert.*;

import org.junit.Assert;

import biblioteca.*;
import grafo.*;
import org.junit.Before;
import org.junit.Test;

public class LibraryTests {

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
	
	/**
	 * Teste para verificar se um grafo eh conectado
	 * @throws Exception
	 */
	@Test
	public void testIsConnected() throws Exception {
		library = new BibliotecaController();
		library.readGraph("normalGraph.txt");

		assertTrue(library.connected(1));
		
		library.readGraph("desconnectedGraph.txt");
		
		assertFalse(library.connected(2));


	}
	
	
	/**
	 * O código lança uma exceção de NullPointerException na classe BibliotecaController linha 393 na ordenação do array WeightedEdge,
	 * para o teste de um grafos com peso positivo e negativo.
	 * @throws Exception
	 */
	@Test(expected = NullPointerException.class)
	public void testMSTNegativeWeightGraph() throws Exception {
		library = new BibliotecaController();
		library.readWeightGraph("negativeWeightedGraph.txt");
		library.readWeightGraph("weightedGraph.txt");
		
		library.MST(2);
		library.MST(1);
	}
	 /**
	  * o código lança uma exceção de ArrayIndexOutOfBoundsException na linha 387, para o teste de um grafo grande.
	  * @throws Exception
	  */
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testMSTLargeGraph() throws Exception {
		library = new BibliotecaController();
		library.readWeightGraph("largeGraph.txt");
		
		
		library.MST(1);
	}
	

}
