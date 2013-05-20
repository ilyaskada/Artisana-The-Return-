package ma.fsr.jee.dao;

import ma.fsr.jee.bean.Client;

public interface ClientDao {
	
	//void creer( Client utilisateur ) throws DAOException;
	 
    Client trouver( String email ) throws DAOException;

}
