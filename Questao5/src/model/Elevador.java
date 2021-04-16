package model;

public class Elevador {
	private int andarAtual;
	private int totalAndares;
	private int capacidade;
	private int quantPessoas;
	
	public Elevador() {
		
	}
	
	public void inicializa(int capacidade, int totalAndares) {
		this.capacidade = capacidade;
		this.totalAndares = totalAndares;
		andarAtual = 0;
		quantPessoas = 0;
	}
	
	public void entra() {
		if (quantPessoas < capacidade) {
			quantPessoas += 1;
		}else {
			System.out.print("O elevador está cheio!");
		}
	}
	
	public void sai() {
		if (quantPessoas != 0) {
			quantPessoas -= 1;
		}else {
			System.out.print("O elevador está vazio!");
		}
	}
	
	public void sobe() {
		if (andarAtual != totalAndares) {
			andarAtual += 1;
		}else {
			System.out.print("O elevador está no último andar!");
		}
	}
	public void desce() {
		if (andarAtual != 0 ) {
			andarAtual -= 1;
		}else {
			System.out.print("O elevador está no térreo!");
		}
	}
	
	public void andar() {
		if(andarAtual > 0) {
		System.out.print("\nVocê está no andar: " + andarAtual + "º andar.");
		}else {
		System.out.println("\nVocê está no térreo.");
		}
	}
	
	public void quantPessoas() {
		System.out.print("\nA quantidade de pessoas no elevador é de " + quantPessoas + " pessoa(s).");
	}
}
	

