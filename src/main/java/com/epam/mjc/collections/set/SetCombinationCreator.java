package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> answ = new TreeSet<>();
        for (String str:firstSet
             ) {
            if (secondSet.contains(str)&&!thirdSet.contains(str)){
                answ.add(str);
            }
        }
        for (String str: thirdSet
             ) {
            if (!firstSet.contains(str)&& !secondSet.contains(str)){
                answ.add(str);
            }
        }
        return answ;
    }
}
