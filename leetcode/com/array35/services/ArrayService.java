package leetcode.com.array35.services;

import leetcode.com.array35.classes.Array;

public final class ArrayService {
    public void displayArray(final Array array) {
        for (int value : array.getData()) {
            System.out.print(value + " ");
        }
    }

    public int binarySearch(final int value, final Array array) {
        if (array == null) {
            return -1;
        }

        final int[] data = array.getData();
        int right = data.length - 1;
        int left = 0;

        while (left <= right) {
           final int middle = left + (right - left) / 2;
           if (data[middle] < value) {
               left = middle + 1;
           } else {
               right = middle - 1;

           }
        }
        return left;
    }
}
