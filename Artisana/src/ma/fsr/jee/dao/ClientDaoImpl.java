package ma.fsr.jee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ma.fsr.jee.bean.Client;



import ma.fsr.jee.dao.DAOUtilitaire ;

public class ClientDaoImpl implements ClientDao{
	 private DAOFactory          daoFactory;
	 private static final String SQL_SELECT_PAR_EMAIL = "SELECT  Nom FROM Client WHERE login = ?";
	 private static final String SQL_INSERT = "INSERT INTO client (email,nom,motdepasse, prenom,login) VALUES (?,?,?,?,?)";
	 ClientDaoImpl( DAOFactory daoFactory ) {
	        this.daoFactory = daoFactory;
	    }
	 private static Client map( ResultSet resultSet ) throws SQLException {
		 Client client = new Client();
		// client.setId( resultSet.getInt( "id" ) );
		 client.setLogin_Client( resultSet.getString( "login" ) );
//		 client.setMotDePasse( resultSet.getString( "motdepasse" ) );
//		 client.setNom( resultSet.getString( "nom" ) );
//		 client.setPrenom( resultSet.getString( "prenom" ) );
//		 client.setLogin( resultSet.getString( "login" ) );
//		
	     return client;
	 }

	
	   /* Impl�mentation de la m�thode trouver() d�finie dans l'interface ClientDao */
  
    public Client trouver( String login ) throws DAOException {
        Connection connexion = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Client client = null;
     
        try {
            /* R�cup�ration d'une connexion depuis la Factory */
            connexion = daoFactory.getConnection();
            preparedStatement = DAOUtilitaire.initialisationRequetePreparee( connexion, SQL_SELECT_PAR_EMAIL, false, login );
            resultSet = preparedStatement.executeQuery();
            /* Parcours de la ligne de donn�es de l'�ventuel ResulSet retourn� */
            if ( resultSet.next() ) {
            	client = map( resultSet );
            }
        } catch ( SQLException e ) {
            throw new DAOException( e );
        } finally {
            DAOUtilitaire.fermeturesSilencieuses( resultSet, preparedStatement, connexion );
        }
     
        return client;
    }
 
    /* Impl�mentation de la m�thode creer() d�finie dans l'interface ClientDao */
  
//    public void creer( Client client ) throws IllegalArgumentException, DAOException {
//        Connection connexion = null;
//        PreparedStatement preparedStatement = null;
//        ResultSet valeursAutoGenerees = null;
//     
//        try {
//            /* R�cup�ration d'une connexion depuis la Factory */
//            connexion = daoFactory.getConnection();
//            if(connexion == null){
//            	System.out.println("ddfed");
//            	
//            }
//            preparedStatement = initialisationRequetePreparee( connexion, SQL_INSERT, true, client.getEmail(),client.getNom(), client.getMotDePasse(), client.getPrenom(),client.getLogin() );
//            int statut = preparedStatement.executeUpdate();
//            /* Analyse du statut retourn� par la requ�te d'insertion */
//            if ( statut == 0 ) {
//                throw new DAOException( "�chec de la cr�ation du client, aucune ligne ajout�e dans la table." );
//            }
//            /* R�cup�ration de l'id auto-g�n�r� par la requ�te d'insertion */
//            valeursAutoGenerees = preparedStatement.getGeneratedKeys();
//            if ( valeursAutoGenerees.next() ) {
//                /* Puis initialisation de la propri�t� id du bean Utilisateur avec sa valeur */
//            	client.setId( valeursAutoGenerees.getInt( 1 ) );
//            } else {
//                throw new DAOException( "�chec de la cr�ation du client en base, aucun ID auto-g�n�r� retourn�." );
//            }
//        } catch ( SQLException e ) {
//            throw new DAOException( e );
//        } finally {
//            fermeturesSilencieuses( valeursAutoGenerees, preparedStatement, connexion );
//        }
//    }
//    
    

}
