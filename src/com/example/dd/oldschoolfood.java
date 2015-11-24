package com.example.dd;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.net.Uri;


public class oldschoolfood extends Activity implements View.OnClickListener{
	
	
	private ImageView jiwankuaifan = null;
	private ImageView jiaoziguan = null;
	private ImageView xinjiangshaokao = null;
	private ImageView heijiroubing = null;
	private ImageView zicaibaofan = null;
	private ImageView xiaolongbao = null;
	private Button more2=null;
	ImageView tell1,tell2,tell3,tell4,tell5,tell6;
	int request_Code=1;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.oldschoolfood);
		this.setTitle("老校区美食");
		
	    tell1=(ImageView)findViewById(R.id.tell1);
		tell1.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View arg0)
			{
				Intent i=new
						Intent(android.content.Intent.ACTION_DIAL,Uri.parse("tel:15144246426"));
				startActivity(i);
			}
		});
		
		
		tell2=(ImageView)findViewById(R.id.tell2);
		tell2.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View arg0)
			{
				Intent i=new
						Intent(android.content.Intent.ACTION_DIAL,Uri.parse("tel:15844240935"));
				startActivity(i);
			}
		});

		tell3=(ImageView)findViewById(R.id.tell3);
		tell3.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View arg0)
			{
				Intent i=new
						Intent(android.content.Intent.ACTION_DIAL,Uri.parse("tel:+651234567"));
				startActivity(i);
			}
		});
		
		tell4=(ImageView)findViewById(R.id.tell4);
		tell4.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View arg0)
			{
				Intent i=new
						Intent(android.content.Intent.ACTION_DIAL,Uri.parse("tel:+651234567"));
				startActivity(i);
			}
		});
		
		tell5=(ImageView)findViewById(R.id.tell5);
		tell5.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View arg0)
			{
				Intent i=new
						Intent(android.content.Intent.ACTION_DIAL,Uri.parse("tel:+651234567"));
				startActivity(i);
			}
		});
		
		tell6=(ImageView)findViewById(R.id.tell6);
		tell6.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View arg0)
			{
				Intent i=new
						Intent(android.content.Intent.ACTION_DIAL,Uri.parse("tel:+651234567"));
				startActivity(i);
			}
		});
		
		
		jiwankuaifan=(ImageView)findViewById(R.id.jiwankuaifan);
		jiwankuaifan.setOnClickListener(this);
		xiaolongbao=(ImageView)findViewById(R.id.xiaolongbao);
		xiaolongbao.setOnClickListener(this);
		zicaibaofan=(ImageView)findViewById(R.id.zicaibaofan);
		zicaibaofan.setOnClickListener(this);
		heijiroubing=(ImageView)findViewById(R.id.heijiroubing);
		heijiroubing.setOnClickListener(this);
		xinjiangshaokao=(ImageView)findViewById(R.id.xinjiangshaokao);
		xinjiangshaokao.setOnClickListener(this);
		jiaoziguan=(ImageView)findViewById(R.id.jiaoziguan);
		jiaoziguan.setOnClickListener(this);
		more2=(Button)findViewById(R.id.more2);
		more2.setOnClickListener(this);
		
	}
		
		@Override
		public void onClick(View v){
			if(v==jiwankuaifan){
				Intent intent = new Intent();
				intent.setClass(oldschoolfood.this,jiwan.class);
				oldschoolfood.this.startActivity(intent);
				}
			else if(v==xiaolongbao){
				Intent intent = new Intent();
				intent.setClass(oldschoolfood.this,xiaolong.class);
				oldschoolfood.this.startActivity(intent);
				}
			else if(v==xinjiangshaokao){
				Intent intent = new Intent();
				intent.setClass(oldschoolfood.this,xinjiang.class);
				oldschoolfood.this.startActivity(intent);
				}
			else if(v==zicaibaofan){
				Intent intent = new Intent();
				intent.setClass(oldschoolfood.this,zicai.class);
				oldschoolfood.this.startActivity(intent);
				}
			else if(v==heijiroubing){
				Intent intent = new Intent();
				intent.setClass(oldschoolfood.this,heiji.class);
				oldschoolfood.this.startActivity(intent);
				}
			else if(v==jiaoziguan){
				Intent intent = new Intent();
				intent.setClass(oldschoolfood.this,jiaozi.class);
				oldschoolfood.this.startActivity(intent);
				}
			else if(v==more2){
				new AlertDialog.Builder(this)
				.setTitle("更多美食信息")
				.setMessage("未完待续---敬请期待")
				.setNeutralButton("cancel",new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						
					}
				})
				.show();
			}
		}
}