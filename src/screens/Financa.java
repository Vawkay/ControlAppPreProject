package screens;

import java.util.ArrayList;

public class Financa {
	double valor;
	String tipo;
	String obs;
	static ArrayList<Financa> recDesp = new ArrayList<Financa>();
	
	public Financa(double valor, String tipo, String obs) {	
		this.valor = valor;
		this.tipo = tipo;
		this.obs = obs;
	}
	
	public static double calculaSaldo() {
		double soma = 0;
		for (int i=0; i<recDesp.size(); i++) {
			soma += recDesp.get(i).getValor();
		}
		return soma;
	}
	

	public static void addlista(Financa Financa) {
		recDesp.add(Financa);
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getObs() {
		return obs;
	}
	public void setObs(String obs) {
		this.obs = obs;
	}
	
	
}
