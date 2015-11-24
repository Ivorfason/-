package com.example.dd;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class schoolnet extends Activity {
	Button b1,b2,b3,b4;
	int request_Code=1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.schoolnet);
		b1=(Button)findViewById(R.id.neduweb1);
		b1.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View arg0)
			{
				Intent i=new
						Intent(android.content.Intent.ACTION_VIEW,Uri.parse("http://jwc.nedu.edu.cn/"));
				startActivity(i);
			}
		});
		
		b2=(Button)findViewById(R.id.neduweb2);
		b2.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View arg0)
			{
				Intent i=new
						Intent(android.content.Intent.ACTION_VIEW,Uri.parse("http://54shine.nedu.edu.cn/"));
				startActivity(i);
			}
		});
		
		b3=(Button)findViewById(R.id.neduweb3);
		b3.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View arg0)
			{
				Intent i=new
						Intent(android.content.Intent.ACTION_VIEW,Uri.parse("http://lib.nedu.edu.cn/"));
				startActivity(i);
			}
		});
		
		
		b4=(Button)findViewById(R.id.neduweb4);
		b4.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View arg0)
			{
				Intent i=new
						Intent(android.content.Intent.ACTION_VIEW,Uri.parse("http://59.72.212.6/luntan/portal.php"));
				startActivity(i);
			}
		});
		
		
	}

	@Override
	public void onActivityResult(int requestCode,int resultCode,Intent data)
	{
		if(requestCode==request_Code)
		{
			if(resultCode==RESULT_OK)
			{
				Toast.makeText(this,data.getData().toString(),Toast.LENGTH_SHORT).show();
				Intent i=new Intent(android.content.Intent.ACTION_VIEW,Uri.parse(data.getData().toString()));
				startActivity(i);
			}
	}
			}
	}

