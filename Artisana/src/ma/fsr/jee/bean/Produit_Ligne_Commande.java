package ma.fsr.jee.bean;



public class Produit_Ligne_Commande {

	private int id_ligne_commande;
	private int id_produit;

	public Produit_Ligne_Commande(){

	}

	public Produit_Ligne_Commande(int id_ligne_commande, int id_produit) {
		super();
		this.id_ligne_commande = id_ligne_commande;
		this.id_produit = id_produit;
	}

	public int getId_ligne_commande() {
		return id_ligne_commande;
	}

	public void setId_ligne_commande(int id_ligne_commande) {
		this.id_ligne_commande = id_ligne_commande;
	}

	public int getId_produit() {
		return id_produit;
	}

	public void setId_produit(int id_produit) {
		this.id_produit = id_produit;
	}

	@Override
	public String toString() {
		return "Produit_Ligne_Commande [id_ligne_commande=" + id_ligne_commande
				+ ", id_produit=" + id_produit + "]";
	}

}