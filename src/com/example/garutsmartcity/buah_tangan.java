package com.example.garutsmartcity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class buah_tangan extends Activity {
	ListView lv;
	String[] item = new String[]{ "Jeruk Garut","Dodol Garut","Chocodot","Jaket Kulit","Kerupuk kulit"};

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.buah_tangan);

		lv = (ListView) findViewById(R.id.listView1);
        lv.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, item));
        lv.setOnItemClickListener(new OnItemClickListener(){
        	public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3){
        		Intent i = null;
        		if (position == 0){
        			i = new Intent(buah_tangan.this, jeruk.class);}
        		else if(position == 1){
        			i = new Intent(buah_tangan.this, dodol.class);}
        		else if(position == 2){
        			i = new Intent(buah_tangan.this, chocodot.class);}
        		else if(position == 3){
        			i = new Intent(buah_tangan.this, jaket.class);}
        		else if(position == 4){
        			i = new Intent(buah_tangan.this, kerupuk.class);}
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
