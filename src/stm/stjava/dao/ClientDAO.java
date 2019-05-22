package stm.stjava.dao;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ClientDAO {

	public void insert(String prenom) throws SQLException{
		
		DriverManager.getConnection("coucou");
	}
}