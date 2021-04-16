package model;

public class Turma {
	private Aluno aluno1;
	private Aluno aluno2;
	private Aluno aluno3;
	private Professor professor1;
	
	public Turma(Aluno aluno1, Aluno aluno2, Aluno aluno3, Professor professor1) {
		this.aluno1 = aluno1;
		this.aluno2 = aluno2;
		this.aluno3 = aluno3;
		this.professor1 = professor1;
	}
	
	public boolean verificarAluno(int matricula) {
		boolean verificacao;
		
		if (matricula == aluno1.getMatricula() || matricula == aluno2.getMatricula() ||
				matricula == aluno3.getMatricula()) {
			verificacao = true;
		}else {
			verificacao = false;
		}
		return verificacao;
	}
	
	public float maiorCRE() {
		float maior = 0.0f;
		if (aluno1.getCre() > maior) {
			maior = aluno1.getCre();
		}
		if (aluno2.getCre() > maior) {
			maior = aluno2.getCre();
		}
		if (aluno3.getCre() > maior) {
			maior = aluno3.getCre();
		}
		return maior;
	}
	
	public void imprimeAlunosMatriculados() {
		System.out.println(aluno1);
		System.out.println(aluno2);
		System.out.println(aluno3);
	}
	
}
