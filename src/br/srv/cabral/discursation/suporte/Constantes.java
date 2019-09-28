/**
 * 
 */
package br.srv.cabral.discursation.suporte;

import android.content.Context;

/**
 * Constantes para uso geral.
 * 
 * @author Sergio Cabral (sergio@cabral.srv.br)
 */
public final class Constantes {
	/**
	 * Contexto que será utilizado como base para o aplicativo.
	 */
	public static Context Contexto;

	/**
	 * Número nominal da versão do aplicativo.
	 */
	public static final int VERSAO_NOMINAL = 1;

	/**
	 * Número sequencial da versão do aplicativo. Cada nova versão deve
	 * incrementar 1 no valor desta constante.
	 */
	public static final int VERSAO_SEQUENCIAL = 1;

	/**
	 * Nome identificador do sistema.
	 */
	public static final String NOME_IDENTIFICADOR_DO_SISTEMA = "Discursation";

	/**
	 * Nome do arquivo que armazena o banco de dados.
	 */
	public static final String DEFINICAO_EM_ARQUIVO = "frases.db";

	/**
	 * Nome do conjunto de preferência do aplicativo armazenadas no sistema
	 * operacional.
	 */
	public static final String DEFINICAO_NO_SISTEMA = "discursation";

	/**
	 * Nome da informação extra passado para o Intent para que um layout seja
	 * aplicado na abertura de uma janela.
	 */
	public static final String INTENT_MSG_LAYOUT = "INTENT_MSG_LAYOUT";

	/**
	 * Nome da informação extra passado para o Intent para que o layout de Erro
	 * exiba a mensagem do erro ocorrido.
	 */
	public static final String INTENT_MSG_ERRO = "INTENT_MSG_ERRO";
}
