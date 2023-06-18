package com.epam.mjc.collections.set;

import java.util.*;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> answ = new TreeSet<>();
        for (Integer i: sourceList
             ) {
            answ.add(i*i);
        }

        return answ.subSet(lowerBound,true ,upperBound, true);
    }
}
