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
			return "das nossas op��es de desenvolvimento futuro.";
		case 2:
			return "das nossas metas financeiras e administrativas.";
		case 3:
			return "das atitudes e das atribui��es da diretoria.";
		case 4:
			return "das novas proposi��es.";
		case 5:
			return "das op��es b�sicas para o sucesso do programa.";
		case 6:
			return "do nosso sistema de forma��o de quadros.";
		case 7:
			return "das condi��es apropriadas para os neg�cios.";
		case 8:
			return "dos �ndices pretendidos.";
		case 9:
			return "das formas de a��o.";
		case 10:
			return "dos conceitos de participa��o geral.";
		default:
			return "";
		}		
	}

}
