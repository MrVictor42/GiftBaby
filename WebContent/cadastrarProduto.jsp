<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Baby Gift - Cadastro de Produtos</title>

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
								<li><a href="#">Cadastrar Produtos</a></li>
								<li><a href="#">Editar Produtos</a></li>
								<li><a href="#">Excluir Produtos</a></li>
							</ul>
						</div></li>
					<li class="special"><a href="alterarInformacoes.jsp" class=""><span>Informações</span></a>
				</ul>
			</nav>
		</header>

		<section id="banner">
			<div class="inner">
				<h2>Cadastrar Produto</h2>
				<div class="form-group">
					<label>Nome do Produto</label> <input type="text"
						name="nomeProduto" id="nomeProduto" class="form-control input-sm"
						placeholder="Insira o nome do produto" required>
				</div>
				<div class="form-group">
					<label>Tamanho</label> <input type="text" name="tam" id="tam"
						class="form-control input-sm"
						placeholder="Insira o tamanho da peça(apenas números)" required>
				</div>
				<div class="form-group">
					<label>Descrição</label>
					<textarea class="form-control" maxlength="150" rows="3"
						name="descricao" id="descricao"
						placeholder="Insira uma descrição sobre a peça" required></textarea>
				</div>
				<div class="control-group">
					<label class="control-label">Foto</label>
					<div class="controls">
						<input id="foto" name="foto" class="input-file" type="file">
					</div>
				</div>
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
