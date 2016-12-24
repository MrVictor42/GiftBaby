package controller;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
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

@WebServlet("/AlterarInformacoesServlet")
public class AlterarInformacoesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private RequestDispatcher requestDispatcher;   
    
    public AlterarInformacoesServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Admin admin = new Admin();
		List<Admin> admins = AdminDao.listarAdmin(); 
		String senha;
		String ID;
		
		try {
			ID = admins.get(0).getId();
			System.out.println("ID: "+ID);
			admin.setNome(request.getParameter("nome"));
			System.out.println("NOME: " +admin.getNome());
			admin.setEnderecoLoja(request.getParameter("enderecoLoja"));
			System.out.println("ENDEREÇO: "+admin.getEnderecoLoja());
			admin.setEmail(request.getParameter("email"));
			System.out.println("EMAIL: "+admin.getEmail());
			admin.setTelefone(request.getParameter("telefone"));
			System.out.println("TELEFONE: "+admin.getTelefone());
			senha = request.getParameter("senha");
			senha = Services.transformaSenha(senha);
			admin.setSenha(senha);
			
			AdminDao.editarAdmin(admin, ID);
			this.requestDispatcher = request.getRequestDispatcher("informacoes.jsp");
			this.requestDispatcher.forward(request, response);
		} catch (NoSuchAlgorithmException error) {
			error.printStackTrace();
		}
	}
}
