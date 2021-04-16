package model;

public class Aluno {
	private String nome;
	private int matricula;
	private float cre;
	private String curso;
	
	public Aluno(String nome, int matricula, float cre, String curso) {
		this.nome = nome;
		this.matricula = matricula;
		this.cre = cre;
		this.curso = curso;
	}
	
	
	public int getMatricula() {
		return matricula;
	}


	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}


	public float getCre() {
		return cre;
	}


	public void setCre(float cre) {
		this.cre = cre;
	}


	public String toString() {
		return "\nNome do Aluno: " + nome + "\nMatrícula: " + matricula + "\nCRE: " + cre + "\nCurso: " + curso; 
	}
	
	
}
