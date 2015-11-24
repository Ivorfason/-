package com.example.dd;

import com.example.dd.MainActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
	private Button newschool = null;
	private Button oldschool = null;
	private Button schoolnet = null;
	private Button aboutus = null;
	private long exitTime = 0; 

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		newschool=(Button)findViewById(R.id.newschool);
		newschool.setOnClickListener(new MyButtonListener());
		aboutus=(Button)findViewById(R.id.aboutus);
		aboutus.setOnClickListener(new MyButtonListener());
		oldschool=(Button)findViewById(R.id.oldschool);
		oldschool.setOnClickListener(new MyButtonListener());
		schoolnet=(Button)findViewById(R.id.schoolnet);
		schoolnet.setOnClickListener(new MyButtonListener());
	}
class MyButtonListener implements OnClickListener{

	@Override
	public void onClick(View v){
	if(v==newschool){
		Intent intent = new Intent();
		intent.setClass(MainActivity.this,newschool.class);
		MainActivity.this.startActivity(intent);
		}
	else if(v==oldschool){
		Intent intent = new Intent();
		intent.setClass(MainActivity.this,oldschool.class);
		MainActivity.this.startActivity(intent);
		}
	else if(v==aboutus){
		Intent intent = new Intent();
		intent.setClass(MainActivity.this,aboutus.class);
		MainActivity.this.startActivity(intent);
		}
	else{
	Intent intent = new Intent();
	intent.setClass(MainActivity.this,schoolnet.class);
	MainActivity.this.startActivity(intent);
	}
	}

public boolean onCreateOptionsMenu(Menu menu) {
	getMenuInflater().inflate(R.menu.main, menu);
	return true;
	}
	}
@Override
public boolean dispatchKeyEvent(KeyEvent event) { 
	if (event.getKeyCode() == KeyEvent.KEYCODE_BACK) { 
		if (event.getAction() == KeyEvent.ACTION_DOWN && event.getRepeatCount() == 0) { 
			this.exitApp(); } return true; } 
	return super.dispatchKeyEvent(event); 
}
private void exitApp() { 
	if ((System.currentTimeMillis() - exitTime) > 2000) { 
		Toast.makeText(MainActivity.this, "再按一次退出程序", Toast.LENGTH_SHORT).show(); 
		exitTime = System.currentTimeMillis(); 
	} else { 
		finish(); 
	}
}
}

