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
			return "Não podemos esquecer que";
		case 4:
			return "Do mesmo modo,";
		case 5:
			return "A prática mostra que";
		case 6:
			return "Nunca é demais insistir que";
		case 7:
			return "A experiência mostra que";
		case 8:
			return "É fundamental ressaltar que";
		case 9:
			return "O incentivo ao avanço tecnológico, assim como";
		case 10:
			return "Assim mesmo,";
		default:
			return "";
		}		
	}

}
