package jee.modeles;


public class categorie {

	private int id_categorie;
	private String intitul_categorie;

	public categorie(){

	}

	public categorie(int id_categorie, String intitul_categorie) {
		super();
		this.id_categorie = id_categorie;
		this.intitul_categorie = intitul_categorie;
	}
	public int getId_categorie() {
		return id_categorie;
	}

	public void setId_categorie(int id_categorie) {
		this.id_categorie = id_categorie;
	}

	public String getIntitul_categorie() {
		return intitul_categorie;
	}

	public void setIntitul_categorie(String intitul_categorie) {
		this.intitul_categorie = intitul_categorie;
	}

	@Override
	public String toString() {
		return "categorie [id_categorie=" + id_categorie
				+ ", intitul_categorie=" + intitul_categorie + "]";
	}

	
  
} 