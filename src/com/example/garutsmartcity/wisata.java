package com.example.garutsmartcity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class wisata extends Activity {
	ListView lv;
	String[] item = new String[]{ "Cipanas","Talaga Bodas","Darajat","Gunung Papandayan",
			"Situ bagendit","Situ Cangkuang","Pantai Santolo","Pantai Cijeruk Indah",
			"Pantai Karang Paranje","Pantai Rancabuaya","Curug Orok","Arum Jeram Sungai Cimanuk"};

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.wisata);

		lv = (ListView) findViewById(R.id.listView1);
        lv.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, item));
        lv.setOnItemClickListener(new OnItemClickListener(){
        	public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3){
        		Intent i = null;
        		if (position == 0){
        			i = new Intent(wisata.this, cipanas.class);}
        		else if(position == 1){
        			i = new Intent(wisata.this, talaga_bodas.class);}
        		else if(position == 2){
        			i = new Intent(wisata.this, darajat.class);}
        		else if(position == 3){
        			i = new Intent(wisata.this, papandayan.class);}
        		else if(position == 4){
        			i = new Intent(wisata.this, bagendit.class);}
        		else if(position == 5){
        			i = new Intent(wisata.this, cangkuang.class);}
        		else if(position == 6){
        			i = new Intent(wisata.this, santolo.class);}
        		else if(position == 7){
        			i = new Intent(wisata.this, cijeruk.class);}
        		else if(position == 8){
        			i = new Intent(wisata.this, karang_paranje.class);}
        		else if(position == 9){
        			i = new Intent(wisata.this, rancabuaya.class);}
        		else if(position == 10){
        			i = new Intent(wisata.this, curug_orok.class);}
        		else if(position == 11){
        			i = new Intent(wisata.this, arum_jeram_cimanuk.class);
        		}
    			else{}
        	
        	startActivity(i);
        	}
        } );      
}
	public void onBackPressed(){
		finish();
		System.exit(0);
		}
}
