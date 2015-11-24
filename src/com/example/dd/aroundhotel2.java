package com.example.dd;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class aroundhotel2 extends Activity implements View.OnClickListener{
private Button jingqiaohotel =null;
private Button qingchenghotel=null; 
private Button xurihotel=null; 
private Button jialehotel=null; 
private Button aitahotel=null; 
private Button qingtonghotel=null; 
Button Tell1,Tell2,Tell3,Tell4,Tell5,Tell6;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aroundhotel2);
		this.setTitle("周边住宿");
		
		Tell1=(Button)findViewById(R.id.Tell1);
		Tell1.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View arg0)
			{
				Intent i=new
						Intent(android.content.Intent.ACTION_DIAL,Uri.parse("tel:+043286868681"));
				startActivity(i);
			}
		});	
		
		Tell2=(Button)findViewById(R.id.Tell2);
		Tell2.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View arg0)
			{
				Intent i=new
						Intent(android.content.Intent.ACTION_DIAL,Uri.parse("tel:+043286868682"));
				startActivity(i);
			}
		});	
		
		Tell3=(Button)findViewById(R.id.Tell3);
		Tell3.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View arg0)
			{
				Intent i=new
						Intent(android.content.Intent.ACTION_DIAL,Uri.parse("tel:+043286868683"));
				startActivity(i);
			}
		});	
		
		Tell4=(Button)findViewById(R.id.Tell4);
		Tell4.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View arg0)
			{
				Intent i=new
						Intent(android.content.Intent.ACTION_DIAL,Uri.parse("tel:+0432868684"));
				startActivity(i);
			}
		});	
		
		Tell5=(Button)findViewById(R.id.Tell5);
		Tell5.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View arg0)
			{
				Intent i=new
						Intent(android.content.Intent.ACTION_DIAL,Uri.parse("tel:+0432868685"));
				startActivity(i);
			}
		});	
		
		Tell6=(Button)findViewById(R.id.Tell6);
		Tell6.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View arg0)
			{
				Intent i=new
						Intent(android.content.Intent.ACTION_DIAL,Uri.parse("tel:+0432868686"));
				startActivity(i);
			}
		});	
		
		
		
	jingqiaohotel=(Button)findViewById(R.id.jingqiaohotel);
	jingqiaohotel.setOnClickListener(this);
	qingchenghotel=(Button)findViewById(R.id.qingchenghotel);
	qingchenghotel.setOnClickListener(this);
	xurihotel=(Button)findViewById(R.id.xurihotel);
	xurihotel.setOnClickListener(this);
	jialehotel=(Button)findViewById(R.id.jialehotel);
	jialehotel.setOnClickListener(this);
	aitahotel=(Button)findViewById(R.id.aitahotel);
	aitahotel.setOnClickListener(this);
	qingtonghotel=(Button)findViewById(R.id.qingtonghotel);
	qingtonghotel.setOnClickListener(this);
	
	}

	@Override
	public void onClick(View V){
		if(V==jingqiaohotel){
		new AlertDialog.Builder(this)
		.setTitle("莎莎旅店")
		.setMessage("老校区大门左走50米                                        标准间  100                                               普通间   50")
		.setNeutralButton("I got it",new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		})
		.show();
	}

		else if(V==qingchenghotel){
			
			new AlertDialog.Builder(this)
			.setTitle("蔷薇旅店")
			.setMessage("老校区大门左走100米                                        标准间  100                                               普通间   60")
			.setNeutralButton("I got it",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					
				}
			})
			.show();
			}
		else if(V==xurihotel){
					
					new AlertDialog.Builder(this)
					.setTitle("米度旅店")
					.setMessage("老校区大门左走60米                                        标准间  100                                               普通间   70")
					.setNeutralButton("I got it",new DialogInterface.OnClickListener() {
						
						@Override
						public void onClick(DialogInterface dialog, int which) {
							// TODO Auto-generated method stub
							
						}
					})
					.show();
					}
		else if(V==jialehotel){
			
			new AlertDialog.Builder(this)
			.setTitle("彼旅店")
			.setMessage("老校区大门右走100米                                        标准间  80                                               普通间   55")
			.setNeutralButton("I got it",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					
				}
			})
			.show();
			}
		else if(V==aitahotel){
			
			new AlertDialog.Builder(this)
			.setTitle("苏格时尚旅店")
			.setMessage("老校区大门左走70米                                        标准间  100                                               普通间   50")
			.setNeutralButton("I got it",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					
				}
			})
			.show();
			}
		else if(V==qingtonghotel){
			
			new AlertDialog.Builder(this)
			.setTitle("康泷旅店")
			.setMessage("老校区大门左走90米                                        标准间  100                                               普通间   60")
			.setNeutralButton("I got it",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					
				}
			})
			.show();
			}
			
}

		@Override
		public boolean onCreateOptionsMenu(Menu menu) {
			// Inflate the menu; this adds items to the action bar if it is present.
			getMenuInflater().inflate(R.menu.main, menu);
			return true;
		}
	}
	
	