package geek;
import java.util.Scanner;

// for
public class _for {
	public static void main(String[] args) {
		int idade;
		String nome;
		
		// Para receber dados do usu�rio via teclado
		Scanner teclado = new Scanner(System.in);
		
		// vari�vel de controle; condi��o de parada; forma de incremento
		// i++ -> i = i + 1
		for (int i = 0; i < 5; i++) {
			System.out.println("Informe seu nome: ");
			nome = teclado.nextLine();
			
			System.out.println("Informa sua idade: ");
			// Idade = teclado.nexInt(); // Bug
			idade = Integer.parseInt(teclado.nextLine());
			
			if (idade > 0) {
				System.out.println(nome + " tem " + idade + " anos");
			}
		}
		teclado.close();
	}
}
