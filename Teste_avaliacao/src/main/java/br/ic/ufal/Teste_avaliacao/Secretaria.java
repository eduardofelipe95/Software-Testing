package br.ic.ufal.Teste_avaliacao;

import java.util.ArrayList;

public class Secretaria {

	ArrayList<Curso> cursos;
	boolean grad;

	public boolean isGrad() {
		return grad;
	}

	public void setGrad(boolean grad) {
		this.grad = grad;
	}

	public ArrayList<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(ArrayList<Curso> cursos) {
		this.cursos = cursos;
	}

	public boolean matricular(Disciplina disciplina, Aluno aluno) {
		for (int i = 0; i < cursos.size(); i++) {
			if (aluno.getCurso() == cursos.get(i)) {
				for (int a = 0; a < cursos.get(i).getDisciplinas().size(); a++) {
					if (disciplina == cursos.get(i).getDisciplinas().get(a)
							&& cursos.get(i).getDisciplinas().get(a).verificarPreReq(aluno)) {
						aluno.adicionarDisciplina(disciplina);
						return true;
					}
				}
			}
		}
		return false;
	}

}
