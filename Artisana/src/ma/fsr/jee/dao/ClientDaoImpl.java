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

	
	   /* Implémentation de la méthode trouver() définie dans l'interface ClientDao */
  
    public Client trouver( String login ) throws DAOException {
        Connection connexion = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Client client = null;
     
        try {
            /* Récupération d'une connexion depuis la Factory */
            connexion = daoFactory.getConnection();
            preparedStatement = DAOUtilitaire.initialisationRequetePreparee( connexion, SQL_SELECT_PAR_EMAIL, false, login );
            resultSet = preparedStatement.executeQuery();
            /* Parcours de la ligne de données de l'éventuel ResulSet retourné */
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
 
    /* Implémentation de la méthode creer() définie dans l'interface ClientDao */
  
//    public void creer( Client client ) throws IllegalArgumentException, DAOException {
//        Connection connexion = null;
//        PreparedStatement preparedStatement = null;
//        ResultSet valeursAutoGenerees = null;
//     
//        try {
//            /* Récupération d'une connexion depuis la Factory */
//            connexion = daoFactory.getConnection();
//            if(connexion == null){
//            	System.out.println("ddfed");
//            	
//            }
//            preparedStatement = initialisationRequetePreparee( connexion, SQL_INSERT, true, client.getEmail(),client.getNom(), client.getMotDePasse(), client.getPrenom(),client.getLogin() );
//            int statut = preparedStatement.executeUpdate();
//            /* Analyse du statut retourné par la requête d'insertion */
//            if ( statut == 0 ) {
//                throw new DAOException( "Échec de la création du client, aucune ligne ajoutée dans la table." );
//            }
//            /* Récupération de l'id auto-généré par la requête d'insertion */
//            valeursAutoGenerees = preparedStatement.getGeneratedKeys();
//            if ( valeursAutoGenerees.next() ) {
//                /* Puis initialisation de la propriété id du bean Utilisateur avec sa valeur */
//            	client.setId( valeursAutoGenerees.getInt( 1 ) );
//            } else {
//                throw new DAOException( "Échec de la création du client en base, aucun ID auto-généré retourné." );
//            }
//        } catch ( SQLException e ) {
//            throw new DAOException( e );
//        } finally {
//            fermeturesSilencieuses( valeursAutoGenerees, preparedStatement, connexion );
//        }
//    }
//    
    

}
