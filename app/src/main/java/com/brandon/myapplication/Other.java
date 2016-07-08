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
public class Other extends Fragment {
    List<Item> listData;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        System.out.println("Frag one implemented!");

        return inflater.inflate(R.layout.list_view, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        ArrayList<String> otherNames = new ArrayList<String>();
        otherNames.add("Pond");
        otherNames.add("Edge");
        otherNames.add("Spillway");
        otherNames.add("Gas Line");
        System.out.println("OTHER IS UP");

        prepareListData();
        CustomExpandableListAdapter listAdapter = new CustomExpandableListAdapter(this.getContext(), listData);
        ;
        ExpandableListView expListView = (ExpandableListView) view.findViewById(R.id.list_view);
        ;
        expListView.setAdapter(listAdapter);
//        super.onViewCreated(view, savedInstanceState);

    }

    private void prepareListData() {
        listData = new ArrayList<Item>();
        listData.add(new Item("Pond", "Red oak wood is one of the main type of wood used for timber in the eastern United States. Because of its ability to tolerate many conditions, it is planted in many cities and urban areas. It is often planted for landscaping.\n" +
                "A very large Northern Red Oak is located in Ashford, Connecticut the trunk's diameter is 8 m (26 ft) \n" +
                "Most species of oaks live over 200 years. There are certain trees that can survive over a thousand years.\n"));
        listData.add(new Item("Edge", "Seeds are eaten by several species of birds. The bark is occasionally food for rabbits, beavers, and porcupines. \n" +
                "Cavity excavating and nesting birds often use White Ash. \n" +
                "This tree attracts wood ducks, bobwhites, purples finches, pine grosbeaks, fox squirrels, rabbits, beavers, mice, and porcupines. \n" +
                "It is used to make things like baseball bats, hockey sticks, and furniture.\n"));
        listData.add(new Item("Spillway", "It is not heavily harvested and no varieties or hybrids have been created. The wood of the Winged elm is however put to good use in making furniture, particularly when curved pieces are required. " +
                "The wood is quite strong and does not split easily. The wood exhibits interesting patterns, making it useful as flooring. The main reason that there is not more of a commercial market for the Winged elm is probably because there are so many other hardwood species."));
        listData.add(new Item("Gas Line", "maybe id something else??"));
    }
}
