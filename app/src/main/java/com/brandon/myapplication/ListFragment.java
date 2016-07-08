package com.brandon.myapplication;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Brandon on 7/2/2016.
 */
public class ListFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        // Defines the xml file for the fragment
    System.out.println("FRAG CREATED!!");
        return inflater.inflate(R.layout.category_tabs, parent, false);
    }

    // This event is triggered soon after onCreateView().
    // Any view setup should occur here.  E.g., view lookups and attaching view listeners.
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // Setup any handles to view objects here
        // EditText etFoo = (EditText) view.findViewById(R.id.etFoo);
        System.out.println("Setting up Tabs!!");
        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.tabs);
        tabLayout.addTab(tabLayout.newTab().setText("Trees"));
        tabLayout.addTab(tabLayout.newTab().setText("Plants"));
        tabLayout.addTab(tabLayout.newTab().setText("Other"));
        android.support.v4.app.FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.list_fragment, new com.brandon.myapplication.Trees());
        ft.commit();
//        FragmentManager manager = getFragmentManager();
//        ViewPagerAdapter adapter = new ViewPagerAdapter(manager);
//
//        final ViewPager view_pager = (ViewPager) view.findViewById(R.id.viewPager);
//        view_pager.setAdapter(adapter);
//
//        tabLayout.setupWithViewPager(view_pager);

//        view_pager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {

            android.support.v4.app.FragmentTransaction ft = null;
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                ft = getFragmentManager().beginTransaction();
                switch(tab.getPosition()){
                    case(0):
                        ft.replace(R.id.list_fragment, new com.brandon.myapplication.Trees());
                        break;
                    case(1):
                        ft.replace(R.id.list_fragment, new com.brandon.myapplication.Plants());
                        break;
                    case(2):
                        ft.replace(R.id.list_fragment, new com.brandon.myapplication.Other());
                        break;

                     default:
                         ft.replace(R.id.list_fragment, new com.brandon.myapplication.Trees());
                         break;
                }
                ft.commit();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}
