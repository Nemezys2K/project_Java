	
public class ExemploNumerico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Byte | Tamanho 1 byte
		byte num1 = 127;
		
		//Short | Tamanho 2 bytes
		short num2 = 32767;
		
		//Int | Tamanho 4 bytes
		int num3 = 2147483647;
		
		//Long | Tamanho 8 bytes
		long num4 = 9223372036854775807L;
		
		//Números de ponto flutuante ou decimais
		//Float | Tamanho 4 bytes
		//6 a 7 digitos decimais
		float num5 = 25.5f;
		
		//Double | 8 bytes
		//15 Digitos decimais
		double num6 = 90.9d;
		
		//Booleano | 1 bit
		boolean verdadeiro = true;
		boolean falso = false;
		
		//Char | 2 bytes
		//caracteres / letras / valores da tabela ASCII
		char letra = 'A';
		
		System.out.println("byte: " + num1);
		System.out.println("short: " + num2);
		System.out.println("Int(inteiro): " + num3);
		System.out.println("Long: " + num4);
		System.out.println("Float(Demacimais): " + num5);
		System.out.println("Double(Demcimais): " + num6);
		System.out.println("Boolean - True(verdadeiro): " + verdadeiro);
		System.out.println("Boolean - False(falso): " + falso);
		System.out.println("Char: " + letra);
		
	}

}
