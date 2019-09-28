/**
 * 
 */
package br.srv.cabral.discursation.persistencia;

import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import br.srv.cabral.discursation.suporte.Constantes;
import br.srv.cabral.discursation.suporte.IPreferencias;

/**
 * Armazena e manipula definições de preferências do usuário ou do aplicativo
 * salvas em um arquivo de banco de dados SQLite.
 * 
 * @author Sergio Cabral (sergio@cabral.srv.br)
 */
public class PreferenciasSalvasEmSQLite extends SQLiteOpenHelper implements
		IPreferencias {

	/**
	 * Construtor
	 * 
	 * @param contexto
	 *            Contexto do aplicativo.
	 * @param nomeDoBancoDeDados
	 *            Nome do banco de dados do SQLite.
	 */
	public PreferenciasSalvasEmSQLite(Context contexto,
			String nomeDoBancoDeDados) {
		super(contexto, nomeDoBancoDeDados, null, Constantes.VERSAO_SEQUENCIAL);
		Contexto = contexto;
	}

	/**
	 * Contexto do aplicativo.
	 */
	protected Context Contexto;

	/**
	 * Configurações da tabela: Preferencias
	 */
	public TabelaPreferencias TbPreferencias = new TabelaPreferencias();

	public void LimparTodas() {
		SQLiteDatabase db = getWritableDatabase();
		db.execSQL(String.format("delete from %s", TbPreferencias.getNomeDaTabela()));
	}

	public boolean Existe(String nome) {
		SQLiteDatabase db = getReadableDatabase();
		Cursor cursor = db.rawQuery(String.format(
				"select count(*) from %s where %s=?", TbPreferencias
						.getNomeDaTabela(), TbPreferencias.getNomeDosCampos()
						.get(TabelaPreferencias.CAMPO_NOME)),
				new String[] { nome });
		cursor.moveToFirst();
		return cursor.getInt(0) > 0;
	}

	public String Ler(String nome, String valorPadrao) {
		SQLiteDatabase db = getReadableDatabase();
		List<String> campos = TbPreferencias.getNomeDosCampos();
		Cursor cursor = db.rawQuery(String.format(
				"select %s from %s where %s=?",
				campos.get(TabelaPreferencias.CAMPO_VALOR),
				TbPreferencias.getNomeDaTabela(),
				campos.get(TabelaPreferencias.CAMPO_NOME)),
				new String[] { nome });
		if (cursor.moveToFirst()) {
			return cursor.getString(0);
		} else {
			return valorPadrao;
		}
	}

	public void Salvar(String nome, String valor) {
		SQLiteDatabase db = getWritableDatabase();
		ContentValues valores = TbPreferencias.PreencherValores(
				new int[] { TabelaPreferencias.CAMPO_NOME,
						TabelaPreferencias.CAMPO_VALOR }, new Object[] { nome,
						valor });
		if (Existe(nome)
				|| db.insert(TbPreferencias.getNomeDaTabela(), null, valores) < 0) {
			db.update(TbPreferencias.getNomeDaTabela(), valores, TbPreferencias
					.getNomeDosCampos().get(TabelaPreferencias.CAMPO_NOME)
					+ "=?", new String[] { nome });
		}
	}

	public int Ler(String nome, int valorPadrao) {
		return Integer.parseInt(Ler(nome, new Integer(valorPadrao).toString()));
	}

	public void Salvar(String nome, int valor) {
		Salvar(nome, new Integer(valor).toString());
	}

	public float Ler(String nome, float valorPadrao) {
		return Float.parseFloat(Ler(nome, new Float(valorPadrao).toString()));
	}

	public void Salvar(String nome, float valor) {
		Salvar(nome, new Float(valor).toString());
	}

	public boolean Ler(String nome, boolean valorPadrao) {
		return Boolean.parseBoolean(Ler(nome,
				new Boolean(valorPadrao).toString()));
	}

	public void Salvar(String nome, boolean valor) {
		Salvar(nome, new Boolean(valor).toString());
	}

	/**
	 * Disparado quando o banco de dados é criado (fisicamente falando) pela
	 * primeira vez.
	 */
	@Override
	public void onCreate(SQLiteDatabase db) {
		TbPreferencias.onCreate(db);
	}

	/**
	 * Disparado quando o banco de dados precisa ser atualizado (fisicamente
	 * falando) pela primeira vez.
	 */
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		TbPreferencias.onUpgrade(db, oldVersion, newVersion);
	}

}
