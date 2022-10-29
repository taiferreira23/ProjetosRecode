<%@ page 
	language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="model.Destinos"
    import="java.util.List"
%>

<%
@SuppressWarnings("unchecked")
List<Destinos> lista = (List<Destinos>) request.getAttribute("destinos");
%>

<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="icon" href="./imagens/fevicon.png" type="image/svg" />
<link rel="stylesheet" href="../css/adm.css" />
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" />
<title>Darling Viagens | Destinos</title>
<link rel="icon" href="../imagens/fevicon.png">
</head>
<body>
	<main>
	
	
	<div class="container-fluid fixed-top">
		<nav class="navbar navbar-expand-lg navbar-light menu nabar-transparente">
			<a class="navbar-brand" href="index.html"> <img src="../imagens/darling-viagens1.png" width="90">
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
			</div>
		</nav>
	</div>
	
		
	<section class="container">
		 <div class="p-4">
			 	<a href="./views/autores/create.html" class="btn btn-primary mb-2 botao1">
		            Novo Destino
		        </a>
					<table class="table table-responsive table-hover">
				  	<thead class="table-dark">
				    <tr>
				      <th scope="col">#</th>
				      <th scope="col">Preço</th>
				      <th scope="col">Nome Destino</th>
				    </tr>
				  </thead>
				  <tbody>
		
					<% for (Destinos a: lista) { %>
					  	<tr>
					  	<td><%=a.getNome_Destinos() %></td>
					      <td><%=a.getPreco() %></td>
					      <td>
					      	<div class="d-flex">
	                           <a href="edit?id=<%=a.getId_destinos() %>" class="mx-1"
	                           		title="Editar">
	                               <i class="ri-file-edit-line"></i>
	                           </a>
	                           <a href="delete?id=<%=a.getPreco() %>" class="mx-1"
	                           		title="Cancelar"
	                           		onclick="return confirm('Deseja excluir o destino <%=a.getPreco() %>.')">
	                               <i class="ri-delete-bin-2-line"></i>
	                           </a>	                           
	                           <a href="delete?id=<%=a.getNome_Destinos() %>" class="mx-1"
	                           		title="Cancelar"
	                           		onclick="return confirm('Deseja excluir o destino <%=a.getNome_Destinos() %>.')">
	                               <i class="ri-delete-bin-2-line"></i>
	                           </a>	                           
	                       	</div>
	                       </td>
					    </tr>
				  	<% } %>
				  	
				  </tbody>
				</table>
			 </div>
	      </section>
	      
	    </main>
    
	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.min.js" integrity="sha384-7VPbUDkoPSGFnVtYi0QogXtr74QeVeeIs99Qfg5YCF+TidwNdjvaKZX19NZ/e6oz" crossorigin="anonymous"></script>
</body>
</html>