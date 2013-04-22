package jee.modeles;


public class Ligne_Commande {

	private int id_Ligne_Commande;

	public Ligne_Commande(){

	}

	public Ligne_Commande(int id_Ligne_Commande) {
		super();
		this.id_Ligne_Commande = id_Ligne_Commande;
	}

	public int getId_Ligne_Commande() {
		return id_Ligne_Commande;
	}

	public void setId_Ligne_Commande(int id_Ligne_Commande) {
		this.id_Ligne_Commande = id_Ligne_Commande;
	}

	@Override
	public String toString() {
		return "Ligne_Commande [id_Ligne_Commande=" + id_Ligne_Commande + "]";
	}


}