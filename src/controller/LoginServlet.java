package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Admin;
import services.Services;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private RequestDispatcher requestDispatcher;
       
    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome = request.getParameter("nome");
		System.out.println("Nome: "+nome);
		String senha = request.getParameter("senha");
		System.out.println("Senha: "+senha);
		String endereco = request.getParameter("");
		System.out.println("Endereço: "+endereco);
		String email = request.getParameter("");
		System.out.println("Email: "+email);
		String telefone = request.getParameter("");
		System.out.println("Telefone: "+telefone);
		
		Admin admin = new Admin();
		
		if (Services.createAdmin(nome, senha,endereco,email,telefone) == true) {
			this.requestDispatcher = request.getRequestDispatcher("admin.jsp");
        	request.getSession().setAttribute("admin", admin);
        	this.requestDispatcher.forward(request, response);
		}
	}
}
