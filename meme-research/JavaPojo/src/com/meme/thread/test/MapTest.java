package com.meme.thread.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhangb on 18/12/2015.
 */
public class MapTest {
    public static void main(String[] args){
        Map<String,List<Integer>> testMap = new HashMap<String,List<Integer>>();
        List<Integer> testList = new ArrayList<Integer>();

        String key = "key1";

        testMap.put(key, testList);

        testList.add(1);
        testList.add(2);
        testList.add(3);
        testList.add(4);

        System.out.println(testMap);

    }
}
