package com.brandon.myapplication;

/**
 * Created by bs2690 on 7/8/2016.
 */
public enum Category {
    TREES {
        @Override
        public String toString(){
            return "Trees";
        }
    },
    PLANTS{
        @Override
        public String toString(){
            return "Plants";
        }
    },
    OTHER{
        @Override
        public String toString(){
            return "Other";
        }
    }
}

