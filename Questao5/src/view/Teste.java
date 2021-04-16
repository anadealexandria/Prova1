package view;

import java.util.Scanner;

import model.Elevador;

public class Teste {

	public static void main(String[] args) {
		try(Scanner entrada = new Scanner(System.in)){
			/*O elevador sempre começa do térreo e vazio*/
			Elevador elevador1 = new Elevador();
			System.out.println();
			System.out.print("Qual a capacidade do seu elevador? ");
			int capacidade = entrada.nextInt();
			System.out.println();
			System.out.print("Qual a quantidade total de andares do seu prédio? ");
			int totalAndares = entrada.nextInt();
			elevador1.inicializa(capacidade, totalAndares);
			
			System.out.println();
			boolean flag = true;
			while (flag) {
				System.out.print("\nO que você deseja fazer?\n1-subir\n2-descer\n3-acrescentar pessoas"
						+ "\n4-retirar pessoas\n5-Encerrar o fluxo\n");
				int escolha = entrada.nextInt();
				if(escolha == 1) {
					elevador1.sobe();
				}else if(escolha == 2) {
					elevador1.desce();
				}else if(escolha == 3) {
					elevador1.entra();
				}else if(escolha == 4) {
					elevador1.sai();
				}else if(escolha == 5) {
					flag = false;
				}else {
					System.out.print("Opção inválida!");
				}
				elevador1.andar();
				elevador1.quantPessoas();
			}
		}
	}

}


