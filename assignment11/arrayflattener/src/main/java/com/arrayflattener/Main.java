package com.arrayflattener;

public class Main {
    public static void main(String[] args) {
        int[][] a_in = {{1, 3}, {0}, {4, 5, 9}};
        int[] a_out = new Main().flattenArray(a_in);
        for (int val : a_out) {
            System.out.print(val + " ");
        }

    }

    public int[] flattenArray(int[][] input) {
        if (input == null) return null;

        int size = 0;
        for (int[] row : input) {
            if (row != null) size += row.length;
        }

        int[] result = new int[size];
        int index = 0;
        for (int[] row : input) {
            if (row != null) {
                for (int val : row) {
                    result[index++] = val;
                }
            }
        }
        return result;
    }

}