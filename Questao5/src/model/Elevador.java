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
			System.out.print("O elevador est� cheio!");
		}
	}
	
	public void sai() {
		if (quantPessoas != 0) {
			quantPessoas -= 1;
		}else {
			System.out.print("O elevador est� vazio!");
		}
	}
	
	public void sobe() {
		if (andarAtual != totalAndares) {
			andarAtual += 1;
		}else {
			System.out.print("O elevador est� no �ltimo andar!");
		}
	}
	public void desce() {
		if (andarAtual != 0 ) {
			andarAtual -= 1;
		}else {
			System.out.print("O elevador est� no t�rreo!");
		}
	}
	
	public void andar() {
		if(andarAtual > 0) {
		System.out.print("\nVoc� est� no andar: " + andarAtual + "� andar.");
		}else {
		System.out.println("\nVoc� est� no t�rreo.");
		}
	}
	
	public void quantPessoas() {
		System.out.print("\nA quantidade de pessoas no elevador � de " + quantPessoas + " pessoa(s).");
	}
}
	

