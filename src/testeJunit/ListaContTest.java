package testeJunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ListaContTest {

	@Test
	void test() {
		ListaCont c= new ListaCont();
		assertEquals(0,c.qtd());
		c.add("Claudia",2418);
		assertEquals(1,c.qtd());
		c.remove("Claudia");
		assertEquals(0,c.qtd());
		
	}

}
