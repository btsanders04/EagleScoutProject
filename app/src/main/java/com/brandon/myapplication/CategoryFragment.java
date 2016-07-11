package com.brandon.myapplication;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Brandon on 7/2/2016.
 */
public class CategoryFragment extends Fragment {


    ItemList itemList;
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
        itemList =  new ItemList();
        Bundle args = new Bundle();
        ListFragment listFrag = new ListFragment();

        for(Category c : Category.values()){
            tabLayout.addTab(tabLayout.newTab().setText(c.toString()));
        }

        args.putParcelableArrayList("key", itemList.getCategoryListData(tabLayout.getTabAt(0).getText().toString()));

        listFrag.setArguments(args);

        android.support.v4.app.FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.activity_fragment, listFrag);
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
                Bundle args = new Bundle();
                ListFragment listFrag = new ListFragment();

                args.putParcelableArrayList("key", itemList.getCategoryListData(tab.getText().toString()));
                listFrag.setArguments(args);
                ft.replace(R.id.activity_fragment,listFrag);
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
