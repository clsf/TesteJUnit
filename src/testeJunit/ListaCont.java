package testeJunit;

import java.util.ArrayList;
import java.util.List;


public class ListaCont {

	private List<Contato> lista = new ArrayList<>();
	
	public void add(String name, Integer number) {
		Contato c = new Contato(name,number);
		lista.add(c);
	}
	
	public void remove(String name) {
		Contato result = lista.stream().filter(x -> x.getName1() == name).findFirst().orElse(null);
		if(result!=null) {
			lista.remove(result);
		}

	}
	public Integer qtd() {
		return lista.size();
	}
}
