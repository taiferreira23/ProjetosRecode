<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<!-- Meta tags ObrigatÃ³rias -->

<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="./css/adm.css">
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
	integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
	crossorigin="anonymous">
	
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">



<title>Pagina de Login adm</title>
<link rel="icon" href="./imagens/fevicon.png">
</head>

<body class="bodylogin">

<!--Inicio navegação-->
<div class="container-fluid fixed-top">
	<nav
		class="navbar navbar-expand-lg navbar-light menu nabar-transparente">
		<a class="navbar-brand" href="index.html"> <img
			src="./imagens/darling-viagens1.png" width="90">
		</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarNavAltMarkup"
			aria-controls="navbarNavAltMarkup" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarNavAltMarkup">
			<ul class="navbar-nav" id="esquerda">
				<li class="nav-item"><a class="nav-link" href="destinos.jsp">Destinos</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="contato.jsp">Contato</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="promocoes.jsp">Promoções</a>
					<ul>
						<li><a href="pacotes.jsp">Pacotes</a></li>
					</ul></li>
						
				<li class="nav-item"><a class="nav-link" href="login.jsp">login</a>
				</li>
					
					
			</ul>
	</nav>
</div>

<body>
  <div class="row align-items-center h-100 ">
      <div class="col-8 col-md-3 col-xs-8 mx-auto l-form">
          <form>
              <img class="row mx-auto" src="./imagens/darling-viagens1.png" width="150">
              <div class="form-group">
                  <input type="text" name="email" placeholder="Email" class="form-control i-form">
              </div>
              <br>
              <div class="form-group">
                  <input type="password" name="password" placeholder="Password" class="form-control i-form">
              </div>
              <br>
              <div class="form-group botao">
                  <button type="button" class="btn btn-info btn-lg botaoEnviar">Login</button>
              </div>
          </form>
      </div>
  </div>
  


  
</body>

</html>
	