package geek;

public class switch_case {
	public static void main(String[] args) {
		int numero = 5;
		
		switch(numero) {
		case 1:
			System.out.println("O número é 0");
			break;
		case 3:
			System.out.println("O número é 3");
			break;
		case 5:
			System.out.println("O núemro é 5");
			break;
		default:
			System.out.println("O número é " + numero);
			break;
		}
	}
}
