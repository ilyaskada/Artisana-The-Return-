package jee.modeles;


public class Catalogue_Produit {

	private int id_Catalogue_Produit;
	private int id_Catalogue_Produitt;

	public Catalogue_Produit(){

	}

	public Catalogue_Produit(int id_Catalogue_Produit, int id_Catalogue_Produitt) {
		super();
		this.id_Catalogue_Produit = id_Catalogue_Produit;
		this.id_Catalogue_Produitt = id_Catalogue_Produitt;
	}

	public int getId_Catalogue_Produit() {
		return id_Catalogue_Produit;
	}

	public void setId_Catalogue_Produit(int id_Catalogue_Produit) {
		this.id_Catalogue_Produit = id_Catalogue_Produit;
	}

	public int getId_Catalogue_Produitt() {
		return id_Catalogue_Produitt;
	}

	public void setId_Catalogue_Produitt(int id_Catalogue_Produitt) {
		this.id_Catalogue_Produitt = id_Catalogue_Produitt;
	}

	@Override
	public String toString() {
		return "Catalogue_Produit [id_Catalogue_Produit="
				+ id_Catalogue_Produit + ", id_Catalogue_Produitt="
				+ id_Catalogue_Produitt + "]";
	}

}