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
					<li><a href="#menu" class="menuToggle"><span>Produtos</span></a>
						<div id="menu">
							<ul>
								<li><a href="#">Todos os Produtos</a></li>
								<li><a href="cadastrarProduto.jsp">Cadastrar Produtos</a></li>
								<li><a href="#">Editar Produtos</a></li>
								<li><a href="#">Excluir Produtos</a></li>
								<li><a href="#">Procurar Produto</a></li>
							</ul>
						</div></li>
					<li class="special"><a href="alterarInformacoes.jsp" class=""><span>Informações</span></a>
				</ul>
			</nav>
		</header>

		<section id="banner">
			<div class="inner">
				<h2>BabyGift</h2>
				<p>
					Seu bebê merece esse carinho<br />
				</p>
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
