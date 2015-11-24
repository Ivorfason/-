
package com.example.dd;
import android.app.ExpandableListActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ExpandableListView.ExpandableListContextMenuInfo;

	public class xinjiang extends ExpandableListActivity {
	private ExpandableListAdapter mAdapter;

	@Override
		public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setTitle("ÐÂ½®ÉÕ¿¾");
		mAdapter = new xinjiangshaokao(this);
		setListAdapter(mAdapter);
		registerForContextMenu(this.getExpandableListView());
		}
	

	@Override
		public boolean onContextItemSelected(MenuItem item) {
		ExpandableListContextMenuInfo info = (ExpandableListContextMenuInfo) item.getMenuInfo();
		String title = ((TextView) info.targetView).getText().toString();
		int type = ExpandableListView.getPackedPositionType(info.packedPosition);
		if (type == ExpandableListView.PACKED_POSITION_TYPE_CHILD) {
			int groupPos = ExpandableListView.getPackedPositionGroup(info.packedPosition);
			int childPos = ExpandableListView.getPackedPositionChild(info.packedPosition);
			Toast.makeText(this,title + "-Group Index" + groupPos + "Child Index:"+ childPos, Toast.LENGTH_SHORT).show();
			return true;
			}
			return false;
			}

}
