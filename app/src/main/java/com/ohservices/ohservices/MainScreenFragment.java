package com.ohservices.ohservices;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainScreenFragment extends Fragment {


    Activity myActivity;
    RelativeLayout zhostel,zbooks,zfood,zlaundry,zelec,zpainter,zmaid,zcarpenter,zcook,ztutor,zplumber,zblacksmith;

    public MainScreenFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_main_screen, container, false);
        zhostel=view.findViewById(R.id.hostel);
        zbooks=view.findViewById(R.id.books);
        zfood=view.findViewById(R.id.food);
        zlaundry=view.findViewById(R.id.laundry);
        zelec=view.findViewById(R.id.electrician);
        zpainter=view.findViewById(R.id.painter);
        zmaid=view.findViewById(R.id.maid);
        zcarpenter=view.findViewById(R.id.carpenter);
        zcook=view.findViewById(R.id.cook);
        ztutor=view.findViewById(R.id.tutor);
        zplumber=view.findViewById(R.id.plumber);
        zblacksmith=view.findViewById(R.id.blacksmith);
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        myActivity=(Activity)context;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        myActivity=activity;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        zhostel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                ContentFragment fragment = new ContentFragment();
                Bundle args =new Bundle();
                args.putString("HOSTEL","hostel");
                fragment.setArguments(args);
                fragmentTransaction.replace(R.id.contentListFragment, fragment);
                fragmentTransaction.commit();
            }
        });
        zbooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                ContentFragment fragment = new ContentFragment();
                Bundle args1 =new Bundle();
                args1.putString("HOSTEL","hostel");
                fragment.setArguments(args1);
                fragmentTransaction.replace(R.id.contentListFragment, fragment);
                fragmentTransaction.commit();
            }
        });
        zfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                ContentFragment fragment = new ContentFragment();
                Bundle args2 =new Bundle();
                args2.putString("HOSTEL","hostel");
                fragment.setArguments(args2);
                fragmentTransaction.replace(R.id.contentListFragment, fragment);
                fragmentTransaction.commit();
            }
        });

        zlaundry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                ContentFragment fragment = new ContentFragment();
                Bundle args3 =new Bundle();
                args3.putString("LAUNDRY","laundry");
                fragment.setArguments(args3);
                fragmentTransaction.replace(R.id.contentListFragment, fragment);
                fragmentTransaction.commit();
            }
        });
        zelec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                ContentFragment fragment = new ContentFragment();
                Bundle args4 =new Bundle();
                args4.putString("ELEC","elec");
                fragment.setArguments(args4);
                fragmentTransaction.replace(R.id.contentListFragment, fragment);
                fragmentTransaction.commit();
            }
        });
        zpainter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                ContentFragment fragment = new ContentFragment();
                Bundle args5 =new Bundle();
                args5.putString("PAINTER","painter");
                fragment.setArguments(args5);
                fragmentTransaction.replace(R.id.contentListFragment, fragment);
                fragmentTransaction.commit();
            }
        });

        zmaid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                ContentFragment fragment = new ContentFragment();
                Bundle args6 =new Bundle();
                args6.putString("MAID","maid");
                fragment.setArguments(args6);
                fragmentTransaction.replace(R.id.contentListFragment, fragment);
                fragmentTransaction.commit();
            }
        });
        zcarpenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                ContentFragment fragment = new ContentFragment();
                Bundle args7 =new Bundle();
                args7.putString("CARPENTER","carpenter");
                fragment.setArguments(args7);
                fragmentTransaction.replace(R.id.contentListFragment, fragment);
                fragmentTransaction.commit();
            }
        });
        zcook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                ContentFragment fragment = new ContentFragment();
                Bundle args8 =new Bundle();
                args8.putString("COOK","cook");
                fragment.setArguments(args8);
                fragmentTransaction.replace(R.id.contentListFragment, fragment);
                fragmentTransaction.commit();
            }
        });
        ztutor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                ContentFragment fragment = new ContentFragment();
                Bundle args9 =new Bundle();
                args9.putString("TUTOR","tutor");
                fragment.setArguments(args9);
                fragmentTransaction.replace(R.id.contentListFragment, fragment);
                fragmentTransaction.commit();
            }
        });
        zplumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                ContentFragment fragment = new ContentFragment();
                Bundle args10 =new Bundle();
                args10.putString("PLUMBER","plumber");
                fragment.setArguments(args10);
                fragmentTransaction.replace(R.id.contentListFragment, fragment);
                fragmentTransaction.commit();
            }
        });
        zblacksmith.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                ContentFragment fragment = new ContentFragment();
                Bundle args11 =new Bundle();
                args11.putString("BLACKSMITH","blacksmith");
                fragment.setArguments(args11);
                fragmentTransaction.replace(R.id.contentListFragment, fragment);
                fragmentTransaction.commit();
            }
        });
    }
}
