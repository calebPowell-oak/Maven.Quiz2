package com.zipcodewilmington.assessment2.part1;

import com.j256.ormlite.stmt.query.In;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        return array.length % 2 == 0;
    }

    public Integer[] range(int start, int stop) {
        Integer[] ans = new Integer[Math.abs(start - stop)+1];
        if (start < stop){
            for (int i = start; i <= stop; i++) {
                ans[i - start] = i;
            }
        } else {
            for (int i = 0; i >= start - stop; i++) {
                ans[i] = start - i;
            }
        }
        return ans;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        return array[0] + array[1];
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        return array[array.length - 1] * array[array.length - 2];
    }
}
