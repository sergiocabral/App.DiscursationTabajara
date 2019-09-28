/**
 * 
 */
package br.srv.cabral.discursation.persistencia;

import java.util.List;
import java.util.Map;

import android.database.sqlite.SQLiteDatabase;

/**
 * Interface para classe que representa as configura��es de uma tabela do banco
 * de dados. Permite configurar (criar, alterar, etc) a tabela no banco de
 * dados.
 * 
 * @author Sergio Cabral (sergio@cabral.srv.br)
 */
public interface ITabelaDeBancoDeDados {
	/**
	 * Obtem o nome da tabela.
	 * 
	 * @return String
	 */
	String getNomeDaTabela();

	/**
	 * Cole��o dos nomes dos campos e suas respectivas defini��es.
	 * 
	 * @return Dicion�rio de dados.
	 */
	Map<String, String> getCampos();

	/**
	 * Lista com os nomes dos campos. 
	 * @return Lista
	 */
	List<String> getNomeDosCampos();
	
	/**
	 * Disparado quando o banco de dados � criado (fisicamente falando) pela
	 * primeira vez.
	 */
	void onCreate(SQLiteDatabase db);

	/**
	 * Disparado quando o banco de dados precisa ser atualizado (fisicamente
	 * falando) pela primeira vez.
	 */
	void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion);
}
