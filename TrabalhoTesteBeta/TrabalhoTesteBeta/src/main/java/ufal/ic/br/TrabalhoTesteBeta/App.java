package ufal.ic.br.TrabalhoTesteBeta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException{
    	ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
    	
        Person person = (Person)context.getBean("person");
        person.speak();
        
        /*Connection con = new ConnectionFactory().getConnection();
        System.out.println("Conexão aberta!");
        con.close();
        System.out.println("Conexão fechada!");*/

		// pronto para gravar
		Estudante estudante = new Estudante();
		estudante.setName("Alessandra");
		estudante.setCompletedDisciplines("P1, P2, P3");
		estudante.setCourse("Ciencia da Comp");
		estudante.setElectiveCredits(20);
		estudante.setRegistration(556);
		estudante.setRequiredCredits(14);
		
		// grave nessa conexão!!!
		EstudanteDao dao = new EstudanteDao();

		// método elegante
		dao.adiciona(estudante);

		System.out.println("Gravado!");

    }
}
