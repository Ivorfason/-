package com.example.dd;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.PagerTitleStrip;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;

public class aboutus extends Activity {

	private ViewPager viewPager;
	private PagerTitleStrip pagerTitleStrip;
	private List<View> list;
	private List<String> titleList;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aboutus);
		this.setTitle("关于我们");

		viewPager = (ViewPager) this.findViewById(R.id.vviewpager);
		pagerTitleStrip=(PagerTitleStrip)this.findViewById(R.id.ppagertitle);
		View about1=LayoutInflater.from(aboutus.this).inflate(R.layout.about1,null);
		View about2=LayoutInflater.from(aboutus.this).inflate(R.layout.about2,null);
		View about3=LayoutInflater.from(aboutus.this).inflate(R.layout.about3,null);
		list=new ArrayList<View>();
		list.add(about1);
		list.add(about2);
		list.add(about3);
		titleList=new ArrayList<String>();
		titleList.add("东北电力大学");
		titleList.add("理学院");
		titleList.add("软件研发中心");
		
		viewPager.setAdapter(new MyPagerAdapter());
	}
		
	    public class MyPagerAdapter extends PagerAdapter {

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return list.size();
		}

		
		@Override
		public boolean isViewFromObject(View arg0, Object arg1) {
			return arg0==arg1;
		}

		@Override
		public void destroyItem(ViewGroup container, int position, Object object) {
			//super.destroyItem(container,position,object);
			((ViewPager)container).removeView(list.get(position));
		}

		@Override
		public CharSequence getPageTitle(int position){
			return titleList.get(position);
		}
	
		@Override
		public Object instantiateItem(ViewGroup container, int position) {
			((ViewPager)container).addView(list.get(position));
			return list.get(position);
		}
	}
	    
	    @Override
		public boolean onCreateOptionsMenu(Menu menu) {
			getMenuInflater().inflate(R.menu.main, menu);
			return true;
		}
}