package br.ic.ufal.Teste_avaliacao;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
	  
	 ArrayList<Professor> professores;
	 Secretaria secGrad;
	 Secretaria secPosGrad;
	  
	 public ArrayList<Professor> getProfessores() {
	 	return professores;
	 }
	 public void setProfessores(ArrayList<Professor> professores) {
	 	this.professores = professores;
	 }
	 public Secretaria getSecGrad() {
	 	return secGrad;
	 }
	 public void setSecGrad(Secretaria secGrad) {
	 	this.secGrad = secGrad;
	 }
	 public Secretaria getSecPosGrad() {
	 	return secPosGrad;
	 }
	 public void setSecPosGrad(Secretaria secPosGrad) {
	 	this.secPosGrad = secPosGrad;
	 }

	}
