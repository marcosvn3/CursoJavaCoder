package generecis_12;

//O "T" so é especificado na hora de uso assim 
// fazendo com que nao se precise usar o cast
// evitando problemas na hora de compilar
public class CaixaComGenerics <T>{
	
private T coisa;
	
	public void guardar(T coisa) {
		this.coisa = coisa;
	}
	
	public T abrir() {
		return coisa;
	}
}
