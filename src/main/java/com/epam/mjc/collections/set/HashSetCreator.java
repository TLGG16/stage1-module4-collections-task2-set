package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> answ = new HashSet<>();
        for (Integer i: sourceList
             ) {
            if (i%2==0){
                int buf = i;
                answ.add(buf);
                do {
                    buf/=2;
                    answ.add(buf);
                } while (buf%2==0);
            }else {
                answ.add(i);
                answ.add(i*2);
            }
        }
        return answ;
    }
}
