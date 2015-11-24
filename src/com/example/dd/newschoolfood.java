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


public class newschoolfood extends Activity implements View.OnClickListener{
	
	
	private ImageView lanzhoulamian = null;
	private ImageView shouzhuabing = null;
	private ImageView qiangzixiaochi = null;
	private ImageView malatang = null;
	private ImageView zhangjiekaorou = null;
	private ImageView xianbingxiaochi = null;
	private Button more1=null;
	ImageView tell1,tell2,tell3,tell4,tell5,tell6;
	int request_Code=1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.newschoolfood);
		this.setTitle("新校区美食");
		
		tell1=(ImageView)findViewById(R.id.tell1);
		tell1.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View arg0)
			{
				Intent i=new
						Intent(android.content.Intent.ACTION_DIAL,Uri.parse("tel:15144229448"));
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
						Intent(android.content.Intent.ACTION_DIAL,Uri.parse("tel:13944233197"));
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
						Intent(android.content.Intent.ACTION_DIAL,Uri.parse("tel:13944610978"));
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
						Intent(android.content.Intent.ACTION_DIAL,Uri.parse("tel:13944685508"));
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
						Intent(android.content.Intent.ACTION_DIAL,Uri.parse("tel:13944621680"));
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
						Intent(android.content.Intent.ACTION_DIAL,Uri.parse("tel:13894206897"));
				startActivity(i);
			}
		});
		

		lanzhoulamian=(ImageView)findViewById(R.id.lanzhoulamian);
		lanzhoulamian.setOnClickListener(this);
		shouzhuabing=(ImageView)findViewById(R.id.shouzhuabing);
		shouzhuabing.setOnClickListener(this);
		qiangzixiaochi=(ImageView)findViewById(R.id.qiangzixiaochi);
		qiangzixiaochi.setOnClickListener(this);
		zhangjiekaorou=(ImageView)findViewById(R.id.zhangjiekaorou);
		zhangjiekaorou.setOnClickListener(this);
		malatang=(ImageView)findViewById(R.id.malatang);
		malatang.setOnClickListener(this);
		xianbingxiaochi=(ImageView)findViewById(R.id.xianbingxiaochi);
		xianbingxiaochi.setOnClickListener(this);
		more1=(Button)findViewById(R.id.more1);
		more1.setOnClickListener(this);
		
		
	}
	
	
		@Override
		public void onClick(View v){
			if(v==lanzhoulamian){
				Intent intent = new Intent();
				intent.setClass(newschoolfood.this,lanzhou.class);
				newschoolfood.this.startActivity(intent);
				}
			else if(v==shouzhuabing){
				Intent intent = new Intent();
				intent.setClass(newschoolfood.this,shouzhua.class);
				newschoolfood.this.startActivity(intent);
				}
			else if(v==qiangzixiaochi){
				Intent intent = new Intent();
				intent.setClass(newschoolfood.this,qiangzi.class);
				newschoolfood.this.startActivity(intent);
				}
			else if(v==zhangjiekaorou){
				Intent intent = new Intent();
				intent.setClass(newschoolfood.this,zhangjie.class);
				newschoolfood.this.startActivity(intent);
				}
			else if(v==malatang){
				Intent intent = new Intent();
				intent.setClass(newschoolfood.this,mala.class);
				newschoolfood.this.startActivity(intent);
				}
			else if(v==xianbingxiaochi){
				Intent intent = new Intent();
				intent.setClass(newschoolfood.this,xianbing.class);
				newschoolfood.this.startActivity(intent);
				}
			else if(v==more1){
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
	

