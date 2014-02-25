package br.com.casadocodigo.helloandroid;

import android.os.Bundle;
import android.app.Activity;
import android.text.Editable;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	private EditText nomeEditText;
	private TextView saudacaoTextView;
	private String saudacao; 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		this.nomeEditText = (EditText)findViewById(R.id.nomeEditText);
		this.saudacaoTextView = (TextView)findViewById(R.id.saudacaoTextView);
		this.saudacao = getResources().getString(R.string.saudacao);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void surpreenderUsuario(View view) {
		Editable texto = this.nomeEditText.getText();
		String msg = this.saudacao + " " + texto;
		this.saudacaoTextView.setText(msg);
	}

}
