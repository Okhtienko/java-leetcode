package leetcode.com.array1920.classes;

import leetcode.com.array1920.classes.Array;
import leetcode.com.array1920.services.ArrayService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size array: ");
        int size = scanner.nextInt();

        Array array = new Array(size);
        ArrayService arrayService = new ArrayService();
        arrayService.fillArrayRandomNumbers(array);

        System.out.print("Input array: ");
        arrayService.displayArray(array);

        System.out.print("\nOutput array: ");
        arrayService.displayArray(arrayService.buildArray(array));
    }
}
