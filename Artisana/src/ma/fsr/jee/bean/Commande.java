package ma.fsr.jee.bean;


public class Commande {

	private String date_Commande;
	private int id_Client;
	private int id_Commande;
	private int id_Ligne_Commande;


	public Commande(){

	}


	public Commande(String date_Commande, int id_Client, int id_Commande,
			int id_Ligne_Commande) {
		super();
		this.date_Commande = date_Commande;
		this.id_Client = id_Client;
		this.id_Commande = id_Commande;
		this.id_Ligne_Commande = id_Ligne_Commande;
	}


	public String getDate_Commande() {
		return date_Commande;
	}


	public void setDate_Commande(String date_Commande) {
		this.date_Commande = date_Commande;
	}


	public int getId_Client() {
		return id_Client;
	}


	public void setId_Client(int id_Client) {
		this.id_Client = id_Client;
	}


	public int getId_Commande() {
		return id_Commande;
	}


	public void setId_Commande(int id_Commande) {
		this.id_Commande = id_Commande;
	}


	public int getId_Ligne_Commande() {
		return id_Ligne_Commande;
	}


	public void setId_Ligne_Commande(int id_Ligne_Commande) {
		this.id_Ligne_Commande = id_Ligne_Commande;
	}


	@Override
	public String toString() {
		return "Commande [date_Commande=" + date_Commande + ", id_Client="
				+ id_Client + ", id_Commande=" + id_Commande
				+ ", id_Ligne_Commande=" + id_Ligne_Commande + "]";
	}



}