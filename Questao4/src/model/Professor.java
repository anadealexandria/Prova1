package model;

public class Professor {
	private String nome;
	private int matricula;
	private String disciplina;
	private String coordenacao;
	
	public Professor(String nome, int matricula, String disciplina, String coordenacao) {
		this.nome = nome;
		this.matricula = matricula;
		this.disciplina = disciplina;
		this.coordenacao = coordenacao;
	}
	
	public String toString() {
		return "\nNome do Professor: " + nome + "\nMatrícula: " 
	+ matricula + "\nDisciplina: " + disciplina + "\nCoordenação: " + coordenacao;
	}
	
}
