package br.srv.cabral.discursation.janelas;

import android.app.Activity;

public class ConjuntoDeFrases04 extends ConjuntoDeFrases {

	/**
	 * Construtor.
	 * 
	 * @param janela
	 *            Janela ativa.
	 */
	public ConjuntoDeFrases04(Activity janela) {
		Janela = janela;
	}

	private Activity Janela;

	@Override
	protected Activity getJanela() {
		return Janela;
	}

	@Override
	protected String getFrase(int indiceDaFrase) {
		switch (indiceDaFrase) {
		case 1:
			return "das nossas opções de desenvolvimento futuro.";
		case 2:
			return "das nossas metas financeiras e administrativas.";
		case 3:
			return "das atitudes e das atribuições da diretoria.";
		case 4:
			return "das novas proposições.";
		case 5:
			return "das opções básicas para o sucesso do programa.";
		case 6:
			return "do nosso sistema de formação de quadros.";
		case 7:
			return "das condições apropriadas para os negócios.";
		case 8:
			return "dos índices pretendidos.";
		case 9:
			return "das formas de ação.";
		case 10:
			return "dos conceitos de participação geral.";
		default:
			return "";
		}		
	}

}
