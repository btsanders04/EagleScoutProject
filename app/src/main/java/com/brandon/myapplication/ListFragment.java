package com.brandon.myapplication;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Brandon on 7/2/2016.
 */
public class ListFragment extends Fragment {

    List<Item> categoryItemList;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        System.out.println("Frag one implemented!");

        return inflater.inflate(R.layout.list_view, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        categoryItemList = getArguments().getParcelableArrayList("key");
        CustomExpandableListAdapter listAdapter = new CustomExpandableListAdapter(this.getContext(), categoryItemList);
        ;
        ExpandableListView expListView = (ExpandableListView) view.findViewById(R.id.list_view);
        ;
        expListView.setAdapter(listAdapter);


    }



}
