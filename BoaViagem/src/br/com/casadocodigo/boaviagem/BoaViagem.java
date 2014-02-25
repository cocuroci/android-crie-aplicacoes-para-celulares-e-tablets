package br.com.casadocodigo.boaviagem;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class BoaViagem extends Activity {

	private EditText usuario;
	private EditText senha;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		
		this.usuario = (EditText) findViewById(R.id.usuario);
		this.senha = (EditText) findViewById(R.id.senha);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.boa_viagem, menu);
		return true;
	}

	public void entrarOnClick(View view) {
		String usuarioInformado = this.usuario.getText().toString();
		String senhaInformada = this.senha.getText().toString();
		
		if ("leitor".equals(usuarioInformado) && "123".equals(senhaInformada)) {
			startActivity(new Intent(this, DashboardActivity.class));
		} else {
			String mensagemErro = getString(R.string.erro_autenticacao);
			Toast toast = Toast.makeText(this, mensagemErro, Toast.LENGTH_SHORT);
			toast.show();
		}
	}

}
