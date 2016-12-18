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
<title>Gift Baby - Alterar Informações</title>
</head>
<body background="images/cinza.png" bgproperties="fixed">
	<div class="container">
		<div class="row centered-form">
			<div
				class="col-xs-12 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-4">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">Alterar Informações do Administrador</h3>
					</div>
					<div class="panel-body">
						<form role="form" method="post" action="">
							<div class="row">
								<div class="col-xs-12 col-sm-12 col-md-12">
									<div class="form-group">
										<input type="text" name="nome" id="nome"
											class="form-control input-sm" placeholder="Nome"
											required>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-xs-12 col-sm-12 col-md-12">
									<div class="form-group">
										<input type="text" name="endereco" id="enderecoLoja"
											class="form-control input-sm" placeholder="Endereco da Loja"
											required>
									</div>
								</div>
							</div>
							<div class="form-group">
								<input type="email" name="email" id="email"
									class="form-control input-sm"
									"
									placeholder="Email: exemplo@exemplo.com" required>
							</div>
							<div class="form-group">
								<input type="number" name="telefone" id="telefone"
									class="form-control input-sm"
									"
									placeholder="Telefone: (XX) XXXXX-XXXX" required>
							</div>
							<input type="submit" value="Alterar Informações"
								class="btn btn-info btn-block">
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>