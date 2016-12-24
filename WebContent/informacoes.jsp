<%@page import="model.Admin"%>
<%@page import="java.util.List"%>
<%@page import="dao.AdminDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Baby Gift</title>

<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<link rel="stylesheet" href="assets/css/main.css" />

</head>
<body class="landing">
	<div id="page-wrapper">
		<header id="header" class="alt">
			<h1>
				<a href="index.jsp">GiftBaby</a>
			</h1>
			<nav id="nav">
				<ul>
					<li class="special"><a href="informacoes.jsp" class=""><span>Informações</span></a>
					<li class="special"><a href="#" class=""><span>Produtos</span></a>
				</ul>
			</nav>
		</header>

		<section id="banner">
			<div class="inner">
				<h2>Informações</h2>
				<p>
					<%
						AdminDao adminDao = new AdminDao();
						List<Admin> admins = adminDao.listarAdmin();
						for (int aux = 0; aux < admins.size(); aux++) {
					%>
					Nome do Proprietário : <%=admins.get(aux).getNome() %><br/>
					Contato : <%=admins.get(aux).getTelefone()%><br /> 
					Endereço da Loja: <%=admins.get(aux).getEnderecoLoja()%><br />
					Email para contato : <%=admins.get(aux).getEmail() %><br />
				</p>
				<%
					}
				%>
			</div>
		</section>
	</div>

	<!-- Scripts -->
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/jquery.scrollex.min.js"></script>
	<script src="assets/js/jquery.scrolly.min.js"></script>
	<script src="assets/js/skel.min.js"></script>
	<script src="assets/js/util.js"></script>
	<script src="assets/js/main.js"></script>
</body>
</html>
