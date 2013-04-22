package jee.modeles;

public class Admin {

	private int id_Admin;
	private String login_Admin;
	private String pass_Admin;
	
	public Admin(){

	}

	public Admin(int id_Admin, String login_Admin, String pass_Admin) {
		super();
		this.id_Admin = id_Admin;
		this.login_Admin = login_Admin;
		this.pass_Admin = pass_Admin;
	}

	public int getId_Admin() {
		return id_Admin;
	}

	public void setId_Admin(int id_Admin) {
		this.id_Admin = id_Admin;
	}

	public String getLogin_Admin() {
		return login_Admin;
	}

	public void setLogin_Admin(String login_Admin) {
		this.login_Admin = login_Admin;
	}

	public String getPass_Admin() {
		return pass_Admin;
	}

	public void setPass_Admin(String pass_Admin) {
		this.pass_Admin = pass_Admin;
	}
	@Override
	public String toString() {
	
		return ""+id_Admin+""+login_Admin;
	}


}