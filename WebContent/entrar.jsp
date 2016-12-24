<%@page import="model.Admin"%>
<%@page import="java.util.List"%>
<%@page import="dao.AdminDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>GiftBaby</title>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<link rel="stylesheet" href="assets/css/main.css" />
</head>
<body class="landing">
	<div id="page-wrapper">
		<header id="header" class="alt">
			<h1>
				<a href="index.jsp">Contribute</a>
			</h1>
			<%
				AdminDao adminDao = new AdminDao();
				List<Admin> admins = adminDao.listarAdmin();
				if (admins.size() == 0) {
			%>
			<nav id="nav">
				<ul>
					<li class="special"><a href="utilizador.jsp" class=""><span>Cadastre-se</span></a>
					</li>
				</ul>
			</nav>
			<%
				}
			%>
		</header>

		<section id="banner">
			<div class="inner">
				<h2>Baby Gift</h2>
				<p>
					Seu bebê merece esse carinho<br />
				</p>
				<%
					if (admins.size() != 0) {
				%>
				<ul class="actions">
					<li><a href="login.jsp" class="button special">Entrar </a></li>
				</ul>
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
	<!--[if lte IE 8]><script src="assets/js/ie/respond.min.js"></script><![endif]-->
	<script src="assets/js/main.js"></script>

</body>
</html>
