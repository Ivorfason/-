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

public class aroundhotel extends Activity implements View.OnClickListener{
private Button qingfenghotel =null;
private Button yixinhotel=null; 
private Button shashahotel=null; 
private Button bianhotel=null; 
private Button fengqianghotel=null; 
private Button yadinghotel=null; 
Button Tell1,Tell2,Tell3,Tell4,Tell5,Tell6;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aroundhotel);
		this.setTitle("周边住宿");
		
		Tell1=(Button)findViewById(R.id.Tell1);
		Tell1.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View arg0)
			{
				Intent i=new
						Intent(android.content.Intent.ACTION_DIAL,Uri.parse("tel:+043268017555"));
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
						Intent(android.content.Intent.ACTION_DIAL,Uri.parse("tel:+043267367666"));
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
						Intent(android.content.Intent.ACTION_DIAL,Uri.parse("tel:+043263101924"));
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
						Intent(android.content.Intent.ACTION_DIAL,Uri.parse("tel:+043263106000"));
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
						Intent(android.content.Intent.ACTION_DIAL,Uri.parse("tel:+15944291978"));
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
						Intent(android.content.Intent.ACTION_DIAL,Uri.parse("tel:+043262278177"));
				startActivity(i);
			}
		});	
		
		
		
	qingfenghotel=(Button)findViewById(R.id.qingfenghotel);
	qingfenghotel.setOnClickListener(this);
	yixinhotel=(Button)findViewById(R.id.yixinhotel);
	yixinhotel.setOnClickListener(this);
	shashahotel=(Button)findViewById(R.id.shashahotel);
	shashahotel.setOnClickListener(this);
	bianhotel=(Button)findViewById(R.id.bianhotel);
	bianhotel.setOnClickListener(this);
	fengqianghotel=(Button)findViewById(R.id.fengqianghotel);
	fengqianghotel.setOnClickListener(this);
	yadinghotel=(Button)findViewById(R.id.yadinghotel);
	yadinghotel.setOnClickListener(this);
	
	}

	@Override
	public void onClick(View V){
		if(V==qingfenghotel){
		new AlertDialog.Builder(this)
		.setTitle("轻风假日旅店")
		.setMessage("新校区大门对面20米                                        标准间  100                                               普通间   50")
		.setNeutralButton("I got it",new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		})
		.show();
	}

		else if(V==yixinhotel){
			
			new AlertDialog.Builder(this)
			.setTitle("逸馨时尚旅店")
			.setMessage("新校区大门对面20米                                        标准间  100                                               普通间   60")
			.setNeutralButton("I got it",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					
				}
			})
			.show();
			}
		else if(V==shashahotel){
					
					new AlertDialog.Builder(this)
					.setTitle("莎莎旅店")
					.setMessage("新校区大门对面20米                                        标准间  100                                               普通间   70")
					.setNeutralButton("I got it",new DialogInterface.OnClickListener() {
						
						@Override
						public void onClick(DialogInterface dialog, int which) {
							// TODO Auto-generated method stub
							
						}
					})
					.show();
					}
		else if(V==bianhotel){
			
			new AlertDialog.Builder(this)
			.setTitle("彼岸驿站旅店")
			.setMessage("新校区大门左走100米                                        标准间  80                                               普通间   55")
			.setNeutralButton("I got it",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					
				}
			})
			.show();
			}
		else if(V==fengqianghotel){
			
			new AlertDialog.Builder(this)
			.setTitle("枫蔷旅店")
			.setMessage("新校区大门左走70米                                        标准间  100                                               普通间   50")
			.setNeutralButton("I got it",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					
				}
			})
			.show();
			}
		else if(V==yadinghotel){
			
			new AlertDialog.Builder(this)
			.setTitle("亚丁旅店")
			.setMessage("新校区大门对面20米                                        标准间  100                                               普通间   60")
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
	
	