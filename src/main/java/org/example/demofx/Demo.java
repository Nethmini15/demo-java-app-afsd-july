package org.example.demofx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Demo {
    public static void main(String[] args) {

        ArrayList<Object> list = new ArrayList();
        list.add(20);
        list.add("Viweka");
        list.add(30.48);
        list.add(true);
        list.add(new Object());

        System.out.println(list.get(1));

        System.out.println(list);

        //---------------------------------------------

        PriorityQueue<Integer> queue = new PriorityQueue();
        queue.add(20);
        queue.add(2);
        queue.add(4);
        queue.add(3);

        System.out.println(queue);

        //-----------------------------------------------------

        HashSet set = new HashSet();
        set.add(90);
        set.add(8);
        set.add(5);
        set.add(16);

        System.out.println(set);

        //-------------------------------------------------------

        HashMap<String, Object> map = new HashMap();
        map.put("name", "Viweka");
        map.put("age", 23);
        map.put("address", "Matale");

        System.out.println(map.get("address"));

    }
}
