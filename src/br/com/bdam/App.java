package br.com.bdam;

import java.util.ArrayList;
import java.util.List;

import br.com.bdam.carro.BMW;
import br.com.bdam.carro.Carro;
import br.com.bdam.carro.Chevrolet;
import br.com.bdam.carro.Honda;
import br.com.bdam.carro.Tesla;

public class App {

	public static void main(String[] args) {
		List<Carro> listaCarros = new ArrayList<>();
		Carro honda = new Honda();
		Carro chevrolet = new Chevrolet();
		Carro tesla = new Tesla();
		Carro bmw = new BMW();
		listaCarros.add(honda);
		listaCarros.add(chevrolet);
		listaCarros.add(tesla);
		listaCarros.add(bmw);
		
		for (Carro carro : listaCarros) {
			System.out.println(carro.toString());			
		}

	}

}
