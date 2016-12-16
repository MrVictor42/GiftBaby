package controller;

import java.io.IOException;
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

@WebServlet("/InformacoesServlet")
public class InformacoesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private RequestDispatcher requestDispatcher;
	
    public InformacoesServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Admin> admin = new ArrayList<Admin>();
		
		admin = AdminDao.listarAdmin();
		request.setAttribute("adminInformacoes", admin);
		this.requestDispatcher = request.getRequestDispatcher("informacoes.jsp");
		this.requestDispatcher.forward(request, response);
	}

}
