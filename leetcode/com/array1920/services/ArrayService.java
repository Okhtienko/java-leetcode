package leetcode.com.array1920.services;

import leetcode.com.array1920.classes.Array;
import java.util.Random;

public final class ArrayService {

    public void displayArray(final Array array) {
        for (int value: array.getData()) {
            System.out.print(value + " ");
        }
    }

    public void fillArrayRandomNumbers(final Array array) {
        final int[] data = array.getData();
        Random random = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(data.length);
        }
    }

    public Array buildArray(final Array array) {
        final int[] buffer = array.getData();
        int[] data = new int[array.getSize()];
        for (int i = 0; i < data.length; i++) {
            data[i] = buffer[buffer[i]];
        }
        return new Array(data);
    }
}
