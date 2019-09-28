/**
 * 
 */
package br.srv.cabral.discursation.suporte;

import java.io.File;

import br.srv.cabral.discursation.R;
import br.srv.cabral.discursation.janelas.JanelaGenerica;
import br.srv.cabral.discursation.persistencia.PreferenciasSalvasEmSQLite;
import br.srv.cabral.discursation.persistencia.PreferenciasSalvasNoSistema;

/**
 * Gerencia as prefer�ncias do aplicativo.
 * 
 * @author Sergio Cabral (sergio@cabral.srv.br)
 */
public class Preferencias {

	/**
	 * Construtor. 
	 */
	public Preferencias(JanelaGenerica janelaBase) {
		JanelaBase = janelaBase;
		PreferenciasVolatil = new PreferenciasSalvasNoSistema(JanelaBase,
				Constantes.DEFINICAO_NO_SISTEMA);
		PreferenciasFixa = new PreferenciasSalvasEmSQLite(JanelaBase,
				Constantes.DEFINICAO_EM_ARQUIVO);
	}

	/**
	 * Janela base.
	 */
	protected JanelaGenerica JanelaBase;

	/**
	 * Prefer�ncias do usu�rio armazenadas no sistema operacional.
	 */
	protected IPreferencias PreferenciasVolatil;

	/**
	 * Prefer�ncias do usu�rio armazenadas em arquivo.
	 */
	protected IPreferencias PreferenciasFixa;

	/**
	 * Limpa todas as prefer�ncias do aplicativo.
	 */
	public void Limpar() {
		PreferenciasFixa.LimparTodas();
		PreferenciasVolatil.LimparTodas();
	}

	/**
	 * Nome para prefer�ncia do aplicativo: IgnorarJanelaSobreAoIniciar
	 */
	private static final String IgnorarJanelaSobreAoIniciar = "IgnorarJanelaSobreAoIniciar";

	/**
	 * Indica se a janela Sobre (tela de boas vindas) deve ser ignorada ao
	 * iniciar o sistema.
	 * 
	 * @return boolean
	 */
	public boolean getIgnorarJanelaSobreAoIniciar() {
		IPreferencias preferencias = PreferenciasVolatil;
		return preferencias.Ler(IgnorarJanelaSobreAoIniciar, true);
	}

	/**
	 * Indica se a janela Sobre (tela de boas vindas) deve ser ignorada ao
	 * iniciar o sistema.
	 */
	public void setIgnorarJanelaSobreAoIniciar(boolean valor) {
		IPreferencias preferencias = PreferenciasVolatil;
		preferencias.Salvar(IgnorarJanelaSobreAoIniciar, valor);
	}

	/**
	 * Nome para prefer�ncia do aplicativo: VersaoSequencialDoAplicativo
	 */
	private static final String VersaoSequencialDoAplicativo = "VersaoSequencialDoAplicativo";

	/**
	 * Indica a vers�o sequencial do aplicativo.
	 * 
	 * @return int
	 */
	public int getVersaoSequencialDoAplicativo() {
		IPreferencias preferencias = PreferenciasVolatil;
		return preferencias.Ler(VersaoSequencialDoAplicativo, 0);
	}

	/**
	 * Indica a vers�o sequencial do aplicativo.
	 */
	public void setVersaoSequencialDoAplicativo(int valor) {
		IPreferencias preferencias = PreferenciasVolatil;
		preferencias.Salvar(VersaoSequencialDoAplicativo, valor);
	}

	/**
	 * Nome para prefer�ncia do aplicativo: CaminhoDosDadosEConfiguracao
	 */
	private static final String CaminhoDosDadosEConfiguracao = "CaminhoDosDadosEConfiguracao";

	/**
	 * Indica o caminho onde s�o gravados os dados e configura��es. Somente
	 * retorna um valor se houver permiss�o deescrita. Caso contr�rio dispara
	 * uma exce��o. Mesmo para o caminho do sistema retorna o endere�o correto.
	 * 
	 * @return String
	 * @throws Exception
	 */
	public String getCaminhoDosDadosEConfiguracaoReal() throws Exception {
		String caminho = getCaminhoDosDadosEConfiguracao();
		if (caminho == null || caminho == "") {
			caminho = IO.CaminhoDatabases();
		}
		if (!IO.CaminhoPermiteGravacao(caminho)) {
			String mensagem = JanelaBase.getResources().getString(
					R.string.erro_CaminhoDosDadosEConfiguracaoNaoEstaAcessivel);
			throw new Exception(String.format(mensagem, caminho));
		}
		return (caminho + "/").replace("//", "/");
	}

	/**
	 * Indica o caminho onde s�o gravados os dados e configura��es.
	 * 
	 * @return String
	 */
	public String getCaminhoDosDadosEConfiguracao() {
		IPreferencias preferencias = PreferenciasVolatil;
		return preferencias.Ler(CaminhoDosDadosEConfiguracao, "");
	}

	/**
	 * Indica o caminho onde s�o gravados os dados e configura��es.
	 */
	public void setCaminhoDosDadosEConfiguracao(String valor) {
		if (valor != "") {
			File file = new File((valor + "/").replace("//", "/"));
			try {
				file.mkdirs();
				if (!file.exists()) {
					throw new Exception();
				}
				valor = (file.getAbsolutePath() + "/").replace("//", "/");
			} catch (Exception e) {
				valor = "";
			}
		}

		IPreferencias preferencias = PreferenciasVolatil;
		preferencias.Salvar(CaminhoDosDadosEConfiguracao, valor);
	}

	/**
	 * Nome para prefer�ncia do aplicativo: PerfilSelecionado
	 */
	private static final String PerfilSelecionado = "PerfilSelecionado";

	/**
	 * Indica se a janela Sobre (tela de boas vindas) deve ser ignorada ao
	 * iniciar o sistema.
	 * 
	 * @return boolean
	 */
	public String getPerfilSelecionado() {
		IPreferencias preferencias = PreferenciasVolatil;
		return preferencias.Ler(PerfilSelecionado, "");
	}

	/**
	 * Indica se a janela Sobre (tela de boas vindas) deve ser ignorada ao
	 * iniciar o sistema.
	 */
	public void setPerfilSelecionado(String valor) {
		IPreferencias preferencias = PreferenciasVolatil;
		preferencias.Salvar(PerfilSelecionado, valor);
	}
}
