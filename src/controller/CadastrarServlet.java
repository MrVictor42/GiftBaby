package controller;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AdminDao;
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

		Admin admin = new Admin();
		final String ID = "1";
		String senha;
		
		try {
			admin.setId(ID);
			admin.setNome(request.getParameter("nome")); 
			admin.setEnderecoLoja(request.getParameter("endereco"));
			admin.setEmail(request.getParameter("email"));
			admin.setTelefone(request.getParameter("telefone"));
			senha = request.getParameter("senha");
			senha = Services.transformaSenha(senha);
			admin.setSenha(senha);
			
			AdminDao.insertAdmin(admin);
			this.requestDispatcher = request.getRequestDispatcher("entrar.jsp");
			this.requestDispatcher.forward(request, response);
		} catch (NoSuchAlgorithmException error) {
			error.printStackTrace();
		}
	}
}
