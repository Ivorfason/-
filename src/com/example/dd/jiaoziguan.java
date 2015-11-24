package com.example.dd;
import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

public class jiaoziguan extends BaseExpandableListAdapter {
private Context mContext;
private String[] groups = {"∑ÁŒ∂–°≥¥","¡π≤ÀÃ¿¿‡","≥¥∑π¿‡"};
private String[][] children = { { "¬È¿±∂π∏Ø                            £§6.00","¥®Ω∑Õ¡∂πÀø                        £§6.00","∂π—ø≥¥∑€                            £§6.00","À·¿±∂π—ø                           £§6.00" },{"◊œ≤Àµ∞ª®Ã¿                         £§5.00","»‚ƒ≠∂π—ø                            £§8.00","ª∆πœΩ’Îƒ•                       £§10.00","ƒæ–Î ¡◊”Ã¿                        £§5.00"},{"◊Œ»ªªÕ»≥¥∑π                      £§5.00","π¨±£º¶∂°≥¥∑π                      £§5.00","∂π—ø»‚≥¥∑π                         £§5.00 ","’•≤À»‚≥¥∑π                         £§5.00"} };
jiaoziguan(Context context) {mContext = context;
}


@Override
public Object getChild(int groupPosition, int childPosition) {
	return children[groupPosition][childPosition];
	}

@Override
public long getChildId(int groupPosition, int childPosition) {
	return childPosition;
	}

@Override
public View getChildView(int groupPosition, int childPosition,boolean isLastChild, View convertView, ViewGroup parent) {
TextView textView = getGenericView();
textView.setText(getChild(groupPosition, childPosition).toString());
return textView;
}

 
@Override
public int getChildrenCount(int groupPosition) {
	return children[groupPosition].length;
	}

 
@Override
public Object getGroup(int groupPosition) {
	return groups[groupPosition];
	}

@Override
public int getGroupCount() {
	return groups.length;
	}

 
@Override
public long getGroupId(int groupPosition) {
	return groupPosition;
	}

 
@Override
public View getGroupView(int groupPosition, boolean isExpanded,View convertView, ViewGroup parent) {
	TextView textView = getGenericView();
	textView.setText(getGroup(groupPosition).toString());
	return textView;
	}

 
@Override
public boolean hasStableIds() {
	return true;
	}

 
@Override
public boolean isChildSelectable(int groupPosition, int childPosition) {
	return true;
	}

 

private TextView getGenericView() {
	AbsListView.LayoutParams lp = new AbsListView.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, 48);
	TextView textView = new TextView(mContext);
	textView.setLayoutParams(lp);
	textView.setGravity(Gravity.CENTER_VERTICAL | Gravity.LEFT);
	textView.setPadding(32, 0, 0, 0);
	return textView;
	}
}