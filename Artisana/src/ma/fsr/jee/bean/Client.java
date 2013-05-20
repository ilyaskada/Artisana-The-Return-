package ma.fsr.jee.bean;

import java.sql.Timestamp;

public class Client {

	
	private int id_Client_bean;
	private String login_Client_bean;	
	private String pass_Client_bean;
	private Timestamp date_inscription_bean;
	private String Nom_bean;

	public Client(){

	}

	public Client( int id_Client, String login_Client,
			String pass_Client, int id_Commande,Timestamp date_Timestamp,String Nom_String) {
		super();
	
		this.id_Client_bean = id_Client;
		this.login_Client_bean = login_Client;
		this.pass_Client_bean = pass_Client;
		this.date_inscription_bean=date_Timestamp;
		this.Nom_bean=Nom_bean;
	}

	
	public int getId_Client() {
		return id_Client_bean;
	}

	public void setId_Client(int id_Client) {
		this.id_Client_bean = id_Client;
	}

	public String getLogin_Client() {
		return login_Client_bean;
	}

	public void setLogin_Client(String login_Client) {
		this.login_Client_bean = login_Client;
	}

	public String getPass_Client() {
		return pass_Client_bean;
	}

	public void setPass_Client(String pass_Client) {
		this.pass_Client_bean = pass_Client;
	}

	
	public Timestamp getDate_inscription() {
		return date_inscription_bean;
	}

	public void setDate_inscription(Timestamp date_inscription) {
		this.date_inscription_bean = date_inscription;
	}

	public String getNom_bean() {
		return Nom_bean;
	}

	public void setNom_bean(String nom_bean) {
		Nom_bean = nom_bean;
	}

	@Override
	public String toString() {
		return "Client [id_Client_bean=" + id_Client_bean
				+ ", login_Client_bean=" + login_Client_bean
				+ ", pass_Client_bean=" + pass_Client_bean
				+ ", date_inscription_bean=" + date_inscription_bean
				+ ", Nom_bean=" + Nom_bean + "]";
	}
	

	

}