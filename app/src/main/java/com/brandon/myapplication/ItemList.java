package com.brandon.myapplication;

import android.os.Parcel;

import com.google.android.gms.vision.barcode.Barcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bs2690 on 7/8/2016.
 */
public class ItemList {

    private List<Item> listData = new ArrayList<Item>();
    public ItemList(){
        prepareListData();
    }

    private void prepareListData() {

        listData.add(new Item("Pond", "Red oak wood is one of the main type of wood used for timber in the eastern United States. Because of its ability to tolerate many conditions, it is planted in many cities and urban areas. It is often planted for landscaping.\n" +
                "A very large Northern Red Oak is located in Ashford, Connecticut the trunk's diameter is 8 m (26 ft) \n" +
                "Most species of oaks live over 200 years. There are certain trees that can survive over a thousand years.\n",Category.OTHER,"9780984782857"));
        listData.add(new Item("Edge", "Seeds are eaten by several species of birds. The bark is occasionally food for rabbits, beavers, and porcupines. \n" +
                "Cavity excavating and nesting birds often use White Ash. \n" +
                "This tree attracts wood ducks, bobwhites, purples finches, pine grosbeaks, fox squirrels, rabbits, beavers, mice, and porcupines. \n" +
                "It is used to make things like baseball bats, hockey sticks, and furniture.\n",Category.OTHER,""));
        listData.add(new Item("Spillway", "It is not heavily harvested and no varieties or hybrids have been created. The wood of the Winged elm is however put to good use in making furniture, particularly when curved pieces are required. " +
                "The wood is quite strong and does not split easily. The wood exhibits interesting patterns, making it useful as flooring. The main reason that there is not more of a commercial market for the Winged elm is probably because there are so many other hardwood species.",Category.OTHER,""));
        listData.add(new Item("Gas Line", "maybe id something else??",Category.OTHER,""));
        listData.add(new Item("BlackBerry", "Red oak wood is one of the main type of wood used for timber in the eastern United States. Because of its ability to tolerate many conditions, it is planted in many cities and urban areas. It is often planted for landscaping.\n" +
                "A very large Northern Red Oak is located in Ashford, Connecticut the trunk's diameter is 8 m (26 ft) \n" +
                "Most species of oaks live over 200 years. There are certain trees that can survive over a thousand years.\n",Category.PLANTS,""));
        listData.add(new Item("Poison Ivy", "Seeds are eaten by several species of birds. The bark is occasionally food for rabbits, beavers, and porcupines. \n" +
                "Cavity excavating and nesting birds often use White Ash. \n" +
                "This tree attracts wood ducks, bobwhites, purples finches, pine grosbeaks, fox squirrels, rabbits, beavers, mice, and porcupines. \n" +
                "It is used to make things like baseball bats, hockey sticks, and furniture.\n",Category.PLANTS,""));
        listData.add(new Item("Black Locust", "It is not heavily harvested and no varieties or hybrids have been created. The wood of the Winged elm is however put to good use in making furniture, particularly when curved pieces are required. " +
                "The wood is quite strong and does not split easily. The wood exhibits interesting patterns, making it useful as flooring. The main reason that there is not more of a commercial market for the Winged elm is probably because there are so many other hardwood species.",Category.PLANTS,""));
        listData.add(new Item("Honey Suckle", "maybe id something else??",Category.PLANTS,""));
        listData.add(new Item("May Apple", "It is used primarily as an ornamental tree, forming a rounded canopy, it is one of the best oaks for gardens, parks and to provide shade along streets.  The wood is used for pulp and paper production, but also for lumber; it is often marketed as \"red oak\" wood.\n" +
                "This oak species provides acorn food to ducks, squirrels, deer and turkeys as well as blue jays and redheaded woodpeckers. Grackles, flickers, mice and flying squirrels utilize the tree for nesting or general habitat.\n",Category.TREES,""));
        listData.add(new Item("Virginia Creeper", "The acorns are much less bitter than the acorns of red oaks. They are small relative to most oaks, but are a valuable wildlife food, notably for turkeys, wood ducks, pheasants, grackles, jays, nuthatches, thrushes, woodpeckers, rabbits, squirrels, and deer. \n" +
                "The trees also offer shade and shelter, leaves and twigs for building nests and even for eating, and participate in the globe’s exchange of oxygen and carbon dioxide as well as in how water moves through an ecosystem.\n",Category.PLANTS,""));

        listData.add(new Item("Red Oak", "Red oak wood is one of the main type of wood used for timber in the eastern United States. Because of its ability to tolerate many conditions, it is planted in many cities and urban areas. It is often planted for landscaping.\n" +
                "A very large Northern Red Oak is located in Ashford, Connecticut the trunk's diameter is 8 m (26 ft) \n" +
                "Most species of oaks live over 200 years. There are certain trees that can survive over a thousand years.\n",Category.TREES,""));
        listData.add(new Item("Young Ash", "Seeds are eaten by several species of birds. The bark is occasionally food for rabbits, beavers, and porcupines. \n" +
                "Cavity excavating and nesting birds often use White Ash. \n" +
                "This tree attracts wood ducks, bobwhites, purples finches, pine grosbeaks, fox squirrels, rabbits, beavers, mice, and porcupines. \n" +
                "It is used to make things like baseball bats, hockey sticks, and furniture.\n",Category.TREES,""));
        listData.add(new Item("Winged Elm", "It is not heavily harvested and no varieties or hybrids have been created. The wood of the Winged elm is however put to good use in making furniture, particularly when curved pieces are required. " +
                "The wood is quite strong and does not split easily. The wood exhibits interesting patterns, making it useful as flooring. The main reason that there is not more of a commercial market for the Winged elm is probably because there are so many other hardwood species.",Category.TREES,""));
        listData.add(new Item("Cedar", "maybe id something else??",Category.TREES,""));
        listData.add(new Item("Willow Oak", "It is used primarily as an ornamental tree, forming a rounded canopy, it is one of the best oaks for gardens, parks and to provide shade along streets.  The wood is used for pulp and paper production, but also for lumber; it is often marketed as \"red oak\" wood.\n" +
                "This oak species provides acorn food to ducks, squirrels, deer and turkeys as well as blue jays and redheaded woodpeckers. Grackles, flickers, mice and flying squirrels utilize the tree for nesting or general habitat.\n",Category.TREES,""));
        listData.add(new Item("White Oak", "The acorns are much less bitter than the acorns of red oaks. They are small relative to most oaks, but are a valuable wildlife food, notably for turkeys, wood ducks, pheasants, grackles, jays, nuthatches, thrushes, woodpeckers, rabbits, squirrels, and deer. \n" +
                "The trees also offer shade and shelter, leaves and twigs for building nests and even for eating, and participate in the globe’s exchange of oxygen and carbon dioxide as well as in how water moves through an ecosystem.\n",Category.TREES,""));
    }

    public ArrayList<Item> getCategoryListData(String category) {
       ArrayList<Item> categoryListData = new ArrayList<>();
        for(Item i : listData){
            if(i.getCategory().toString().equalsIgnoreCase(category)){
                categoryListData.add(i);
            }
        }
        return categoryListData;
    }
    public int getItemLocation(String barcode){
        for(int i =0; i < listData.size(); i++){
            if(listData.get(i).getBarcode().equalsIgnoreCase(barcode)){
                return i;
            }
        }
        return listData.size();
    }

    public Category getItemCategory(int position){
        return listData.get(position).getCategory();
    }
}
