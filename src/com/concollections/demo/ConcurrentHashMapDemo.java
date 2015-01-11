package com.concollections.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;


/**
 * Created by ADMIN on 1/11/2015.
 */
public class ConcurrentHashMapDemo {

    public static void main(String[] args) {
        Map<String, Integer> hashMap = new ConcurrentHashMap<String, Integer>();
        hashMap.put("Ronak",12);
        hashMap.put("Hemen",11);
        hashMap.put("dhatri",10);
        hashMap.put("akash",9);

        for (Map.Entry<String, Integer> entry : hashMap.entrySet())
        {
            hashMap.put("test",12);
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

    }
}
