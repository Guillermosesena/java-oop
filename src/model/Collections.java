package model;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        Map<Integer, String> treeMap = new TreeMap<Integer, String>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();

        map.put(1,"one");
        map.put(2,"two");
        // Prints Map using a Iterator
        Iterator it = map.keySet().iterator();
        while(it.hasNext()){
            Integer key = (Integer) it.next();
            System.out.println("Clave: " + key + " -> Valor: " + map.get(key));
        }


        linkedHashMap.put(3,"three");
        linkedHashMap.put(4,"four");
        // Prints Map using a Iterator
        Iterator it_ = linkedHashMap.keySet().iterator();
        while(it_.hasNext()){
            Integer key_ = (Integer) it_.next();
            System.out.println("Clave: " + key_ + " -> Valor: " + linkedHashMap.get(key_));
        }

        treeMap.put(5,"five");
        treeMap.put(6,"six");
        // Prints Map using a Iterator
        Iterator it__ = treeMap.keySet().iterator();
        while(it__.hasNext()){
            Integer key__ = (Integer) it__.next();
            System.out.println("Clave: " + key__+ " -> Valor: " + treeMap.get(key__));
        }

    }


}
