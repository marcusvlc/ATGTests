import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import grafo.*;
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
	public void testAlphabeticGraph() throws Exception {
		library = new BibliotecaController();
		library.readGraph("alphabeticgraph.txt");
	}
	

}
