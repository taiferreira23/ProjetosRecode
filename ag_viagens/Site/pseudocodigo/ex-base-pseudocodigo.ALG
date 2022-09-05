algoritmo "Cadastro"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Função :
// Autor :
// Data : 14/09/2010
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
escreval("*****Cadastro de cliente*****")
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
escreval("*****Consultar dados*****")
escreval("Consultar Nome - 1")
escreval("Consultar Endereço - 2")
escreval("Consultar Destino - 3")
escreval("Consultar Telefone - 4")
leia(tip)
se tip=1 então
escreva("Consulte o Nome:")
leia (cadv[l,c])
senao
se tip=2 então
escreva("Consulte o Endereço:")

senao
se tip=3 então
escreva("Consulte o Destino:")
senao
se tip=4 então
escreva("Consulte o Telefone:")
senao
fimse
fimse
fimse
fimse
caso 5
escreva("Programa encerrado!")
outrocaso
escreval("opção Invalida")
fimescolha
ate opcao=5
fimalgoritmo