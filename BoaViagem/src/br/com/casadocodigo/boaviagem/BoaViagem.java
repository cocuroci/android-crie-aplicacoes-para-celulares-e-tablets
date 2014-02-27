package br.com.casadocodigo.boaviagem;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class BoaViagem extends Activity {

	private static final String MANTER_CONECTADO = "manter_conectado";
	private EditText usuario;
	private EditText senha;
	private CheckBox manterConectado;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		
		this.usuario = (EditText) findViewById(R.id.usuario);
		this.senha = (EditText) findViewById(R.id.senha);
		this.manterConectado = (CheckBox) findViewById(R.id.manterConectado);
		
		SharedPreferences preferencias = getSharedPreferences("BOA", Context.MODE_PRIVATE);
		boolean conectado = preferencias.getBoolean(MANTER_CONECTADO, false);
		
		if (conectado) {
			Log.e("BoaViagem Home", ""+ conectado);
			startActivity(new Intent(this, DashboardActivity.class));
		}
	}

	public void entrarOnClick(View view) {
		String usuarioInformado = this.usuario.getText().toString();
		String senhaInformada = this.senha.getText().toString();
		
		if ("leitor".equals(usuarioInformado) && "123".equals(senhaInformada)) {
			
			SharedPreferences preferencias = getSharedPreferences("BOA", MODE_PRIVATE);
			
			Editor editor = preferencias.edit();
			editor.putBoolean(MANTER_CONECTADO, manterConectado.isChecked());
			editor.commit();
			
			startActivity(new Intent(this, DashboardActivity.class));
		} else {
			String mensagemErro = getString(R.string.erro_autenticacao);
			Toast toast = Toast.makeText(this, mensagemErro, Toast.LENGTH_SHORT);
			toast.show();
		}
	}

}
