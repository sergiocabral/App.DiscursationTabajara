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
			return "a execução deste projeto";
		case 2:
			return "a complexidade dos estudos efetuados";
		case 3:
			return "a atual estrutura de organização";
		case 4:
			return "o novo modelo estrutural aqui preconizado";
		case 5:
			return "o desenvolvimento de formas distintas de atuação";
		case 6:
			return "a constante divulgação das informações";
		case 7:
			return "a consolidação das estruturas";
		case 8:
			return "a análise dos diversos resultados";
		case 9:
			return "o início do programa de formação de atitudes";
		case 10:
			return "a expansão de nossa atividade";
		default:
			return "";
		}		
	}

}
