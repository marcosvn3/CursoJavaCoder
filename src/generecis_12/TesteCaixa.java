package generecis_12;

public class TesteCaixa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaixaSemGenerics caixaA = new CaixaSemGenerics();
		caixaA.guardar(2.5);
		
		
		//o grande problema nessa class é que devemos fazer o cast
		// manualmente toda vez que vamos usar.
		Double coisaA = (Double) caixaA.abrir();
		System.out.println(coisaA);
		
		
		//  da pra usar porem é cansativo e pode gerar problemas.
				
		
		
		//TODO: COM GENERICS
		//Com o generics implementado dessa forma n precisa fazer o cast
		// pois ja é especificado o Tipo que deseja trabalhar
		// no caso o Double.
		CaixaComGenerics<Double> caixaB = new CaixaComGenerics<>();
		caixaB.guardar(5.5);
		
		
		Double coisaB = caixaB.abrir();
		System.out.println(coisaB);
		
		
		
		
		//TODO: Caixa Com Heranca
		CaixaGenericaComHeranca caixaC = new CaixaGenericaComHeranca();
		
		// A caixa com herança pode ser manipulavel podendo restringir
		// alguns tipos.
		caixaC.guardar(123);
		
		Integer coisaC = caixaC.abrir();
		System.out.println(coisaC);
		
	}

}
