/**
 * 
 */
package br.srv.cabral.discursation.suporte;

import java.io.File;
import java.io.IOException;

/**
 * Disponibiliza fun��es relacionadas a entrada e sa�da (I/O)
 * 
 * @author Sergio Cabral (sergio@cabral.srv.br)
 */
public class IO {
	/**
	 * Verifica se um caminho � acess�vel para grava��o de dados.
	 * 
	 * @param caminho
	 * @return
	 */
	public static boolean CaminhoPermiteGravacao(String caminho) {
		if (caminho != "") {
			File file = new File((caminho + "/test.tmp").replace("//", "/"));
			try {
				file.getParentFile().mkdirs();
				file.createNewFile();
				if (!file.exists()) {
					return false;
				} else {
					file.delete();
				}
			} catch (IOException e) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Retorna o caminho do sistema onde s�o salvos os dados do aplicativo.
	 */
	public static String CaminhoData() {
		return (Constantes.Contexto.getFilesDir().getParent() + "/").replace(
				"//", "/");
	}

	/**
	 * Retorna o caminho do sistema onde s�o salvos os databases do aplicativo.
	 */
	public static String CaminhoDatabases() {
		return CaminhoData() + "databases/";
	}

	/**
	 * Verifica se um nome de arquivo � v�lido.
	 */
	public static boolean NomeDeArquivoEValido(String nome) {
		if (nome.trim().length() == 0 || nome.contains("\\")) {
			return false;
		}
		try {
			File temp = File.createTempFile("_tmp", nome, new File(
					CaminhoData()));
			temp.delete();
			return true;
		} catch (IOException e) {
			return false;
		}
	}

}
