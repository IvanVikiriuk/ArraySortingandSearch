package app;

import java.util.Scanner;

public class Main {
    static int count;

    public static void main(String[] args) {

        count = 0;

        int[] numbers = {45, 32, 78, 12, 88, 2, 65, 34, 98, 7, 55, 23, 67, 41, 91};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input int numbers: ");
        int n = scanner.nextInt();
        System.out.println("The initial view of the array: ");
        {
            for (int element : numbers)
                System.out.print(element + " ");
        }

        for (int i = 1; i < numbers.length; i++) {
            int key = numbers[i];
            int j = i - 1;
            while (j >= 0 && key < numbers[j]) {
                numbers[j + 1] = numbers[j];
                j--;
            }

            numbers[j + 1] = key;
        }

        System.out.println("\nSorted array: ");
        {
            for (int element : numbers)
                System.out.print(element + " ");
        }
        int[] sortedArray = new int[]{2, 7, 12, 23, 32, 34, 41, 45, 55, 65, 67, 78, 88, 91, 98};
        int key = 34;
        int low = 0;
        int high = sortedArray.length - 1;
        int index = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (sortedArray[mid] == key) {
                index = mid;
                break;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (index == -1)
            System.out.println("\nNumbers search: " + n + key);
        else
            System.out.println("\nNumbers search: " + key + " index " + index);

    }
}












