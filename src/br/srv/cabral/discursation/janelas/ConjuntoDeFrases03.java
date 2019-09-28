package br.srv.cabral.discursation.janelas;

import android.app.Activity;

public class ConjuntoDeFrases03 extends ConjuntoDeFrases {

	/**
	 * Construtor.
	 * 
	 * @param janela
	 *            Janela ativa.
	 */
	public ConjuntoDeFrases03(Activity janela) {
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
			return "nos obriga à análise";
		case 2:
			return "cumpre um papel essencial na formulação";
		case 3:
			return "auxilia a preparação e a estruturação";
		case 4:
			return "contribui para a correta determinação";
		case 5:
			return "assume importantes posições na definição";
		case 6:
			return "facilita a definição";
		case 7:
			return "prejudica a percepção da importância";
		case 8:
			return "oferece uma boa oportunidade de verificação";
		case 9:
			return "acarreta um processo de reformulação";
		case 10:
			return "exige precisão e definição";
		default:
			return "";
		}		
	}

}
