/**
 * 
 */
package br.srv.cabral.discursation.janelas;

import java.util.EventObject;

/**
 * Eventos para um layout de janela
 * 
 * @author Sergio Cabral (sergio@cabral.srv.br)
 */
public class LayoutDeJanelaEvento extends EventObject {

	/**
	 * Id para classe serializ�vel.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Construtor
	 * 
	 * @param source
	 *            Originador do evento.
	 */
	public LayoutDeJanelaEvento(LayoutDeJanela janela) {
		super(janela);
	}
}
