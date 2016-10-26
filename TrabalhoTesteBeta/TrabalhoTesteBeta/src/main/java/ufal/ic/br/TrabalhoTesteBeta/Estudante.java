package ufal.ic.br.TrabalhoTesteBeta;

import java.util.ArrayList;

public class Estudante {
	
	private String name;
	private int registration;
	private int requiredCredits;
	private int electiveCredits;
	private String course;
	private String completedDisciplines;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRegistration() {
		return registration;
	}
	public void setRegistration(int registration) {
		this.registration = registration;
	}
	public int getRequiredCredits() {
		return requiredCredits;
	}
	public void setRequiredCredits(int requiredCredits) {
		this.requiredCredits = requiredCredits;
	}
	public int getElectiveCredits() {
		return electiveCredits;
	}
	public void setElectiveCredits(int electiveCredits) {
		this.electiveCredits = electiveCredits;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getCompletedDisciplines() {
		return completedDisciplines;
	}
	public void setCompletedDisciplines(String completedDisciplines) {
		this.completedDisciplines = completedDisciplines;
	}

}
