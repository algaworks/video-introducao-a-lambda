package com.algaworks.modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Fatura {

	private String emailDevedor;
	private double valor;
	private LocalDate dataVencimento;
	private boolean notificacaoEnviada;

	public Fatura(String emailDevedor, double valor, LocalDate dataVencimento) {
		this.emailDevedor = emailDevedor;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
	}

	public String getEmailDevedor() {
		return emailDevedor;
	}

	public void setEmailDevedor(String emailDevedor) {
		this.emailDevedor = emailDevedor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public LocalDate getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(LocalDate dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	
	public String resumo() {
		String dataVencimento = this.dataVencimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		return String.format("Valor R$ %s, vencimento: %s", this.valor, dataVencimento);
	}

	public boolean isNotificacaoEnviada() {
		return notificacaoEnviada;
	}

	public void setNotificacaoEnviada(boolean notificacaoEnviada) {
		this.notificacaoEnviada = notificacaoEnviada;
	}
	
}

