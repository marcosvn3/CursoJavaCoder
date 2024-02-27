package generecis_12;

// Essa classe é uma implementação de um objeto
// mais generico possivel
public class CaixaSemGenerics {
	
	private Object coisa;
	
	public void guardar(Object coisa) {
		this.coisa = coisa;
	}
	
	public Object abrir() {
		return coisa;
	}
}
