package ma.fsr.jee.bean;

public class Client {

	private int id_Adim;
	private int id_Client;
	private String login_Client;
	private String pass_Client;
	public int id_Commande;

	public Client(){

	}

	public Client(int id_Adim, int id_Client, String login_Client,
			String pass_Client, int id_Commande) {
		super();
		this.id_Adim = id_Adim;
		this.id_Client = id_Client;
		this.login_Client = login_Client;
		this.pass_Client = pass_Client;
		this.id_Commande = id_Commande;
	}

	public int getId_Adim() {
		return id_Adim;
	}

	public void setId_Adim(int id_Adim) {
		this.id_Adim = id_Adim;
	}

	public int getId_Client() {
		return id_Client;
	}

	public void setId_Client(int id_Client) {
		this.id_Client = id_Client;
	}

	public String getLogin_Client() {
		return login_Client;
	}

	public void setLogin_Client(String login_Client) {
		this.login_Client = login_Client;
	}

	public String getPass_Client() {
		return pass_Client;
	}

	public void setPass_Client(String pass_Client) {
		this.pass_Client = pass_Client;
	}

	public int getId_Commande() {
		return id_Commande;
	}

	public void setId_Commande(int id_Commande) {
		this.id_Commande = id_Commande;
	}

	@Override
	public String toString() {
		return "Client [id_Adim=" + id_Adim + ", id_Client=" + id_Client
				+ ", login_Client=" + login_Client + ", pass_Client="
				+ pass_Client + ", id_Commande=" + id_Commande + "]";
	}

}