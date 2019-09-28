package br.srv.cabral.discursation.janelas;

import android.app.Activity;

public class ConjuntoDeFrases02 extends ConjuntoDeFrases {

	/**
	 * Construtor.
	 * 
	 * @param janela
	 *            Janela ativa.
	 */
	public ConjuntoDeFrases02(Activity janela) {
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
			return "a execu��o deste projeto";
		case 2:
			return "a complexidade dos estudos efetuados";
		case 3:
			return "a atual estrutura de organiza��o";
		case 4:
			return "o novo modelo estrutural aqui preconizado";
		case 5:
			return "o desenvolvimento de formas distintas de atua��o";
		case 6:
			return "a constante divulga��o das informa��es";
		case 7:
			return "a consolida��o das estruturas";
		case 8:
			return "a an�lise dos diversos resultados";
		case 9:
			return "o in�cio do programa de forma��o de atitudes";
		case 10:
			return "a expans�o de nossa atividade";
		default:
			return "";
		}		
	}

}
