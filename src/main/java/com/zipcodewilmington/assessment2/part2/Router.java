package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Router {
    LinkedHashMap<String, String> map = new LinkedHashMap<>();
    public void add(String path, String controller) {
        map.put(path, controller);
    }

    public Integer size() {
        return map.size();
    }

    public String getController(String path) {
        return map.get(path);
    }

    public void update(String path, String studentController) {
        map.put(path, studentController);
    }

    public void remove(String path) {
        map.remove(path);
    }

    public String toString(){
        String ans = "";
        for(String s : map.keySet()){
            ans += s + map.get(s) + "\n";
        }return ans;
    }
}
