import java.util.ArrayList;

public class Department {
	Postgraduation postgraduation;
	Graduation graduation;
	ArrayList<Student> students;
	String name;
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	public Department() {
		
		this.postgraduation = null;
		this.graduation = null;
	}
	
	public Postgraduation getPostgraduation() {
		return postgraduation;
	}
	public void setPostgraduation(Postgraduation postgraduation) {
		this.postgraduation = postgraduation;
	}
	public Graduation getGraduation() {
		return graduation;
	}
	public void setGraduation(Graduation graduation) {
		this.graduation = graduation;
	}
	
}
