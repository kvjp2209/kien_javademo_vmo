package com.company.java_collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String args[]) {
        //Những điểm quan trọng về lớp HashMap trong java là:
        //
        //HashMap lưu trữ dữ liệu dưới dạng cặp key và value.
        //Nó chứa các key duy nhất.
        //Nó có thể có 1 key là null và nhiều giá trị null.
        //Nó duy trì các phần tử KHÔNG theo thứ tự.

        // init map

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        // add elements to map
        map.put(1, "Java");
        map.put(3, "C++");
        map.put(2, "PHP");
        map.put(4, "Python");
        // show map
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

}

