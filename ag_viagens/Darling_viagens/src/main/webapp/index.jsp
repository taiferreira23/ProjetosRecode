<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html lang="pt-br">

<head>
<!-- Meta tags ObrigatÃ³rias -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="./css/style.css">
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
	integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
	crossorigin="anonymous">


<!-- Font Awesome CSS -->
<link rel='stylesheet'
	href='https://use.fontawesome.com/releases/v5.3.1/css/all.css'>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">





<title>Darling Viagens- Viaje com a melhor!</title>
<link rel="icon" href="./imagens/fevicon.png">
<!--<div class="container">-->

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


<!--Fim navegação-->

</head>
<body>

	<div class="espaco"></div>

	<div class=" container espaco-branco telap">

		<div
			style='position: relative; align-items: center; align-content: space-between;'>

			<div style='top: 1px; left: 60px;'>
				<h1 class=" centro">Pesquise Pacotes, Voôs e destinos!</h1>
				<br>
				<section class="container-fluid align-content-between">

					<div class="container ">
						<div class="row">
							<div class="col-lg-4 col-sm-12">
								<div class="input-group mb-4">
									<span class="input-group-text">Destino:</span> <input
										type="text" aria-label="cidade-destino" class="form-control"
										placeholder="Aeroporto...">
								</div>
							</div>

							<div class="col-lg-4 col-sm-12">
								<div class="input-group mb-4">
									<select class="form-select" id="inputSelectAdulto"
										aria-label="select user">
										<option selected>Adultos á partir de 18 anos</option>
										<option value="1"><input type="number" id="qtAdultos"
												placeholder="0"
												style="width: 50px; padding: 0 4px; border: 1px solid #0808003b;">
										</option>
									</select>
								</div>
							</div>

							<div class="col-lg-4 col-sm-12">
								<div class="input-group mb-4">
									<select class="form-select" id="inputSelectCrianca"
										aria-label="select user criancas">
										<option selected>Menores de 3 á 17 anos</option>
										<option value="2"><input type="number"
												name="criancas" id="qtCriancas" placeholder="0"
												style="width: 50px; padding: 0 4px; border: 1px solid #0808003b">
										</option>
									</select>
								</div>
							</div>
						</div>

						<div class="row ">

							<div class="col-lg-4 col-sm-12">
								<div class="input-group mb-4">
									<span class="input-group-text ajust-capture-sm">Check-in</span>
									<input type="date" aria-label="Check-in-user"
										class="form-control">
								</div>
							</div>

							<div class="col-lg-4 col-sm-12">
								<div class="input-group mb-4">
									<span class="input-group-text ajust-capture-sm">Check-out</span>
									<input type="date" aria-label="Check-out-user"
										class="form-control">
								</div>
							</div>

							<div class="col-lg-4 col-sm-12">
								<div class="d-grid gap-2 mb-4">
									<input class="btn btn-primary" type="submit" value="Pequisar">
								</div>
							</div>

							<br> <br> <br>

							<h3 class="centro">Os destinos mais buscados no Darling
								Viagens</h3>
							<br> <br> <br>

							<div
								class="container-fluid centro d-flex justify-content-between">


								<div>
									<img class="img-alinhado" src="./imagens/buzios.png"
										width="200%" style='border-radius: 20%;'>
									<h5>Buzios</h5>
								</div>

								<div>

									<img class="img-alinhado" src="./imagens/paraty.png"
										width="55%" style='border-radius: 20%;'>
									<h5 class="centro">Paraty</h5>

								</div>


							</div>

						</div>
					</div>
				</section>

			</div>
		</div>


		<hr class="my-1" />

	</div>


	<div class="container-fluid fixed">
		<!-- footer -->
		<footer
			class="rodape d-flex flex-wrap justify-content-between align-items-center py-3 my-4">
			<div class="col-md-4 d-flex align-items-center">
				<a href="/"
					class="mb-3 me-2 mb-md-0 text-muted text-decoration-none lh-1">
					<img src="./imagens/darling-viagens1.png" width="50">
				</a> <span class="mb-3 mb-md-0">© 2022 Company, Inc</span>
			</div>

			<ul class="nav col-md-4 justify-content-end list-unstyled d-flex">

				<li class="ms-3"><a class="text-muted" href="#"> <img
						src="./imagens/tt.png" width="35"> <svg class="bi"
							width="24" height="24">
							<use xlink:href="#twitter"></use></svg></a></li>

				<li class="ms-3"><a class="text-muted" href="#"> <img
						src="./imagens/ig.png" width="35"> <svg class="bi"
							width="24" height="24">
							<use xlink:href="#instagram"></use></svg></a></li>

				<li class="ms-3"><a class="text-muted" href="#"> <img
						src="./imagens/fb.png" width="35"> <svg class="bi"
							width="24" height="24">
							<use xlink:href="#facebook"></use></svg></a></li>


			</ul>

		</footer>

	</div>
	<!-- fim footer -->
	<!-- Bootstrap JavaScript Libraries -->
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.5/dist/umd/popper.min.js"
		integrity="sha384-Xe+8cL9oJa6tN/veChSP7q+mnSPaj5Bcu9mPX5F5xIGE0DVittaqT5lorf0EI7Vk"
		crossorigin="anonymous"></script>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.min.js"
		integrity="sha384-kjU+l4N0Yf4ZOJErLsIcvOU2qSb74wXpOhqTvwVx3OElZRweTnQ6d31fXEoRD1Jy"
		crossorigin="anonymous"></script>
	</div>
</body>
</html>