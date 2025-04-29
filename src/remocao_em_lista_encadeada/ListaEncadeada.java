package remocao_em_lista_encadeada;
import java.util.Scanner;

public class ListaEncadeada {
    class No {
        int dado;
        No proximo;

        No(int dado) {
            this.dado = dado;
            this.proximo = null;
        }
    }

    No inicio = null; // Referência para o primeiro nó da lista encadeada

    // Método que verifica se a lista está vazia
    public boolean vazia() {
        return inicio == null;
    }

    // Método para inserir um elemento na lista
    public void insere(int dado) {
        No novoNo = new No(dado);
        if (this.vazia()) {
            inicio = novoNo;
        } else {
            No atual = inicio;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novoNo;
        }
    }

    // Método que imprime a lista
    public void imprime() {
    	if (this.vazia()) {
    		System.out.println("Lista vazia!");
    	} else {
        No atual = inicio;
        System.out.print("\nLista: ");
        while (atual != null) {
            System.out.print(atual.dado + " ");
            atual = atual.proximo;
        }
        System.out.println();
    	}
    }

    // Método que remove número da lista
    public void remove(int numero) {
        if (!this.vazia()) {
            if (inicio.dado == numero) {
                inicio = inicio.proximo;
                return;
            }

            No atual = inicio;
            while (atual.proximo != null) {
                if (atual.proximo.dado == numero) {
                    atual.proximo = atual.proximo.proximo;
                    return;
                }
                atual = atual.proximo;
            }

        } else {
            System.out.println("Lista vazia!");
        }
    }

//Método main para testar o programa
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Boas-vindas!");

        boolean continuaPrograma = true;
        ListaEncadeada lista = new ListaEncadeada();
        lista.insere(20);
        lista.insere(21);
        lista.insere(35);

        while (continuaPrograma) {
            if (!lista.vazia()) lista.imprime();
            else System.out.println("A lista está vazia.");

            System.out.println("\nEscolha sua opção: ");
            System.out.println("[ 1 ] Remover um número");
            System.out.println("[ 2 ] Adicionar um número");
            System.out.println("[ 3 ] Sair");
            System.out.print("Sua opção: ");

            int opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    System.out.print("Digite o número a ser removido: ");
                    int numeroParaRemover = Integer.parseInt(scanner.nextLine());
                    lista.remove(numeroParaRemover); //
                    System.out.println("Número " + numeroParaRemover + " removido (se presente).");
                    break;

                case 2:
                    System.out.print("Digite o número a ser adicionado: ");
                    int numeroParaAdicionar = Integer.parseInt(scanner.nextLine());
                    lista.insere(numeroParaAdicionar);
                    System.out.println("Número " + numeroParaAdicionar + " adicionado com sucesso.");
                    break;

                default:
                    System.out.println("Obrigada por usar o programa!");
                    continuaPrograma = false;
                    break;
            	}
        	}

        scanner.close();
    }
}