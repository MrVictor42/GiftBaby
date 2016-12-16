package controller;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AdminDao;
import model.Admin;
import services.Services;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private RequestDispatcher requestDispatcher;

	public LoginServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			List<Admin> admin = new ArrayList<Admin>();
			admin = AdminDao.listarAdmin();
			String email = request.getParameter("email");
			String senha = request.getParameter("senha");
			senha = Services.transformaSenha(senha);
			System.out.println("EMAIL : " + admin.get(0).getEmail());
			System.out.println("SENHA: " + admin.get(0).getSenha());
			System.out.println(email);
			System.out.println(senha);

			this.requestDispatcher = request.getRequestDispatcher("admin.jsp");
			request.getSession().setAttribute("admin", admin);
			this.requestDispatcher.forward(request, response);

		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
	}
}
