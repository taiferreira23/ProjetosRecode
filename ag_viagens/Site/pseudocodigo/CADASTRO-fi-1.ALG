algoritmo "Cadastro Darling viagens0"
// Disciplina   : [Linguagem e Lógica de Programação]
// Função :  o programa deve cadastrar o cliente e consultar esse cadastro depois
// Autor :  Taiane Ferreira
// Seção de Declarações
var
cadv : vetor[1..4, 1..4] de caractere
l, c : inteiro


opcao,tip:inteiro
nome, endereco, cadastro:caractere
destino,telefone,data_nascimento:caractere
inicio
// Seção de Comandos
repita
escreval("**Cadastro de cliente**")
escreval("1-incluir")
escreval("2-consultar")
escreval("3-Sair")
leia(opcao)
escolha opcao

caso 1
escreva("Nome:")
para l de 1 ate 4 faca
para c de 1 ate 4 faca
leia (cadv[1,1])

escreva("Endereço:")
para l de 1 ate 4 faca
para c de 1 ate 4 faca
leia (cadv[2,1])

escreva("Destino:")
para l de 1 ate 4 faca
para c de 1 ate 4 faca
leia (cadv[3,1])

escreva("Telefone:")
para l de 1 ate 4 faca
para c de 1 ate 4 faca
leia (cadv[4,1])


caso 2
escreval("**Consultar dados do cliente**")
escreval("Consultar Dados Cliente - 1")
leia(tip)
se tip=1 então
escreva("Consulte os dados do cliente:")
para l <-  1 ate 4 faca
para c <-  1 ate 4 faca
escreva (cadv[l,c]:20)
fimpara
escreval()
fimpara
fimse


escreva("Programa encerrado!")
fimescolha
fimpara
fimpara
fimalgoritmo
