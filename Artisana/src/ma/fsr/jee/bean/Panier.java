package ma.fsr.jee.bean;

public class Panier {

	private int id_Client;
	private int id_Panier;

	public Panier(){

	}

	public Panier(int id_Client, int id_Panier) {
		super();
		this.id_Client = id_Client;
		this.id_Panier = id_Panier;
	}

	public int getId_Client() {
		return id_Client;
	}

	public void setId_Client(int id_Client) {
		this.id_Client = id_Client;
	}

	public int getId_Panier() {
		return id_Panier;
	}

	public void setId_Panier(int id_Panier) {
		this.id_Panier = id_Panier;
	}

	@Override
	public String toString() {
		return "Panier [id_Client=" + id_Client + ", id_Panier=" + id_Panier
				+ "]";
	}

}