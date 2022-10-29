<%@ page 
	language="java" 
	contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" href="../css/adm.css"/>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" />
<title>Darling Viagens | Atualizar Destino</title>
<link rel="icon" href="../imagens/fevicon.png">
</head>
<body class="bodylogin">
	<main>

				<div class="container-fluid fixed-top">
	<nav
		class="navbar navbar-expand-lg navbar-light menu nabar-transparente">
		<a class="navbar-brand" href="index.html"> <img
			src="../imagens/darling-viagens1.png" width="90">
		</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarNavAltMarkup"
			aria-controls="navbarNavAltMarkup" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarNavAltMarkup">
			<ul class="navbar-nav" id="esquerda">
				<li class="nav-item"><a class="nav-link" href="Cliente.jsp">Cliente</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="Pedido.jsp">Pedido</a>
				</li>					
			</ul>
	</nav>
</div>
		
		<div class="container py-3">
            <form action="./update">
	            <h2 class="text-center">Atualizar Destinos</h2>
	            
	            <div class="form-group mb-3">
	                <label for="id" class="form-label">
	                    Id
	                </label>
	                <input type="text" id="id" name="id" class="form-control"
	                value="<%=request.getAttribute("Id_destinos") %>" readonly/>
	            </div>
	            
	            <div class="form-group mb-3">
	                <label for="nome" class="form-label">
	                    Nome
	                </label>
	                <input type="text" id="nome" name="nome"  class="form-control" 
	                value="<%=request.getAttribute("Nome_Destinos") %>" />
	            </div>
	            
	            <div class="form-group mb-3">
	            	
	            	<label for="nome" class="form-label">
	                    Preço
	                </label>

	                <input type="text" id="preco" name="preco" class="form-control" 
	                value="<%=request.getAttribute("Preco") %>" />
	            </div>
	
	            <button type="submit" class="btn btn-primary">
	                Enviar
	            </button>
	            <a href="./autores" class="btn btn-danger" style="margin-left: 10px">
	                Cancelar
	            </a>
            </form>
        </div>
		
    </main>
    

	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</body>
</html>