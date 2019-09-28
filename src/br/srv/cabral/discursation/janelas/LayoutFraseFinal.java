/**
 * 
 */
package br.srv.cabral.discursation.janelas;

import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import br.srv.cabral.discursation.R;

/**
 * Classe que configura o layout da janela: Sobre.
 * 
 * @author Sergio Cabral (sergio@cabral.srv.br)
 */
public class LayoutFraseFinal extends LayoutDeJanela {

	public Integer getResourceMenuId() {
		return 0;
	}

	/**
	 * Disparado quando um item de menu é acionado.
	 */
	public boolean onOptionsItemSelected(MenuItem item) {
		return false;
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
		return R.layout.frase_final;
	}

	@Override
	protected void ConfigurarControles() {
		((TextView) JanelaBase.findViewById(R.id.lblFrase)).setText(JanelaBase
				.getIntent().getExtras().getString("frase"));

		((Button) JanelaBase.findViewById(R.id.btnVoltar))
				.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						JanelaBase.finish();
					}
				});

	}

	@Override
	public void AoExibir() {
		return;
	}

}
