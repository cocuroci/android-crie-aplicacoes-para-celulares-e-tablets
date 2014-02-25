package br.com.casadocodigo.boaviagem;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class DashboardActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dashboard);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.dashboard, menu);
		return true;
	}
	
	public void selecionarOpcao(View view) {
		TextView textView = (TextView) view;
		String opcao = "Opção: " + textView.getText().toString();
		Toast.makeText(this, opcao, Toast.LENGTH_SHORT).show();
	}

}
