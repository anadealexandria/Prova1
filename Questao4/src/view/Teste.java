package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.Aluno;
import model.Professor;
import model.Turma;

public class Teste {
	public static void main(String[] args) {
		ArrayList<Aluno> alunos = new ArrayList<>();
		
		try(Scanner entrada = new Scanner(System.in)){
			for(int i = 0 ; i < 3 ; i++) {
			System.out.print("Qual o PRIMEIRO nome do aluno(a) " + i +" ? ");
			String nome = entrada.next().toLowerCase();
			
			System.out.print("Qual a matr�cula do aluno(a) " + i + " ? ");
			int matricula = entrada.nextInt();
			
			System.out.print("Qual o CRE do aluno(a) " + i + " ? ");
			float cre = entrada.nextFloat();
			
			System.out.print("Qual o curso do aluno(a) " + i + " ? (Digite APENAS o primeiro nome) ");
			String curso = entrada.next().toLowerCase();
			
			System.out.println();
			Aluno alunoi= new Aluno(nome, matricula, cre, curso);
			alunos.add(alunoi);
		}	
			
			
			System.out.println();
			System.out.print("Qual o PRIMEIRO nome do professor(a)? ");
			String nome = entrada.next().toLowerCase();
			
			System.out.print("Qual a matr�cula do professor? ");
			int matricula = entrada.nextInt();
			
			System.out.print("Qual a disciplina do professor? (APENAS o primeiro nome) ");
			String disciplina = entrada.next().toLowerCase();
			
			System.out.print("Qual a coordena��o do professor? (Digite as siglas) ");			
			String coordenacao = entrada.next().toLowerCase();
			
			Professor prof = new Professor(nome, matricula, disciplina, coordenacao);
						
			System.out.println();
			
			Turma turma1 = new Turma(alunos.get(0), alunos.get(1), alunos.get(2), prof);
			 System.out.println();
			 
			/*Coloquei o n�mero da matr�cula pelo fato da possibilidade de se ter nomes iguais*/
			System.out.print("Para verificar se o aluno(a) est� na turma, digite a matr�cula dele(a): ");
			int matriculaAluno = entrada.nextInt();
			
			
			if(turma1.verificarAluno(matriculaAluno) == true) {
				System.out.println("O aluno est� presente na turma!");
				
			}else {
				System.out.println("O aluno n�o est� presente na turma!");
			}
			System.out.println();
			
			System.out.print("O maior CRE da turma �: " + turma1.maiorCRE());
			System.out.println();
			System.out.println("A turma � composta pelos seguintes alunos: ");
			turma1.imprimeAlunosMatriculados();
		}
	}
}