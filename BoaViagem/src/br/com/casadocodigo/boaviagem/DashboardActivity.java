package br.com.casadocodigo.boaviagem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

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
	
	@Override
	public boolean onMenuItemSelected(int featuredId, MenuItem item) {
		finish();
		return false;
	}
	
	public void selecionarOpcao(View view) {		
		switch (view.getId()) {
			case R.id.nova_viagem:
				startActivity(new Intent(this, ViagemActivity.class));
				break;
			case R.id.novo_gasto:
				startActivity(new Intent(this, GastoActivity.class));
				break;
			case R.id.minhas_viagens:
				startActivity(new Intent(this, ViagemListActivity.class));
				break;
		}
		
	}
}
