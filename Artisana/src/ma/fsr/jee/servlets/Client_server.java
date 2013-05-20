package ma.fsr.jee.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ma.fsr.jee.dao.*;
import ma.fsr.jee.bean.*;
/**
 * Servlet implementation class Client_server
 */
@WebServlet("/Client_server")
public class Client_server extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String CONF_DAO_FACTORY = "daofactory";
    public static final String ATT_USER         = "client";
    public static final String ATT_FORM         = "form";
    public static final String VUE              = "/WEB-INF/client.jsp";
    private static final String ALGO_CHIFFREMENT = "SHA-256";
    private ClientDao     clientDao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public void init() throws ServletException{
    	this.clientDao = ( (DAOFactory) getServletContext().getAttribute( CONF_DAO_FACTORY ) ).getClientDao();
    }
    public Client_server() {
        super();
        // TODO Auto-generated constructor stub
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String forward="";
        String action = request.getParameter("action");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
