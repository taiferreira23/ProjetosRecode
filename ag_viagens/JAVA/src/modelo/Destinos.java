package modelo;

public class Destinos {
	private int Id_destinos;
	private double Preco;
	private String Nome_Destinos;
	public String getId_destinos;
	
	public Destinos() {
		
	}

	public Destinos(int Id_destinos, String Nome_Destinos, double Preco) {

		this.Id_destinos = Id_destinos;
		this.Preco = Preco;
		this.Nome_Destinos = Nome_Destinos;
	}
	

	public int getId_destinos() {
		return Id_destinos;
	}


	public void setId_destinos(int id_destinos) {
		Id_destinos = id_destinos;
	}


	public double getPreco() {
		return Preco;
	}


	public void setPreco(double preco) {
		Preco = preco;
	}


	public String getNome_Destinos() {
		return Nome_Destinos;
	}


	public void setNome_Destinos(String nome_Destinos) {
		Nome_Destinos = nome_Destinos;
	}


	public void atualizarValor(double percentual) {
		Preco = Preco + (Preco / 100 * percentual);
	}
	

	// ToString

	@Override
	public String toString() {
		return "Destinos [Id_destinos=" + Id_destinos + ", Nome_Destinos=" + Nome_Destinos + ", Preco=" + Preco + "]";
	}

}