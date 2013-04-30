package ma.fsr.jee.bean;


public class Catalogue {

	private String Date_Catalogue;
	private int id_Catalogue;
	public int id_Produit;

	public Catalogue(){

	}

	public Catalogue(String date_Catalogue, int id_Catalogue, int id_Produit) {
		super();
		Date_Catalogue = date_Catalogue;
		this.id_Catalogue = id_Catalogue;
		this.id_Produit = id_Produit;
	}

	public String getDate_Catalogue() {
		return Date_Catalogue;
	}

	public void setDate_Catalogue(String date_Catalogue) {
		Date_Catalogue = date_Catalogue;
	}

	public int getId_Catalogue() {
		return id_Catalogue;
	}

	public void setId_Catalogue(int id_Catalogue) {
		this.id_Catalogue = id_Catalogue;
	}

	public int getId_Produit() {
		return id_Produit;
	}

	public void setId_Produit(int id_Produit) {
		this.id_Produit = id_Produit;
	}

	@Override
	public String toString() {
		return "Catalogue [Date_Catalogue=" + Date_Catalogue
				+ ", id_Catalogue=" + id_Catalogue + ", id_Produit="
				+ id_Produit + "]";
	}

}