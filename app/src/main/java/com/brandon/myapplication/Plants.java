package com.brandon.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Brandon on 7/2/2016.
 */
public class Plants extends Fragment {
    List<Item> listData;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        System.out.println("Frag one implemented!");

        return inflater.inflate(R.layout.list_view, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        System.out.println("PLANTS ARE UP");

        prepareListData();
        CustomExpandableListAdapter listAdapter = new CustomExpandableListAdapter(this.getContext(), listData);
        ;
        ExpandableListView expListView = (ExpandableListView) view.findViewById(R.id.list_view);
        ;
        expListView.setAdapter(listAdapter);
//        super.onViewCreated(view, savedInstanceState);

    }


}
