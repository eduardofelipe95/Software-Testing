package br.ic.ufal.Teste_avaliacao;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Drca {

	protected ArrayList<Departamento> departamentos;
	protected ArrayList<Aluno> alunos;

	public boolean iniciar() {
		//
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setNome("Laboratório de Programação I");
		disciplina1.setCod("INF1622");
		disciplina1.setNumCred(70);
		disciplina1.setObrig(true);
		disciplina1.setOfer(true);
		disciplina1.setPreNumCred(0);
		ArrayList<String> listaDisciplinas = new ArrayList<String>();
		listaDisciplinas.add("INF1620");
		disciplina1.setPreDisc(listaDisciplinas);
		disciplina1.setProfessor("Arndt Von Staa");
		//
		
		//Departamento de Informática
		//Secretaria de Graduação
		//Curso: Engenharia da Computação

		Disciplina disciplina2 = new Disciplina();
		disciplina2.setNome("Estrutura de Dados");
		disciplina2.setCod("INF1620");
		disciplina2.setNumCred(60);
		disciplina2.setObrig(true);
		disciplina2.setOfer(false);
		disciplina2.setPreNumCred(0);
		disciplina2.setProfessor("Marcus Poggi");
		//
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setNome("Projeto de Sistema de Software I");
		disciplina3.setCod("INF1624");
		disciplina3.setNumCred(40);
		disciplina3.setObrig(false);
		disciplina3.setOfer(true);
		disciplina3.setPreNumCred(0);
		ArrayList<String> listaDisciplinas3 = new ArrayList<String>();
		listaDisciplinas3.add("INF1620");
		listaDisciplinas3.add("INF1624");
		disciplina3.setPreDisc(listaDisciplinas3);
		disciplina3.setProfessor("Carlos Lucena");
		//
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setNome("Programação em ponto grande");
		disciplina4.setCod("INF1628");
		disciplina4.setNumCred(50);
		disciplina4.setObrig(false);
		disciplina4.setOfer(true);
		disciplina4.setPreNumCred(0);
		ArrayList<String> listaDisciplinas4 = new ArrayList<String>();
		listaDisciplinas4.add("INF1620");
		disciplina4.setPreDisc(listaDisciplinas4);
		disciplina4.setProfessor("Arndt von Staa");
		//Curso: Bacharelado

		Disciplina disciplina5 = new Disciplina();
		disciplina5.setNome("Introdução a Ciência da Computação");
		disciplina5.setCod("INF1001");
		disciplina5.setNumCred(40);
		disciplina5.setObrig(true);
		disciplina5.setOfer(true);
		disciplina5.setPreNumCred(0);
		disciplina5.setProfessor("Bruno Feijó");
		//
		Disciplina disciplina6 = new Disciplina();
		disciplina6.setNome("Cálculo Numérico");
		disciplina6.setCod("INF1002");
		disciplina6.setNumCred(40);
		disciplina6.setObrig(true);
		disciplina6.setOfer(true);
		disciplina6.setPreNumCred(100);
		disciplina6.setProfessor("Marcus Poggi");
		//
		Disciplina disciplina7 = new Disciplina();
		disciplina7.setNome("Software Básico");
		disciplina7.setCod("INF1600");
		disciplina7.setNumCred(50);
		disciplina7.setObrig(false);
		disciplina7.setOfer(true);
		disciplina7.setPreNumCred(40);
		disciplina7.setProfessor("Arndt von Staa");
		//Secretaria de Pós-graduação
		//Curso: Doutorado - Informática

		Disciplina disciplina8 = new Disciplina();
		disciplina8.setNome("Hipermídia Adaptativa");
		disciplina8.setCod("INF1303");
		disciplina8.setNumCred(30);
		disciplina8.setObrig(false);
		disciplina8.setOfer(true);
		disciplina8.setPreNumCred(0);
		disciplina8.setProfessor("Daniel Schawbe");

		//Departamento Letras
		//Secretaria de Graduação
		//Curso: Português-Inglês

		Disciplina disciplina9 = new Disciplina();
		disciplina9.setNome("Inglês I");
		disciplina9.setCod("LET1501");
		disciplina9.setNumCred(30);
		disciplina9.setObrig(true);
		disciplina9.setOfer(true);
		disciplina9.setPreNumCred(0);
		disciplina9.setProfessor("Ângela Souza");

		//Cursos

		//Dep de Info

		//Sec de grad
		Curso curso1 = new Curso();
		curso1.setNome("Engenharia de Computação");
		ArrayList<Disciplina> dcur1 = new ArrayList<Disciplina>(); //disciplinas pertencentes ao curso
		dcur1.add(disciplina1);
		dcur1.add(disciplina2);
		dcur1.add(disciplina3);
		dcur1.add(disciplina4);
		curso1.setDisciplinas(dcur1);

		Curso curso2 = new Curso();
		curso2.setNome("Bacharelado");
		ArrayList<Disciplina> dcur2 = new ArrayList<Disciplina>(); //disciplinas pertencentes ao curso
		dcur2.add(disciplina5);
		dcur2.add(disciplina6);
		dcur2.add(disciplina7);
		curso2.setDisciplinas(dcur2);

		//Sec de pos-grad
		Curso curso3 = new Curso();
		curso3.setNome("Doutorado - Informática");
		ArrayList<Disciplina> dcur3 = new ArrayList<Disciplina>(); //disciplinas pertencentes ao curso
		dcur3.add(disciplina8);
		curso3.setDisciplinas(dcur3);

		//Dep de Let

		//Sec de grad
		Curso curso4 = new Curso();
		curso4.setNome("Português - Inglês");
		ArrayList<Disciplina> dcur4 = new ArrayList<Disciplina>(); //disciplinas pertencentes ao curso
		dcur4.add(disciplina9);
		curso4.setDisciplinas(dcur4);
		//Secretarias

		Secretaria secretaria1 = new Secretaria();
		secretaria1.setGrad(true);
		ArrayList<Curso> listaCursos1 = new ArrayList<Curso>();
		listaCursos1.add(curso1);
		listaCursos1.add(curso2);
		secretaria1.setCursos(listaCursos1);

		Secretaria secretaria2 = new Secretaria();
		secretaria2.setGrad(false);
		ArrayList<Curso> listaCursos2 = new ArrayList<Curso>();
		listaCursos2.add(curso3);
		secretaria2.setCursos(listaCursos2);

		Secretaria secretaria3 = new Secretaria();
		secretaria3.setGrad(true);
		ArrayList<Curso> listaCursos3 = new ArrayList<Curso>();
		listaCursos3.add(curso4);
		secretaria3.setCursos(listaCursos3);
		
		
		//Alunos

		//Departamento de Informática

		Aluno aluno1 = new Aluno();
		aluno1.setNome("Alex Carvalho");
		aluno1.setMatricula(98124812);
		aluno1.setCredOb(130);
		aluno1.setCredEle(50);
		aluno1.setCurso(curso1);
		ArrayList<Disciplina> discCurs1 = new ArrayList<Disciplina>();
		discCurs1.add(disciplina2);
		discCurs1.add(disciplina4);
		discCurs1.add(disciplina1);
		aluno1.setDiscCurs(discCurs1);
		//
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Jurema Torres");
		aluno2.setMatricula(9924812);
		aluno2.setCredOb(100);
		aluno2.setCredEle(0);
		aluno2.setCurso(curso1);
		ArrayList<Disciplina> discCurs2 = new ArrayList<Disciplina>();
		discCurs2.add(disciplina2);
		discCurs2.add(disciplina5);
		aluno2.setDiscCurs(discCurs2);
		//
		Aluno aluno3 = new Aluno();
		aluno3.setNome("José Vasconcelos");
		aluno3.setMatricula(9915918);
		aluno3.setCredOb(0);
		aluno3.setCredEle(0);
		aluno3.setCurso(curso2);
		//
		Aluno aluno4 = new Aluno();
		aluno4.setNome("João da Silva");
		aluno4.setMatricula(9914918);
		aluno4.setCredOb(0);
		aluno4.setCredEle(0);
		aluno4.setCurso(curso3);

		//Departamento de Letras

		Aluno aluno5 = new Aluno();
		aluno5.setNome("Maria Antônia");
		aluno5.setMatricula(12398);
		aluno5.setCredOb(0);
		aluno5.setCredEle(0);
		aluno5.setCurso(curso4);

		
		

		return true;
	}

	public boolean mostrarSecretaria() {
		for (int i = 0; i < departamentos.size(); i++) {
			Secretaria secG = departamentos.get(i).getSecGrad();
			for (int a = 0; a < secG.getCursos().size(); a++) {
				for (int b = 0; b < secG.getCursos().get(a).getDisciplinas().size(); b++)
					secG.getCursos().get(b).getDisciplinas().get(b).mostrarDisciplina();
			}
		}
		return true;
	}

	public boolean mostrarAlunos() {
		for (int i = 0; i < alunos.size(); i++) {
			alunos.get(i).mostrarAluno();
		}
		return true;
	}

	public Aluno selecionarAluno() {
		Scanner scanner = new Scanner(System.in);
		int entrada;
		
		entrada = scanner.nextInt();

		for (int i = 0; i < alunos.size(); i++) {
			if (alunos.get(i).getMatricula() == entrada) {
				alunos.get(i).mostrarAluno();
				alunos.get(i).getCurso();
				
				return alunos.get(i);
			}

		}
		return null;
	}
	
	public Disciplina listarDisiplinas(Curso curso){
		Scanner scanner = new Scanner(System.in);
		String entrada;
		
		for(int i = 0 ; i < curso.getDisciplinas().size(); i++){
			curso.getDisciplinas().get(i).mostrarDisciplina();
		}
		System.out.println("Digite o código da disciplina");
		entrada = scanner.nextLine();
		
		for(int i = 0; i < curso.getDisciplinas().size(); i++){
			if(curso.getDisciplinas().get(i).equals(entrada)){
				return curso.getDisciplinas().get(i);
			}
		}
		
		return null;
		
		
	}
	
	
}
