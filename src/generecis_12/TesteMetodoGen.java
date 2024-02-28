package generecis_12;

import java.util.Arrays;
import java.util.List;

public class TesteMetodoGen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list1 = Arrays.asList("C++", "PHP", "Python", "Java","Haskell");
		List<Integer> list2 = Arrays.asList(1,2,3,4,7);
		
		// Quando utilizado dessa forma é esperado um object
		// logo temos o mesmo problema de Cast
		String ultimaLang = (String) MetodosGen.getUltimoNumero(list1);
		Integer ultimoNum = (Integer)MetodosGen.getUltimoNumero(list2);
		
		System.out.println(ultimaLang);
		System.out.println(ultimoNum);
		
		
		
		//TODO: Usando metodo com generic
		//desse modo  ja nao pe preciso se preocupar com CAST
		String ultimaLang2 = MetodosGen.getUltimo2(list1);
		Integer ultimoNum2 = MetodosGen.getUltimo2(list2);
		
		
		System.out.println(ultimaLang2);
		System.out.println(ultimoNum2);
		
	}

}
