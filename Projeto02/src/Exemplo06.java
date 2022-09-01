
public class Exemplo06 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numInteiro = 10;
		float numFrac = 50.8f;
		double numFrac2 = 20.0d;
		
		//Soma
		System.out.println(numInteiro + numInteiro);
		//Subtração
		System.out.println(numInteiro - numInteiro);
		//Multiplicação
		System.out.println(numInteiro * numInteiro);
		//Divisão
		System.out.println(numInteiro / numInteiro);
		
		//Int + Double
		System.out.println(numInteiro + numFrac2);
		
		//Soma de char
		//Resultado da soma tabela ASCII
		char letra1 = 'D';
		char letra2 = 'I';
		System.out.println(letra1 + letra2);
		
		//String | Não é tipo de dado primitivo
		String letraA = "A";
		String letraB = "B";
		System.out.println(letraA + letraB);
	}
}
