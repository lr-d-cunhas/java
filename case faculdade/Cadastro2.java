import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Thread;

public class Cadastro2 {
    public static void main(String[] args) throws InterruptedException {
        // Armazena os nomes dos alunos, podem ser armazenados quantos nomes quiseres.
        // Quando terminar de preencher digite "fim", e o código imprimira os elementos da lista em forma de {chave: valor}  
        // 2/17/2023, Rian Lucas da Cunha Silva, curso: Sistema de Informações.
        System.out.println("\nDigite os nomes para o cadastro, quando finalizar digite [ fim ]\n");
        try (Scanner leitor = new Scanner(System.in)) {
            boolean contador = true;
            ArrayList<String> arrayDinamico = new ArrayList<String>();
            int cont = 0;
            while (contador){
                cont = cont + 1;
                System.out.println(cont + ". nome:");
                String nome = leitor.nextLine();
                Thread.sleep(1000);
                String fim = new String("fim");
                if (nome.equals(fim) == true){
                    Thread.sleep(1000);
                    System.out.println("\nCadastro completo!\n");
                    Thread.sleep(1000);
                    System.out.println("Nomes cadastrados: \n");
                    int count = arrayDinamico.size();
                    String dados;
                    for (int indice = 0; indice < count; indice++){
                        dados = arrayDinamico.get(indice);
                        Thread.sleep(1000);
                        System.out.format("%d. %s \n", (indice + 1), dados);
                    }
                    break;
                }
                arrayDinamico.add(nome);
            }
        }
    }
}
