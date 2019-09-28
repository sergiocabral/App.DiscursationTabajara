/**
 * 
 */
package br.srv.cabral.discursation.janelas;

/**
 * Interface para classe que implementa as se��es de configura��o da tela
 * LayoutConfiguracoes.
 * 
 * @author Sergio Cabral (sergio@cabral.srv.br)
 */
public interface ILayoutConfiguracoes_Secao {

	/**
	 * Configura os controles da se��o.
	 */
	void ConfigurarControles();

	/**
	 * Verifica se os campos est�o preenchidos corretamente.
	 * 
	 * @return boolean. Se retorna false exibe automaticamente a mensagem de
	 *         erro.
	 */
	boolean CamposPreenchidosCorretamente();

	/**
	 * Grava as configura��es na tela.
	 */
	void GravarConfiguracoes();
}
