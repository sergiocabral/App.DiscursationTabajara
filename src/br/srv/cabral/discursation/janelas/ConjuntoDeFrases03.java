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
			return "nos obriga � an�lise";
		case 2:
			return "cumpre um papel essencial na formula��o";
		case 3:
			return "auxilia a prepara��o e a estrutura��o";
		case 4:
			return "contribui para a correta determina��o";
		case 5:
			return "assume importantes posi��es na defini��o";
		case 6:
			return "facilita a defini��o";
		case 7:
			return "prejudica a percep��o da import�ncia";
		case 8:
			return "oferece uma boa oportunidade de verifica��o";
		case 9:
			return "acarreta um processo de reformula��o";
		case 10:
			return "exige precis�o e defini��o";
		default:
			return "";
		}		
	}

}
