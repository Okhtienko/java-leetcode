package leetcode.com.array35.classes;

import leetcode.com.array35.services.ArrayService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] data = {1, 2, 4, 5, 6, 8, 9};
        Array array = new Array(data);
        ArrayService arrayService = new ArrayService();

        System.out.print("Input array: ");
        arrayService.displayArray(array);

        System.out.print("\nEnter value: ");
        int value = scanner.nextInt();
        System.out.println("Index: " + arrayService.binarySearch(value, array));
    }
}
