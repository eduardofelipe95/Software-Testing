import java.awt.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

public class Course {
	String name;
	ArrayList<Discipline> disciplines;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Discipline> getDisciplines() {
		return disciplines;
	}
	public void setDisciplines(ArrayList<Discipline> disciplines) {
		this.disciplines = disciplines;
	}
	
	
}
