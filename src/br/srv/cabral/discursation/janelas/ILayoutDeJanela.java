/**
 * 
 */
package br.srv.cabral.discursation.janelas;

import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.View;

/**
 * Interface para classes capazes de configurar um layout de uma janela.
 * 
 * @author Sergio Cabral (sergio@cabral.srv.br) *
 */
public interface ILayoutDeJanela {
	
	/**
	 * Retorna o Id do recurso do menu.
	 * 
	 * @return Id do recurso. Retorna 0 se n�o existir menu.
	 */
	Integer getResourceMenuId();

	/**
	 * Disparado quando um item de menu � acionado.
	 */
	boolean onOptionsItemSelected(MenuItem item);

	/**
	 * Disparado quando um item de menu de conexto � acionado.
	 */
	boolean onContextItemSelected(MenuItem item);

	/**
	 * Disparado quando � necess�rio criar um menu de contexto.
	 * 
	 */
	void onCreateContextMenu(ContextMenu menu, View view,
			ContextMenuInfo menuInfo);

	/**
	 * Configura os controles do layout.
	 * 
	 * @param janelaBase
	 */
	void Configurar(JanelaGenerica janelaBase);

	/**
	 * Disparado quando a janela � exibida.
	 */
	void AoExibir();

	/**
	 * Adiciona um listener de evento.
	 * 
	 * @param listener
	 */
	void addListener(ILayoutDeJanelaListener listener);

	/**
	 * Remove um listener de evento.
	 * 
	 * @param listener
	 */
	void removeListener(ILayoutDeJanelaListener listener);
}
