package modelo;

public class Cliente {

	private int Id_cliente;
	private String nome;
	private String cpf;
	private String Endereco;

	public Cliente() {
	}

	public Cliente(int id, String nome, String cpf, String Endereco) {
		this.Id_cliente = id;
		this.nome = nome;
		this.cpf = cpf;
		this.Endereco = Endereco;
	}

	public int getId_cliente() {
		return Id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		Id_cliente = id_cliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String endereco) {
		Endereco = endereco;
	}

	// ToString
	@Override
	public String toString() {
	return "Cliente [id=" + Id_cliente + ", nome=" + nome + ", cpf=" + cpf +", Endereco="+ Endereco+"]";
	}

}


