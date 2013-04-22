package jee.modeles;

public class Achat {

	private String Date_Achat;
	private int id_Achat;
	public int id_Client;

	public Achat(){

	}

	public Achat(String date_Achat, int id_Achat, int id_Client) {
		
		Date_Achat = date_Achat;
		this.id_Achat = id_Achat;
		this.id_Client = id_Client;
	}

	public String getDate_Achat() {
		return Date_Achat;
	}

	public void setDate_Achat(String date_Achat) {
		Date_Achat = date_Achat;
	}

	public int getId_Achat() {
		return id_Achat;
	}

	public void setId_Achat(int id_Achat) {
		this.id_Achat = id_Achat;
	}

	public int getid_Client() {
		return id_Client;
	}

	public void setid_Client(int id_Client) {
		this.id_Client = id_Client;
	}
@Override
public String toString() {
	
	return ""+id_Achat+""+id_Client+""+Date_Achat;
}

}