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

@WebServlet("/CadastrarServlet")
public class CadastrarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private RequestDispatcher requestDispatcher;

	public CadastrarServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		final int ID = 1;
		String nome = request.getParameter("nome");
		System.out.println("Nome: " + nome);
		String endereco = request.getParameter("enderecoLoja");
		System.out.println("Endereço: " + endereco);
		String email = request.getParameter("email");
		System.out.println("Email: " + email);
		String telefone = request.getParameter("telefone");
		System.out.println("Telefone: " + telefone);
		String senha = request.getParameter("senha");
		System.out.println("Senha: " + senha);

		Admin admin = new Admin();

		if (Services.createAdmin(ID,nome, senha, endereco, email, telefone) == true) {
			this.requestDispatcher = request.getRequestDispatcher("admin.jsp");
			request.getSession().setAttribute("admin", admin);
			this.requestDispatcher.forward(request, response);
		}
	}
}
