package com.brandon.myapplication;

/**
 * Created by bs2690 on 7/8/2016.
 */
public enum Category {
    TREES(0) {
        @Override
        public String toString(){
            return "Trees";
        }
    },
    PLANTS(1){
        @Override
        public String toString(){
            return "Plants";
        }
    },
    OTHER(2){
        @Override
        public String toString(){
            return "Other";
        }
    };

    private final int position;
    private Category(int position) {
        this.position = position;
    }
    public int getPositon(){
        return this.position;
    }
}

