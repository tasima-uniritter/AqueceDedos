package com.modelo;

public class Desenvolvedor extends Colaborador {

	public Desenvolvedor(Double salario) {
		super();
		super.setSalario(salario);
	}

	@Override
	public Integer getPercentualDesconto() {
		if (getSalario() > getLimiarSalario()) {
			return 20;
		}
		return 10;
	}

	@Override
	public Double getLimiarSalario() {
		return new Double(3000);
	}

}
