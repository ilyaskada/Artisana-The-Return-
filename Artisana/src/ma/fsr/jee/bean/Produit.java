package ma.fsr.jee.bean;


public class Produit {

	private String date_ajout_Produit;
	private Admin id_Adim;
	private int id_categorie;
	private int id_Produit;
	private String imge_Produit;
	private String intitule_Produit;
	private String prix_Produit;
	private String quantite_Produit;
	
	public int id_Ligne_Commande;

	public Produit(){

	}

	public Produit(String date_ajout_Produit, Admin id_Adim, int id_categorie,
			int id_Produit, String imge_Produit, String intitule_Produit,
			String prix_Produit, String quantite_Produit, int id_Ligne_Commande) {
		super();
		this.date_ajout_Produit = date_ajout_Produit;
		this.id_Adim = id_Adim;
		this.id_categorie = id_categorie;
		this.id_Produit = id_Produit;
		this.imge_Produit = imge_Produit;
		this.intitule_Produit = intitule_Produit;
		this.prix_Produit = prix_Produit;
		this.quantite_Produit = quantite_Produit;
		this.id_Ligne_Commande = id_Ligne_Commande;
	}

	public String getDate_ajout_Produit() {
		return date_ajout_Produit;
	}

	public void setDate_ajout_Produit(String date_ajout_Produit) {
		this.date_ajout_Produit = date_ajout_Produit;
	}

	public Admin getId_Adim() {
		return id_Adim;
	}

	public void setId_Adim(Admin id_Adim) {
		this.id_Adim = id_Adim;
	}

	public int getId_categorie() {
		return id_categorie;
	}

	public void setId_categorie(int id_categorie) {
		this.id_categorie = id_categorie;
	}

	public int getId_Produit() {
		return id_Produit;
	}

	public void setId_Produit(int id_Produit) {
		this.id_Produit = id_Produit;
	}

	public String getImge_Produit() {
		return imge_Produit;
	}

	public void setImge_Produit(String imge_Produit) {
		this.imge_Produit = imge_Produit;
	}

	public String getIntitule_Produit() {
		return intitule_Produit;
	}

	public void setIntitule_Produit(String intitule_Produit) {
		this.intitule_Produit = intitule_Produit;
	}

	public String getPrix_Produit() {
		return prix_Produit;
	}

	public void setPrix_Produit(String prix_Produit) {
		this.prix_Produit = prix_Produit;
	}

	public String getQuantite_Produit() {
		return quantite_Produit;
	}

	public void setQuantite_Produit(String quantite_Produit) {
		this.quantite_Produit = quantite_Produit;
	}

	public int getId_Ligne_Commande() {
		return id_Ligne_Commande;
	}

	public void setId_Ligne_Commande(int id_Ligne_Commande) {
		this.id_Ligne_Commande = id_Ligne_Commande;
	}

	@Override
	public String toString() {
		return "Produit [date_ajout_Produit=" + date_ajout_Produit
				+ ", id_Adim=" + id_Adim + ", id_categorie=" + id_categorie
				+ ", id_Produit=" + id_Produit + ", imge_Produit="
				+ imge_Produit + ", intitule_Produit=" + intitule_Produit
				+ ", prix_Produit=" + prix_Produit + ", quantite_Produit="
				+ quantite_Produit + ", id_Ligne_Commande=" + id_Ligne_Commande
				+ "]";
	}

}