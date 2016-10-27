package br.ic.ufal.Teste_avaliacao;

import java.util.ArrayList;

public class Disciplina {
	  
	 protected String nome;
	 protected String cod;
	 protected int numCred;
	 protected boolean obrig; // obrigatória(true) ou eletiva(false)
	 protected boolean ofer; // oferecida(true) não oferecida(false)
	 protected int preNumCred;
	 protected ArrayList<String> preDisc;
	 protected String professor;
	  
	 public String getNome() {
	 	return nome;
	 }

	 public void setNome(String nome) {
	 	this.nome = nome;
	 }

	 public String getCod() {
	 	return cod;
	 }

	 public boolean verificarPreReq(Aluno aluno){
	 	if(this.obrig){
	 	if(aluno.credOb >= this.preNumCred)
	 	return true;
	 	}else{
	 	if(aluno.credEle >= this.preNumCred)
	 	return true;
	 	}
	 	return false;
	 }
	  
	 public boolean mostrarDisciplina(){
	 	System.out.println("Nome: " + this.nome);
	 	System.out.println("Código: " + this.cod);
	 	System.out.println("Número de Créditos: " + this.numCred);
	 	System.out.println("Códigos pré-requisitos: ");
	 	for(int i=0; i<this.preDisc.size(); i++)
	 	System.out.print(this.preDisc.get(i) + " " );
	 	System.out.println("Número de créditos mínimos: " + this.preNumCred);
	 	return true;
	 }

	public int getNumCred() {
		return numCred;
	}

	public void setNumCred(int numCred) {
		this.numCred = numCred;
	}

	public boolean isObrig() {
		return obrig;
	}

	public void setObrig(boolean obrig) {
		this.obrig = obrig;
	}

	public boolean isOfer() {
		return ofer;
	}

	public void setOfer(boolean ofer) {
		this.ofer = ofer;
	}

	public int getPreNumCred() {
		return preNumCred;
	}

	public void setPreNumCred(int preNumCred) {
		this.preNumCred = preNumCred;
	}

	public ArrayList<String> getPreDisc() {
		return preDisc;
	}

	public void setPreDisc(ArrayList<String> preDisc) {
		this.preDisc = preDisc;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}
}