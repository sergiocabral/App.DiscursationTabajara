package br.srv.cabral.discursation.janelas;

import android.app.Activity;

public class ConjuntoDeFrases01 extends ConjuntoDeFrases {

	/**
	 * Construtor.
	 * 
	 * @param janela
	 *            Janela ativa.
	 */
	public ConjuntoDeFrases01(Activity janela) {
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
			return "Caros colegas,";
		case 2:
			return "Por outro lado,";
		case 3:
			return "N�o podemos esquecer que";
		case 4:
			return "Do mesmo modo,";
		case 5:
			return "A pr�tica mostra que";
		case 6:
			return "Nunca � demais insistir que";
		case 7:
			return "A experi�ncia mostra que";
		case 8:
			return "� fundamental ressaltar que";
		case 9:
			return "O incentivo ao avan�o tecnol�gico, assim como";
		case 10:
			return "Assim mesmo,";
		default:
			return "";
		}		
	}

}
