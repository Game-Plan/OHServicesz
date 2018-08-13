package com.ohservices.ohservices;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import android.widget.Toolbar;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ContentFragment extends Fragment {


    Activity myactivity;
    ArrayList<ServiceProvider> serviceProvider=new ArrayList<ServiceProvider>() ;
    ArrayList<ServiceProvider> serviceProvider1=new ArrayList<ServiceProvider>() ;
    ContentAdapter contentAdapter;
    RecyclerView contentList;

    public ContentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view= inflater.inflate(R.layout.fragment_content, container, false);
       contentList=view.findViewById(R.id.ContentList);
       return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        myactivity=(Activity)context;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        myactivity=activity;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        serviceProvider.add( new ServiceProvider("Amresh Raina","1000"));
        serviceProvider.add( new ServiceProvider("Amresh Raina","1000"));
        serviceProvider.add( new ServiceProvider("Amresh Raina","1000"));
        serviceProvider.add( new ServiceProvider("Amresh Raina","1000"));
        serviceProvider.add( new ServiceProvider("Amresh Raina","1000"));

        String value=null;
//        value=getArguments().getString("HOSTEL");
//        Toast.makeText(myactivity, value, Toast.LENGTH_LONG).show();
        value=getArguments().getString("CARPENTER");
        if(value=="carpenter") {
            myactivity.setTitle("Carpenter");
            contentAdapter = new ContentAdapter(myactivity, serviceProvider);
            contentList.setHasFixedSize(true);
            contentList.setLayoutManager(new LinearLayoutManager(myactivity));
            contentList.setItemAnimator(new DefaultItemAnimator());
            contentList.setAdapter(contentAdapter);
            contentAdapter.notifyDataSetChanged();
        }

        value=getArguments().getString("HOSTEL");
        if(value=="hostel"){
            myactivity.setTitle("Hostels");
            contentAdapter=new ContentAdapter(myactivity,serviceProvider);
            contentList.setHasFixedSize(true);
            contentList.setLayoutManager(new LinearLayoutManager(myactivity));
            contentList.setItemAnimator(new DefaultItemAnimator());
            contentList.setAdapter(contentAdapter);
            contentAdapter.notifyDataSetChanged();
        }
    }
}
