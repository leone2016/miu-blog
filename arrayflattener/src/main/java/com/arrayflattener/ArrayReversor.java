package com.arrayflattener;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayReversor {

    private final ArrayFlattenerService flattenerService;

    public ArrayReversor(ArrayFlattenerService flattenerService) {
        this.flattenerService = flattenerService;
    }

    public int[] reverseArray(int[][] input) {
        int[] flattened = flattenerService.flattenArray(input);
        if (flattened == null) return null;

        List<Integer> list = new ArrayList<>();
        for (int num : flattened) list.add(num);

        Collections.reverse(list);

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
