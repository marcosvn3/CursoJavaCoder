package generecis_12;

import java.util.List;

public class MetodosGen {
	// Esse metodo pega o ultimo elemento de uma lista
	// seja qual for seu tipo
	
	public static Object getUltimoNumero(List<?> lista) {
		return lista.get(lista.size()-1);
	}
	
	
	//Usando generics em um metodo
	// desse modo não é preciso se preocupar com cast
	// ja que é passado o tipo com que desejo trabalhar no metodo!
	public static <T> T getUltimo2(List<T> lista) {
		return lista.get(lista.size() -1);
	}
}
