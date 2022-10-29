package model;

public class Destinos {
	private int Id_destinos;
	private double Preco;
	private String Nome_Destinos;

	
	public Destinos() {
		super();
	}
	public Destinos(int id_destinos, double preco, String nome_Destinos) {
		super();
		Id_destinos = id_destinos;
		Preco = preco;
		Nome_Destinos = nome_Destinos;
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
	@Override
	public String toString() {
		return "Destinos [Id_destinos=" + Id_destinos + ", Preco=" + Preco + ", Nome_Destinos=" + Nome_Destinos
				+"]";
	}
	
	

}
