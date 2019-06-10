package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;

import com.j256.ormlite.stmt.query.In;
import com.sun.deploy.util.ArrayUtil;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer[] ans = new Integer[array1.length + array2.length];
        for(int i = 0; i < array1.length; i++){
            ans[i] = array1[i];
        }
        for(int i = array1.length; i < array1.length + array2.length; i++){
            ans[i] = array2[i - array1.length];
        }
        return ans;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        Integer[] ans = new Integer[array.length];
        int ct = 0;
        for(int i = index; i < array.length; i++){
            ans[i - index] = array[i];
            ct++;
        }
        for(int j = 0; j < index; j++){
            ans[ct] = array[j];
            ct++;
        }
        return ans;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        Integer count = 0;
        for(Integer i : array1){
            if(i == valueToEvaluate){
                count++;
            }
        }
        for(Integer i : array2){
            if(i == valueToEvaluate){
                count++;
            }
        }
        return count;
    }

    public Integer mostCommon(Integer[] array) {
        HashMap<Integer, Integer> map = new HashMap<>(0);
        Integer largest = 0, key = 0;
        for(Integer i : array){
            if(map.containsKey(i)){
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        for(Integer i : map.keySet()){
            if(map.get(i) > largest){
                largest = map.get(i);
                key = i;
            }
        }
        return key;
    }
}
