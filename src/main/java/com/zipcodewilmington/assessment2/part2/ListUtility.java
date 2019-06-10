package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListUtility {
    ArrayList<Integer> list;
    public ListUtility(){
        list = new ArrayList<>(0);
    }
    public Boolean add(Integer i) {
        return list.add(i);
    }

    public Integer size() {
        return list.size();
    }

    public List<Integer> getUnique() {
        ArrayList<Integer> unique = new ArrayList<>(0);
        for(Integer i : list){
            if(!unique.contains(i)){
                unique.add(i);
            }
        }
        return unique;
    }

    public String join() {
        return list.toString().substring(1, list.toString().length() - 1);
    }

    public Integer mostCommon() {
        Integer[] d = list.toArray(new Integer[list.size()]);
        return new ArrayUtility().mostCommon(d);
    }

    public Boolean contains(Integer valueToAdd) {
        return list.contains(valueToAdd);
    }
}
