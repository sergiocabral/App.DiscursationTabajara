package br.srv.cabral.discursation.janelas;

import android.app.Activity;
import android.widget.Button;
import br.srv.cabral.discursation.R;

/**
 * 
 * Representa e gerencia um grupo de frases.
 * 
 * @author Sergio Cabral (sergio@cabral.srv.br)
 */
public abstract class ConjuntoDeFrases {

	/**
	 * Retorna a janela ativa.
	 */
	protected abstract Activity getJanela();

	/**
	 * Retorna a frase para um índice específico.
	 */
	protected abstract String getFrase(int indiceDaFrase);

	public void ConfigurarFrases() {
		((Button) getJanela().findViewById(R.id.btnFrase01))
				.setText(getFrase(1));
		((Button) getJanela().findViewById(R.id.btnFrase02))
				.setText(getFrase(2));
		((Button) getJanela().findViewById(R.id.btnFrase03))
				.setText(getFrase(3));
		((Button) getJanela().findViewById(R.id.btnFrase04))
				.setText(getFrase(4));
		((Button) getJanela().findViewById(R.id.btnFrase05))
				.setText(getFrase(5));
		((Button) getJanela().findViewById(R.id.btnFrase06))
				.setText(getFrase(6));
		((Button) getJanela().findViewById(R.id.btnFrase07))
				.setText(getFrase(7));
		((Button) getJanela().findViewById(R.id.btnFrase08))
				.setText(getFrase(8));
		((Button) getJanela().findViewById(R.id.btnFrase09))
				.setText(getFrase(9));
		((Button) getJanela().findViewById(R.id.btnFrase10))
				.setText(getFrase(10));
	}
}
