/**
 * 
 */
package br.srv.cabral.discursation.janelas;

import java.util.HashMap;
import java.util.Map;

import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import br.srv.cabral.discursation.R;
import br.srv.cabral.discursation.suporte.Constantes;

/**
 * Classe que configura o layout da janela: Sobre.
 * 
 * @author Sergio Cabral (sergio@cabral.srv.br) *
 */
public class LayoutFrase extends LayoutDeJanela {

	/**
	 * Índice do conjunto de frases. Indica qual parte da frase está sendo
	 * selecionada.
	 */
	private static int conjuntoDeFrases = 0;

	private static String[] frases = new String[4];

	public Integer getResourceMenuId() {
		return R.menu.principal;
	}

	/**
	 * Disparado quando um item de menu é acionado.
	 */
	public boolean onOptionsItemSelected(MenuItem item) {
		return ExecutarAcaoDoMenu(item.getItemId());
	}

	/**
	 * Executa a ação de um menu
	 * 
	 * @param menuResId
	 *            Id do recurso do menu.
	 * @return
	 */
	public Boolean ExecutarAcaoDoMenu(int menuResId) {
		switch (menuResId) {
		case R.id.menuPrincipalSobre:
			JanelaBase.ExibirLayout(LayoutSobre.class, true);
			return true;
		case R.id.menuPrincipalSair:
			JanelaBase.finish();
			return true;
		default:
			return false;
		}
	}

	public boolean onContextItemSelected(MenuItem item) {
		return false;
	}

	public void onCreateContextMenu(ContextMenu menu, View view,
			ContextMenuInfo menuInfo) {
		return;
	}

	@Override
	protected int getLayoutResourceId() {
		return R.layout.frase;
	}

	@Override
	protected void ConfigurarControles() {
		JanelaBase.Preferencias
				.setVersaoSequencialDoAplicativo(Constantes.VERSAO_SEQUENCIAL);

		OnClickListener onClickListener = new OnClickListener() {
			@Override
			public void onClick(View v) {
				frases[conjuntoDeFrases - 1] = ((Button) v).getText()
						.toString();
				ConfigurarFrases(++conjuntoDeFrases);
			}
		};

		((Button) JanelaBase.findViewById(R.id.btnVoltar))
				.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						ConfigurarFrases(--conjuntoDeFrases);
					}
				});

		((Button) JanelaBase.findViewById(R.id.btnFrase01))
				.setOnClickListener(onClickListener);
		((Button) JanelaBase.findViewById(R.id.btnFrase02))
				.setOnClickListener(onClickListener);
		((Button) JanelaBase.findViewById(R.id.btnFrase03))
				.setOnClickListener(onClickListener);
		((Button) JanelaBase.findViewById(R.id.btnFrase04))
				.setOnClickListener(onClickListener);
		((Button) JanelaBase.findViewById(R.id.btnFrase05))
				.setOnClickListener(onClickListener);
		((Button) JanelaBase.findViewById(R.id.btnFrase06))
				.setOnClickListener(onClickListener);
		((Button) JanelaBase.findViewById(R.id.btnFrase07))
				.setOnClickListener(onClickListener);
		((Button) JanelaBase.findViewById(R.id.btnFrase08))
				.setOnClickListener(onClickListener);
		((Button) JanelaBase.findViewById(R.id.btnFrase09))
				.setOnClickListener(onClickListener);
		((Button) JanelaBase.findViewById(R.id.btnFrase10))
				.setOnClickListener(onClickListener);
		
		AoExibir();
	}

	/**
	 * Configura os controles para a exibição de frases conforme o índice
	 * informado.
	 */
	private void ConfigurarFrases(int indice) {
		String frase = ObterFrase(indice);
		switch (indice) {
		case 1:
			(new ConjuntoDeFrases01(this.JanelaBase)).ConfigurarFrases();
			break;
		case 2:
			(new ConjuntoDeFrases02(this.JanelaBase)).ConfigurarFrases();
			break;
		case 3:
			(new ConjuntoDeFrases03(this.JanelaBase)).ConfigurarFrases();
			break;
		case 4:
			(new ConjuntoDeFrases04(this.JanelaBase)).ConfigurarFrases();
			break;
		default:
			conjuntoDeFrases = 0;
			Map<String, String> mensagens = new HashMap<String, String>();
			mensagens.put("frase", frase);
			JanelaBase.ExibirLayout(LayoutFraseFinal.class, true, mensagens);
			return;
		}
		int exibirBtnVoltar = indice == 1 ? View.GONE : View.VISIBLE;
		((Button) JanelaBase.findViewById(R.id.btnVoltar))
				.setVisibility(exibirBtnVoltar);
		((TextView) JanelaBase.findViewById(R.id.lblFrase))
				.setVisibility(exibirBtnVoltar);
		((TextView) JanelaBase.findViewById(R.id.lblSelecione)).setText(String
				.format(JanelaBase.getResources().getString(
						R.string.layoutPrincipal_lblSelecione), indice));
		((TextView) JanelaBase.findViewById(R.id.lblFrase)).setText(frase);
	}

	/**
	 * Monta e retorna a frase até o índice especificada.
	 */
	private String ObterFrase(int indice) {
		StringBuilder frase = new StringBuilder();
		for (int i = 1; i < indice; i++) {
			frase.append(frases[i - 1] + " ");
		}
		return frase.toString().trim();
	}

	@Override
	public void AoExibir() {
		if (conjuntoDeFrases == 0) {
			conjuntoDeFrases = 1;
		}
		ConfigurarFrases(conjuntoDeFrases);
	}
}
