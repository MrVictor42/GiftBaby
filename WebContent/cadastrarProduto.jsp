<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link href="assets/css/bootstrap.min.css" rel="stylesheet">
<link href="assets/css/bootstrap.css" rel="stylesheet">
<link href="assets/css/utilizador.css" rel="stylesheet">
<script src="assets/js/bootstrap.min.js"></script>
<script src="assets/js/bootstrap.js"></script>
<script src="assets/js/utilizador.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.4/js/bootstrap.min.js"></script>
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.4/css/bootstrap.min.css"
	rel="stylesheet" />
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Gift Baby - Cadastrar Produto</title>
</head>
<body background="images/cinza.png" bgproperties="fixed">
	<div class="container">
		<div class="row centered-form">
			<div
				class="col-xs-12 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-4">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">Cadastrar Produto</h3>
					</div>
					<div class="panel-body">
						<form action="CadastrarProdutoServlet" method="post" accept-charset="UTF-8" role="form">
							<div class="form-group">
								<input type="hidden" id="idPublicacao">
							</div>
							<div class="row">
								<div class="col-xs-12 col-sm-12 col-md-12">
									<div class="form-group">
										<label>Nome do Produto</label> <input type="text"
											name="nomeProduto" id="nomeProduto"
											class="form-control input-sm"
											placeholder="Insira o nome do produto" required>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-xs-6 col-sm-6 col-md-6">
									<div class="form-group">
										<label>Tamanho</label> <input type="number" name="tamanho"
											id="tamanho" class="form-control input-sm"
											placeholder="Apenas números" required>
									</div>
								</div>
								<div class="col-xs-6 col-sm-6 col-md-6">
									<div class="form-group">
										<label>Preço</label> <input type="number" name="preco"
											id="preco" class="form-control input-sm"
											placeholder="Apenas números" required>
									</div>
								</div>
								<div class="form-group">
									<div class="col-xs-12 col-sm-12 col-md-12">
										<label>Descrição</label>
										<textarea class="form-control" maxlength="150" rows="3"
											name="descricao" id="descricao"
											placeholder="Insira uma descrição sobre a peça" required></textarea>
									</div>
								</div>
							</div>
							<div class="control-group">
								<label class="control-label">Foto</label>
								<div class="controls">
									<input id="foto" name="foto" class="input-file" type="file">
								</div>
							</div>
							<input type="submit" value="Salvar Produto"
								class="btn btn-info btn-block">
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>