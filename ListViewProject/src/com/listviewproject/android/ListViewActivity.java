package com.listviewproject.android;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ListViewActivity extends Activity {
    /** Called when the activity is first created. */
	
	//Initialise Variables
	ListView listViewNames;
	String[] names = {"Rahul Patel", "Anirudh Tandel", "Sumit Sharma", "Yash Bhatia", "Pravin Vaja"};
	ListNamesClass listNamesAdapter;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
                
        listViewNames = (ListView) findViewById(R.id.listViewNames);
        listViewNames.setAdapter(listNamesAdapter = new ListNamesClass(getApplicationContext(), names));
    }
    
    public class ListNamesClass extends BaseAdapter{
    	Context context;
    	String[] names;
    	
    	public ListNamesClass(Context context, String[] names){
    		this.context = context;
    		this.names = names;
    	}
		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return names.length;
		}

		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// TODO Auto-generated method stub
			View rowView = convertView;
			if(rowView == null){
				rowView = getLayoutInflater().inflate(R.layout.listviewitem, null);				
			}
//			ImageView i1 = (ImageView) rowView.findViewById(R.id.image1);
			//set here your own image if you have no of images
//			i1.setImageDrawable(...);
			TextView textName = (TextView) rowView.findViewById(R.id.textView1);
			textName.setText(names[position]);
			
			return rowView;
		}    	
    }
}