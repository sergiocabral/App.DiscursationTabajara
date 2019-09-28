/**
 * 
 */
package br.srv.cabral.discursation.suporte;

/**
 * Interface para classe que armazena e manipula defini��es de prefer�ncias do
 * usu�rio ou do aplicativo.
 * 
 * @author Sergio Cabral (sergio@cabral.srv.br)
 */
public interface IPreferencias {

	/**
	 * Limpar todas as defini��es.
	 */
	void LimparTodas();
	
	/**
	 * Verifica se uma defini��o existe.
	 * 
	 * @param nome
	 *            Nome da defini��o.
	 * @return boolean.
	 */
	boolean Existe(String nome);

	/**
	 * L� um valor tipo: String
	 * 
	 * @param nome
	 *            Nome da defini��o.
	 * @param valorPadrao
	 *            Valor padr�o caso n�o exista definido ainda.
	 * @return Valor da defini��o.
	 */
	String Ler(String nome, String valorPadrao);

	/**
	 * Salva um valor tipo: String
	 * 
	 * @param nome
	 *            Nome da defini��o.
	 * @param valor
	 *            Valor da defini��o.
	 */
	void Salvar(String nome, String valor);

	/**
	 * L� um valor tipo: int
	 * 
	 * @param nome
	 *            Nome da defini��o.
	 * @param valorPadrao
	 *            Valor padr�o caso n�o exista definido ainda.
	 * @return Valor da defini��o.
	 */
	int Ler(String nome, int valorPadrao);

	/**
	 * Salva um valor tipo: int
	 * 
	 * @param nome
	 *            Nome da defini��o.
	 * @param valor
	 *            Valor da defini��o.
	 */
	void Salvar(String nome, int valor);

	/**
	 * L� um valor tipo: float
	 * 
	 * @param nome
	 *            Nome da defini��o.
	 * @param valorPadrao
	 *            Valor padr�o caso n�o exista definido ainda.
	 * @return Valor da defini��o.
	 */
	float Ler(String nome, float valorPadrao);

	/**
	 * Salva um valor tipo: int
	 * 
	 * @param nome
	 *            Nome da defini��o.
	 * @param valor
	 *            Valor da defini��o.
	 */
	void Salvar(String nome, float valor);

	/**
	 * L� um valor tipo: boolean
	 * 
	 * @param nome
	 *            Nome da defini��o.
	 * @param valorPadrao
	 *            Valor padr�o caso n�o exista definido ainda.
	 * @return Valor da defini��o.
	 */
	boolean Ler(String nome, boolean valorPadrao);

	/**
	 * Salva um valor tipo: boolean
	 * 
	 * @param nome
	 *            Nome da defini��o.
	 * @param valor
	 *            Valor da defini��o.
	 */
	void Salvar(String nome, boolean valor);

}
