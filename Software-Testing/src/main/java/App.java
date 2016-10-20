import java.util.ArrayList;
public class App {
	ArrayList<Department> departments = new ArrayList<Department>();
	ArrayList<Discipline> disciplines = new ArrayList<Discipline>();
	ArrayList<Student> students = new ArrayList<Student>();
	
	public void initDB(){
		//Disciplinas da p�s-gradua��o
		Discipline discipline = new Discipline("Hiperm�dia Adaptativa", "INF1303",
				30, true, true, 0 , "Daniel Schawbe");
		disciplines.add(discipline);
	
		//Disciplinas da p�s-gradua��o
		
		Course course = new Course();
		course.setName("Doutorado�Inform�tica");
		course.setDisciplines(disciplines);
		
		Postgraduation postgraduation = new Postgraduation();
		postgraduation.setCourse(course);
		
		disciplines = new ArrayList<Discipline>(disciplines);
		
		//Disciplinas de gradua��o
		discipline = new Discipline("Laborat�rio de Programa��o I", "INF1622",
				70, false, true, 0 , "Arndt Von Staa");
		disciplines.add(discipline);
		
		discipline = new Discipline("Estruturas de Dados", "INF1620", 60
				, false, false, 0, "Marcus Poggi");
		disciplines.add(discipline);
		
		discipline = new Discipline("Projeto de Sistema de Software I", "INF1624",40
				, true, true, 0, "Carlos Lucena");
		discipline.getPrerequisites().add("INF1620");
		discipline.getPrerequisites().add("INF1628");
		disciplines.add(discipline);
		
		discipline = new Discipline("Programa��o em ponto grande", "INF1628",50
				, true, true, 0, "Arndt von Staa");
		discipline.getPrerequisites().add("INF 1620");
		disciplines.add(discipline);
		
		discipline = new Discipline("Introdu��o a Ci�ncia da Computa��o", "INF1001",40
				, false, true, 0, "Bruno Feij�");
		disciplines.add(discipline);
		
		discipline = new Discipline("C�lculo Num�rico", "INF1002",40
				, false, true, 100, "Marcus Poggi");
		disciplines.add(discipline);
		
		discipline = new Discipline("Software B�sico", "INF1600",50
				, true, true, 40, "Arndt von Staa");
		disciplines.add(discipline);	
		//Disciplinas de gradua��o
		course = new Course();
		course.setName("Engenharia de Computa��o");
		course.setDisciplines(disciplines);
		
		/*
		course = new Course();
		course.setName("Bacharelado");
		course.setDisciplines(disciplines);
		*/
		
		Graduation graduation = new Graduation();
		graduation.setCourse(course);
		
		Department department = new Department();
		department.setName("Inform�tica");
		department.setGraduation(graduation);
		department.setPostgraduation(postgraduation);
		
		departments.add(department);
		
		/////////////////////////
		
		disciplines = new ArrayList<Discipline>();
		
		discipline = new Discipline("Ingl�s I", "LET1501", 30, false, true, 0, "�ngela Souza");
		disciplines.add(discipline);
		
		course = new Course();
		course.setName("Portugu�s�Ingl�s");
		course.setDisciplines(disciplines);
		
		graduation = new Graduation();
		graduation.setCourse(course);
		
		department = new Department();
		department.setName("Letras");
		department.setGraduation(graduation);
		
		departments.add(department);
		
		//Cadastro de alunos
		ArrayList<String> list = new ArrayList<String>();
		list.add("INF1620");
		list.add("INF1628");
		list.add("INF1622");
		
		Student student = new Student("Alex Carvalho", 98124812, 130, 50, "Engenharia de Computa��o", list);
		students.add(student);
		
		list = new ArrayList<String>();
		list.add("INF1620");
		list.add("INF101");
		student = new Student("Jurema Torres", 9924812, 100, 0, "Engenharia de Computa��o", list);
		students.add(student);
		
		list = new ArrayList<String>();
		student = new Student("Jos� Vasconcelos", 9915918, 0, 0, "Bacharelado", list);
		students.add(student);
		
		list = new ArrayList<String>();
		student = new Student("Jo�o da Silva", 9914918, 0, 0, "Doutorado�Inform�tica", list);
		students.add(student);
		
		for(int i = 0; i < departments.size(); i++){
			if(departments.get(i).getName().equals("Inform�tica")){
				departments.get(i).setStudents(students);
				students = new ArrayList<Student>();
			}
		}
		
		list = new ArrayList<String>();
		student = new Student("Maria Ant�nia",12398, 0, 0, "Portugu�s�Ingl�s", list);
		
		for(int i = 0; i < departments.size(); i++){
			if(departments.get(i).getName().equals("Portugu�s�Ingl�s")){
				departments.get(i).setStudents(students);
				students = new ArrayList<Student>();
			}
		}
		
		//Cadastro de alunos
		
		
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		new App().initDB();

	}

}
