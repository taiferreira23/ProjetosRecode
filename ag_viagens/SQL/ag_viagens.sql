CREATE DATABASE AG_vIAGENS;

USE AG_VIAGENS;

CREATE TABLE Cliente (
CPF VARCHAR(11),
Nome VARCHAR(30),
Endereco VARCHAR(100),
Id_cliente integer PRIMARY KEY auto_increment
);

alter table Cliente 
change Endereço Endereco varchar(100);

CREATE TABLE Destinos (
Id_destinos integer PRIMARY KEY auto_increment,
Preco VARCHAR(10),
Nome_Destinos VARCHAR(10)
);

CREATE TABLE Pedido (

Data_Hora VARCHAR(30),
Id_pedido integer PRIMARY KEY auto_increment,
Total_Valor VARCHAR(10),
Total_Itens VARCHAR(10),
Nome_Destinos VARCHAR(10),
Data_Embarque VARCHAR(30)
);

alter table Pedido
change Data_Embarque DATETIME  varchar(40);


CREATE TABLE Busca (
Id_pedido int,
Id_destinos int
);

CREATE TABLE Faz (
Id_pedido int,
Id_cliente int,
FOREIGN KEY(Id_cliente) REFERENCES Cliente (Id_cliente)
);

ALTER TABLE Busca ADD FOREIGN KEY(Id_pedido) REFERENCES Pedido (Id_pedido);
ALTER TABLE Busca ADD FOREIGN KEY(Id_destinos) REFERENCES Destinos (Id_destinos);
ALTER TABLE Faz ADD FOREIGN KEY(Id_pedido) REFERENCES Pedido (Id_pedido);

select*from Cliente;
insert into Cliente (CPF, Nome, Endereço) values ('11223344556', 'hhhhhh', 'rua sul');
insert into Cliente (CPF, Nome, Endereço) values ('3344556678', 'Aline Ferreira', 'rua l');
insert into Destinos (Preco, Nome_Destinos) values ('1500', 'Bahia');
select*from Destinos;
