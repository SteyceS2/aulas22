package Associacao;

public class carros {
	private String modelo;
	private Motor motor; // agregação

	public carros(String modelo, Motor motor) {
		this.modelo = modelo;
		this.motor = motor;
	}
	public String getModelo() {
		return modelo;
		
	}
	public void getModelo (String modelo) {
		this.modelo = modelo;
	}

}


