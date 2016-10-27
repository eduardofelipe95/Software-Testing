package br.ic.ufal.Teste_avaliacao;

import java.util.ArrayList;

public class Aluno {
  
 protected String nome;
 protected int matricula;
 protected int credOb;
 protected int credEle;
 protected Curso curso;
 protected ArrayList<Disciplina> discCurs;
  
 public boolean mostrarAluno(){
 	System.out.println("Nome: " + this.nome);
 	System.out.println("Matrícula: " + this.matricula);
 	System.out.println("Número de Créditos Obrigatórios: " + this.credOb);
 	System.out.println("Número de Créditos Eletivas: " + this.credEle);
 	System.out.println("Nome do curso: " + this.curso.getNome());
 	System.out.println("Disciplinas cursadas/matriculadas: ");
 	for(int i=0; i<this.discCurs.size(); i++)
 	System.out.print(this.discCurs.get(i).getNome() + " " );
 	return true;
 }
  
 public boolean adicionarDisciplina(Disciplina disciplina){
 	discCurs.add(disciplina);
 	return true;
 }
  
 public String getNome() {
 	return nome;
 }
 public void setNome(String nome) {
 	this.nome = nome;
 }
 public int getMatricula() {
 	return matricula;
 }
 public void setMatricula(int matricula) {
 	this.matricula = matricula;
 }
 public int getCredOb() {
 	return credOb;
 }
 public void setCredOb(int credOb) {
 	this.credOb = credOb;
 }
 public int getCredEle() {
 	return credEle;
 }
 public void setCredEle(int credEle) {
 	this.credEle = credEle;
 }
 public Curso getCurso() {
 	return curso;
 }
 public void setCurso(Curso curso) {
 	this.curso = curso;
 }
 public ArrayList<Disciplina> getDiscCurs() {
 	return discCurs;
 }
 public void setDiscCurs(ArrayList<Disciplina> discCurs) {
 	this.discCurs = discCurs;
 }

}