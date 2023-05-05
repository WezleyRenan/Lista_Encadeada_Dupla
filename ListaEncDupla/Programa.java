package ListaEncDupla;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		ListaDupla lista = new ListaDupla();
		Scanner input = new Scanner(System.in);
		int numero;
		String nome;

		lista.AdicionarInicio(23);
		lista.AdicionarInicio(18);
		lista.AdicionarInicio(40);
		// System.out.println(lista.getTamanho());
		System.out.println("escolha uma das seguintes opçoes:");
		System.out.println(
				" 1 = visualizar a lista\n 2 = remover da lista\n 3 = adicionar no inicio\n 4 = adicionar na posicao\n 5 = adicionar no final\n 0 = finalizar");

		try {
			int opcao = input.nextInt();
			while (opcao != 0) {
				switch (opcao) {
				case 1:
					// int tamanho = (int) (lista.getTamanho());
					// lista.ordenar(lista.getPrimeiro(), tamanho, 0);
					lista.Mostrar();
					System.out.println(" ");
					lista.MostrarInverso(lista.getTamanho());
					break;
				case 2:
					System.out.println("digite qual de elemento deseja remover");
					numero = input.nextInt();
					lista.remover(numero);
					;
					break;
				case 3:
					System.out.println("informe a idade");
					numero = input.nextInt();
					// System.out.println("informe o nome");
					// nome = input.next();
					lista.AdicionarInicio(numero);
					break;
				case 4:
					System.out.println("informe a idade");
					numero = input.nextInt();
					System.out.println("informe a posicao");
					int posicao = input.nextInt();
					lista.AdicionarPosicao(numero, posicao);
					break;
				case 5:
					System.out.println("informe a idade");
					numero = input.nextInt();
					lista.AdicionarFim(numero);
					break;
				}
				System.out.println(" ");
				System.out.println(
						" 1 = visualizar a lista\n 2 = remover da lista\n 3 = adicionar no inicio\n 4 = adicionar na posicao\n 5 = adicionar no final\n 0 = finalizar");
				opcao = input.nextInt();
			}
		} catch (Exception erro) {
			System.out.println(erro.getMessage());

		}

		// System.out.println("tamanho " + lista.getTamanho());
		// System.out.println("primeiro elemento " + lista.getPrimeiro().getValor());
		// System.out.println("ultimo " + lista.getUltimo().getValor());

	}

}
