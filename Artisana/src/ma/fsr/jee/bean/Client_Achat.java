package ma.fsr.jee.bean;

public class Client_Achat {

	private int id_achat;
	private int id_Client;

	public Client_Achat(){

	}


	public Client_Achat(int id_achat, int id_Client) {
		super();
		this.id_achat = id_achat;
		this.id_Client = id_Client;
	}


	public int getId_achat() {
		return id_achat;
	}

	public void setId_achat(int id_achat) {
		this.id_achat = id_achat;
	}

	public int getId_Client() {
		return id_Client;
	}

	public void setId_Client(int id_Client) {
		this.id_Client = id_Client;
	}


	@Override
	public String toString() {
		return "Client_Achat [id_achat=" + id_achat + ", id_Client="
				+ id_Client + "]";
	}

}