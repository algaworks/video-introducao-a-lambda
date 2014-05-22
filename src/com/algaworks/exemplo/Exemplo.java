package com.algaworks.exemplo;

import java.util.List;

import com.algaworks.dao.FaturaDAO;
import com.algaworks.email.EnviadorEmail;
import com.algaworks.modelo.Fatura;

public class Exemplo {

	public static void main(String[] args) {
		EnviadorEmail enviadorEmail = new EnviadorEmail();
		
		List<Fatura> faturasVencidas = new FaturaDAO().buscarFaturasVencidas();
		
		faturasVencidas.forEach(f -> {
			enviadorEmail.enviar(f.getEmailDevedor(), f.resumo());
			f.setNotificacaoEnviada(true);
		});
	}
}
