package stm.stjava.service;

import java.sql.SQLException;

import stm.stjava.dao.ClientDAO;
import stm.stjava.exception.ErrDeValException;

public class ClientService{

	/**
	 * Insère un nouveau client en BD.
	 * @param prenom
	 * @param nom
	 * @throws SQLException
	 */
	public void ajouter(String prenom, String nom) throws SQLException {
		
		ClientDAO dao = new ClientDAO();
		
		dao.insert(prenom + " " + nom);
	}
}
