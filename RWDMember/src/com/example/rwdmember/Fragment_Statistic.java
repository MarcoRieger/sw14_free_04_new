package com.example.rwdmember;

import java.util.ArrayList;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class Fragment_Statistic extends Fragment {
	
	public static Fragment_Statistic newInstance(int sectionNumber) {
		Fragment_Statistic fragment = new Fragment_Statistic();
		Bundle args = new Bundle();
		fragment.setArguments(args);
		return fragment;
	}



	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_statistic, container,
				false);
		
	    //ArrayList<Member> members = Read_CSV.getMemberList();
		//int all_members = members.size();
	    int current_members = 111;
//	    for (int i = 0; i <= members.size(); i++)
//	    {
//	    	if(members.get(i).isSelected() == true)
//	    	{
//	    		current_members++;
//	    	}  	
//	    }
//    	TextView tv = (TextView) getView().findViewById(R.id.presentMembers);
//    	tv.setText(current_members);
	    String barcode = "Hallo";
    	EditText etBarcode = (EditText) getView().findViewById(R.id.presentMembers);
		etBarcode.setText(barcode);

		return rootView;
	}
}