package br.com.bdam.carro;

public abstract class Carro {
	
	public String modelo;
	
	public String potencia;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPotencia() {
		return potencia;
	}

	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", potencia=" + potencia + "]";
	}

}
