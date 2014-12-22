package com.example.garutsmartcity;


import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends Activity implements OnClickListener {
	Button b1, b2, b3, b4, b5,b6,b7 ;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		b1 = (Button) findViewById(R.id.button1);
		b2 = (Button) findViewById(R.id.button2);
		b3 = (Button) findViewById(R.id.button3);
		b4 = (Button) findViewById(R.id.button4);
		b5 = (Button) findViewById(R.id.button5);
		b6 = (Button) findViewById(R.id.button6);
		b7 = (Button) findViewById(R.id.button7);
		

		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
		b3.setOnClickListener(this);
		b4.setOnClickListener(this);
		b5.setOnClickListener(this);
		b6.setOnClickListener(this);
		b7.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.button1:
			Intent a = new Intent(MainActivity.this, wisata.class);
			startActivity(a);
			break;
		case R.id.button2:
			Intent b = new Intent(MainActivity.this, pilih_oleh.class);
			startActivity(b);
			break;

		case R.id.button3:
			Intent c = new Intent(MainActivity.this, rumah_sakit.class);
			startActivity(c);
			break;
		case R.id.button4:
			Intent d = new Intent(MainActivity.this, polisi.class);
			startActivity(d);
			break;
		case R.id.button5:
			Intent e = new Intent(MainActivity.this, tentang.class);
			startActivity(e);
			break;
		case R.id.button7:
			Intent f = new Intent(MainActivity.this, bantuan.class);
			startActivity(f);
			break;
		case R.id.button6:
			ShowExitDialog();
			break;

		}
	}

	private void ShowExitDialog() {
		// TODO Auto-generated method stub
		AlertDialog.Builder ad = new AlertDialog.Builder(this);
		ad.setTitle("Warning");
		ad.setMessage("are you sure to exit?");
		ad.setPositiveButton("yes", new DialogInterface.OnClickListener() {

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				MainActivity.this.finish();
			}
		});
		ad.setNegativeButton("no", new DialogInterface.OnClickListener() {

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				dialog.dismiss();
			}
		});
		ad.show();
	}
}
