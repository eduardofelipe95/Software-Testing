package ufal.ic.br.TrabalhoTesteBeta;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.PreparedStatement;

public class EstudanteDao {
	
	// a conexão com o banco de dados
	private Connection connection;

	public EstudanteDao() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public void adiciona(Estudante contato) {
		String sql = "insert into alutest " + "(nome,matricula,credcumpob,credcumpele,cursomat,disccurs)" + " values (?,?,?,?,?,?)";

		try {
			// prepared statement para inserção
			java.sql.PreparedStatement stmt = connection.prepareStatement(sql);

			// seta os valores
			stmt.setString(1, contato.getName());
			stmt.setInt(2, contato.getRegistration());
			stmt.setInt(3, contato.getRequiredCredits());
			stmt.setInt(4, contato.getElectiveCredits());
			stmt.setString(5, contato.getCourse());
			stmt.setString(6, contato.getCompletedDisciplines());

			// executa
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public List<Estudante> getLista() {
		try {
			List<Estudante> estudantes = new ArrayList<Estudante>();
			PreparedStatement stmt = (PreparedStatement) this.connection.prepareStatement("select * from alutest");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				
				// criando o objeto Estudante
				Estudante estudante = new Estudante();
				estudante.setName(rs.getString("nome"));
				estudante.setRegistration(rs.getInt("matricula"));
				estudante.setRequiredCredits(rs.getInt("credcumpob"));
				estudante.setElectiveCredits(rs.getInt("credcumpele"));
				estudante.setCourse(rs.getString("cursomat"));
				estudante.setCompletedDisciplines(rs.getString("disccurs"));
				
				// adicionando o objeto à lista
				estudantes.add(estudante);
			}
			rs.close();
			stmt.close();
			return estudantes;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void altera(Estudante estudante) {
		String sql = "update contatos set nome=?, credcumpob=?," + "credcumpele=?, cursomat=?, disccurs=? where matricula=?";

		try {
			PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);
			
			stmt.setString(1, estudante.getName());
			stmt.setInt(2, estudante.getRegistration());
			stmt.setInt(3, estudante.getRequiredCredits());
			stmt.setInt(4, estudante.getElectiveCredits());
			stmt.setString(5, estudante.getCourse());
			stmt.setString(6, estudante.getCompletedDisciplines());
			
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void remove(Estudante estudante) {
		try {
			PreparedStatement stmt = (PreparedStatement) connection.prepareStatement("delete from contatos where id=?");
			stmt.setLong(2, estudante.getRegistration());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
