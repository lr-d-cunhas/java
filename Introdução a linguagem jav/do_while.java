package geek;
import java.util.Scanner;

public class do_while {
	public static void main(String[] args) {
		int idade = 1;
		String nome;
		
		// Para receber dados do usuário via teclado
		Scanner teclado = new Scanner(System.in);
		
		// Primeiro executa o bloco, depois faz a checagem
		do {
			System.out.println("Informe seu nome: ");
			nome = teclado.nextLine();
			
			System.out.println("Informe sua idade: ");
			// idade = teclado.nextInt(); // bug
			idade = Integer.parseInt(teclado.nextLine());
			
			System.out.println(nome + " tem " + idade + " anos ");
		} while (idade > 0);
		teclado.close();
	}

}
