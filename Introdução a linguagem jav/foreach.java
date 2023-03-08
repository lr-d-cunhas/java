package geek;

// Foreach // Para cada
public class foreach {
	public static void main(String[] args) {
		String nome = "Geek University";
		
		// Para  cada um dos caracteres da string, imprima o caractere
		for (char letra : nome.toCharArray()) {
			// Imprime cada caractere um embaixo do outro
			System.out.println(letra);
			
			// Imprime cada caractere um na frete do outro
			System.out.print(letra);
		}
	}

}
