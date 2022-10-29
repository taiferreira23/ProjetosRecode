package model;

import model.Destinos;
import model.Pedido;

public class teste {
	public static void main(String[] args)  {
		
		Cliente c1 = new Cliente(2, "Marcos", "11223344556", "Rua da lua");
		
		Destinos d1 = new Destinos(1,1600, "Dubai");
		
		Pedido p1 = new Pedido("20/05/2022- 20:00", 1, "1.600", "1", c1, d1, "22/10/2022 - 12:00");
		
		System.out.println(c1.toString() + "\n" + d1.toString());
	}

}
