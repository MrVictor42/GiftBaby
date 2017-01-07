package controller;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.imageio.ImageIO;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.FileItemFactory;
import org.apache.tomcat.util.http.fileupload.FileUpload;
import org.apache.tomcat.util.http.fileupload.FileUploadException;
import org.apache.tomcat.util.http.fileupload.RequestContext;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

import dao.ProdutosDao;
import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;
import model.Produtos;
import services.Services;

@WebServlet("/CadastrarProdutoServlet")
public class CadastrarProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private RequestDispatcher requestDispatcher;

	public CadastrarProdutoServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Produtos produtos = new Produtos();

		if (ServletFileUpload.isMultipartContent(request)) {

			FileItemFactory factory = new DiskFileItemFactory();
			ServletFileUpload upload = new ServletFileUpload(factory);

			String formulario = "";

			try {
				List items = upload.parseRequest((RequestContext) request);
				Iterator iter = items.iterator();
				while (iter.hasNext()) {
					FileItem item = (FileItem) iter.next();
					if (item.getFieldName().equals("foto")) {
						formulario = item.getString();
					}
					if (!item.isFormField()) {
						if (item.getName().length() > 0) {
							produtos.setNome(request.getParameter("nomeProduto"));
							produtos.setTam(request.getParameter("tamanho"));
							produtos.setPreco(Double.parseDouble(request.getParameter("preco")));
							produtos.setDescricao(request.getParameter("descricao"));
							produtos.setImagemFile(item);
							PrintWriter out = null;
							out.write("Chegou aqui");
						}
					}
				}
			} catch (FileUploadException ex) {
				ex.printStackTrace();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
}
