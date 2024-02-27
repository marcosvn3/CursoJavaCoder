package generecis_12;

//Esse "tipo" so é especificado na hora de uso
public class CaixaComGenerics <TIPO>{
	
private TIPO coisa;
	
	public void guardar(TIPO coisa) {
		this.coisa = coisa;
	}
	
	public TIPO abrir() {
		return coisa;
	}
}
