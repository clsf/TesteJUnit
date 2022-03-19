package testeJunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContatoTest {

	@Test
	void test() {
		Contato cont = new Contato("Claudia",122);
		
		assertEquals(122,cont.getNumber1());
		assertEquals("Claudia",cont.getName1());

	}

}
