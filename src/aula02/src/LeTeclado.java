import java.util.Scanner;

public class LeTeclado {
	Scanner teclado = new Scanner(System.in);
	
	
	private void executa() {
		System.out.println("Digit qualquer coisa: ");
		String linha = teclado.nextLine();
		System.out.println(linha);
		
		System.out.println("Digite um número: ");
		float valor = teclado.nextFloat() * 2;
		System.out.println(valor);
		
		teclado.close();
	}
	
	
	
	
	public static void main(String[] args) {
		new LeTeclado().executa();
		
		
	}


}
