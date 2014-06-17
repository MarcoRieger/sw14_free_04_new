package com.example.rwdmember;

import java.util.ArrayList;

import android.app.Fragment;
import android.app.FragmentTransaction;
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
		ArrayList<Member> members = new ArrayList<Member>();
		members = Read_CSV.getMemberList();
		
		int counter = 0;
		
		for (int i = 0; i < members.size(); i++) {
			if (members.get(i).isSelected())
				counter++;
		}
		
		//EditText etMember = (EditText) rootView.findViewById(R.id.presentMembers);
		TextView etMember = (TextView) rootView.findViewById(R.id.textViewOutput);
		etMember.setText(String.valueOf(counter) + " from " + String.valueOf(members.size()));
		return rootView;
	}	

}
	