package br.com.casadocodigo.helloandroid;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.text.Editable;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	private EditText nomeEditText;
	//private TextView saudacaoTextView;
	//private String saudacao; 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		this.nomeEditText = (EditText)findViewById(R.id.nomeEditText);
		//this.saudacaoTextView = (TextView)findViewById(R.id.saudacaoTextView);
		//this.saudacao = getResources().getString(R.string.saudacao);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void surpreenderUsuario(View view) {
		String texto = this.nomeEditText.getText().toString();
		//String msg = this.saudacao + " " + texto;
		//this.saudacaoTextView.setText(msg);
		
		Intent intent = new Intent(SaudacaoActivity.ACAO_EXIBIR_SAUDACAO);
		intent.addCategory(SaudacaoActivity.CATEGORIA_SAUDACAO);
		intent.putExtra(SaudacaoActivity.EXTRA_NOME_USUARIO, texto);
		startActivity(intent);		
	}
}
