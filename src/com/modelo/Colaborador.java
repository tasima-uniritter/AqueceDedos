package com.modelo;

public abstract class Colaborador {
	
	
	private Double salario;
	
	
	public Double getDesconto() {
		return null;
	}
	
	public abstract Integer getPercentualDesconto();
	
	public abstract Double getLimiarSalario();

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
}
