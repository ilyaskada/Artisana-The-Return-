package ma.fsr.jee.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ma.fsr.jee.bean.Admin;
import ma.fsr.jee.dao.Login_Admin_DAO;
 
/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Login_Admin_Servlet")
public class Login_Admin_Servlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login_Admin_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }
 
    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try
        {
            System.out.println("In the Login Servlet");
            Admin admin = new Admin() ;
            admin.setLogin_Admin(request.getParameter("login"));
            //user.setUserName();
            admin.setPass_Admin(request.getParameter("password"));
            //user.setPassword(request.getParameter("password"));
            admin = Login_Admin_DAO.login(admin);
            if(admin.isValid())
            {
                HttpSession session = request.getSession(true);
                session.setAttribute("currentSessionUser",admin);
                response.sendRedirect("LoginSuccess.jsp");
            }else
                response.sendRedirect("LoginFailed.jsp");
        } catch (Throwable exc)
        {
            System.out.println(exc);
        }
    }
 
    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
    }
 
}