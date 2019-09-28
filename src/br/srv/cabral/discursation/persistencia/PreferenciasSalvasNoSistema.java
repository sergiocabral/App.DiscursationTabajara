/**
 * 
 */
package br.srv.cabral.discursation.persistencia;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import br.srv.cabral.discursation.suporte.IPreferencias;

/**
 * Armazena e manipula defini��es de prefer�ncias do usu�rio ou do aplicativo.
 * salvas no pr�prio sistema operacional.
 * 
 * @author Sergio Cabral (sergio@cabral.srv.br)
 */
public class PreferenciasSalvasNoSistema implements IPreferencias {

	/**
	 * Construtor
	 * 
	 * @param contexto
	 *            Contexto do aplicativo.
	 * @param identificador
	 *            Nome que identifica o conjunto das prefer�ncias garenciadas
	 *            pela inst�ncia desta classe.
	 */
	public PreferenciasSalvasNoSistema(Context contexto, String identificador) {
		Contexto = contexto;
		SharedPreferences = Contexto.getSharedPreferences(identificador,
				Context.MODE_PRIVATE);
	}

	/**
	 * Contexto do aplicativo.
	 */
	protected Context Contexto;

	/**
	 * Prefer�ncias compartilhadas
	 */
	protected SharedPreferences SharedPreferences;

	public void LimparTodas() {
		Editor edicao = SharedPreferences.edit();
		edicao.clear();
		edicao.commit();
	}
	
	public boolean Existe(String nome) {
		return SharedPreferences.contains(nome);
	}

	public String Ler(String nome, String valorPadrao) {
		return SharedPreferences.getString(nome, valorPadrao);
	}

	public void Salvar(String nome, String valor) {
		Editor edicao = SharedPreferences.edit();
		edicao.putString(nome, valor);
		edicao.commit();
	}

	public int Ler(String nome, int valorPadrao) {
		return SharedPreferences.getInt(nome, valorPadrao);
	}

	public void Salvar(String nome, int valor) {
		Editor edicao = SharedPreferences.edit();
		edicao.putInt(nome, valor);
		edicao.commit();
	}

	public float Ler(String nome, float valorPadrao) {
		return SharedPreferences.getFloat(nome, valorPadrao);
	}

	public void Salvar(String nome, float valor) {
		Editor edicao = SharedPreferences.edit();
		edicao.putFloat(nome, valor);
		edicao.commit();
	}

	public boolean Ler(String nome, boolean valorPadrao) {
		return SharedPreferences.getBoolean(nome, valorPadrao);
	}

	public void Salvar(String nome, boolean valor) {
		Editor edicao = SharedPreferences.edit();
		edicao.putBoolean(nome, valor);
		edicao.commit();
	}

}
