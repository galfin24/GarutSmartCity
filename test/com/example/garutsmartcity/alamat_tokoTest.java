package com.example.garutsmartcity;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.webkit.WebView;

public class alamat_tokoTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testOnCreateBundle() {
		 class alamat_toko extends Activity{
			WebView webview2;
			@Override
			public void onCreate(Bundle bundle){
				super.onCreate(bundle);
				this.requestWindowFeature(Window.FEATURE_NO_TITLE);
				setContentView(R.layout.webviewall);
	}
		 }}
}
