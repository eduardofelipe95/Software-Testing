import java.util.ArrayList;

public class Discipline {
	String name;
	String cod;
	int credits;
	boolean elective;
	boolean offered;
	int creditsMin;
	ArrayList<String> prerequisites;
	String teacher;
	
	public Discipline(String name, String cod, int credits, boolean elective, boolean offered,
			int creditsMin, String teacher) {
		
		this.name = name;
		this.cod = cod;
		this.credits = credits;
		this.elective = elective;
		this.offered = offered;
		this.creditsMin = creditsMin;
		this.prerequisites = new ArrayList<String>();
		this.teacher = teacher;
		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public boolean isElective() {
		return elective;
	}
	public void setElective(boolean elective) {
		this.elective = elective;
	}
	public boolean isOffered() {
		return offered;
	}
	public void setOffered(boolean offered) {
		this.offered = offered;
	}
	public int getCreditsMin() {
		return creditsMin;
	}
	public void setCreditsMin(int creditsMin) {
		this.creditsMin = creditsMin;
	}
	public ArrayList<String> getPrerequisites() {
		return prerequisites;
	}
	public void setPrerequisites(ArrayList<String> prerequisites) {
		this.prerequisites = prerequisites;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	
	
	
	
}
