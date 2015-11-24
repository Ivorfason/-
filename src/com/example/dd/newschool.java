package com.example.dd;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.Toast;

public class newschool extends Activity{
	Integer[] imageIDs={
			R.drawable.pic1,
			R.drawable.pic2,
			R.drawable.pic3,
			R.drawable.pic4,
			R.drawable.pic5,
			R.drawable.pic6
		};
	
private Button newschoolfood=null;
private Button aroundhotel=null;
private ImageView newschoolmap=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.newschool);
		this.setTitle("新校区服务");
		getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN); 
	    newschool instance = this;
		newschoolfood=(Button)findViewById(R.id.newschoolfood);
		newschoolfood.setOnClickListener(new MyButtonListener());
		aroundhotel=(Button)findViewById(R.id.aroundhotel);
		aroundhotel.setOnClickListener(new MyButtonListener());		    

		
Gallery gallery = (Gallery) findViewById(R.id.gallery1);
		
		gallery.setAdapter(new ImageAdapter(this));
		gallery.setOnItemClickListener(new OnItemClickListener()
		{
			@Override
			public void onItemClick(AdapterView<?> parent,View v,int position,long id){
				Toast.makeText(getBaseContext(), "新校区风光"+(position+1), Toast.LENGTH_SHORT).show();
			
			ImageView imageView = (ImageView) findViewById(R.id.image1);
			imageView.setImageResource(imageIDs[position]);
				
			}			
		});

	}
	class MyButtonListener implements OnClickListener{
		@Override
		public void onClick(View v){
			if(v==newschoolfood){
		Intent intent = new Intent();
		intent.setClass(newschool.this,newschoolfood.class);
		newschool.this.startActivity(intent);
		}
			else{
				Intent intent = new Intent();
				intent.setClass(newschool.this,aroundhotel.class);
				newschool.this.startActivity(intent);
			}
		}
		
	}
	
	public class ImageAdapter extends BaseAdapter {
		private Context context;
		private int itemBackground;
		
		public ImageAdapter(Context c){
			context = c;
			 TypedArray a = obtainStyledAttributes(R.styleable.Gallery1);
			 itemBackground = a.getResourceId(
					 R.styleable.Gallery1_android_galleryItemBackground,1);
			a.recycle();
		}
		
		@Override
		public int getCount(){
			return imageIDs.length;
		}
		
		
		@Override
		public Object getItem(int position){
			return position;
			
		}
		
		
		@Override
		public long getItemId(int position){
			
			return position;
		}
		
		
		@Override
		public View getView(int position,View converView,ViewGroup parent){
			ImageView imageView = new ImageView(context);
			imageView.setImageResource(imageIDs[position]);
			imageView.setScaleType(ImageView.ScaleType.FIT_XY);
			imageView.setLayoutParams(new Gallery.LayoutParams(150,120));
			imageView.setBackgroundResource(itemBackground);
			return imageView;
			
			
		}
	
	}
}