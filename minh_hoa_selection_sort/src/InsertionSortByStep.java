import java.util.Scanner;

public class InsertionSortByStep {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng: ");
        int n = input.nextInt();

        int[] array = new int[n];

        System.out.println("Nhập " + n + " số nguyên:");
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }

        System.out.println("Mảng ban đầu:");
        printArray(array);

        insertionSort(array);
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int currentElement = array[i];
            int j = i - 1;

            System.out.println("Chèn phần tử " + currentElement + " vào vị trí thích hợp:");

            while (j >= 0 && array[j] > currentElement) {
                array[j + 1] = array[j]; // đẩy phần tử sang phải
                j--;
            }

            array[j + 1] = currentElement;

            System.out.print("Mảng sau bước " + i + ": ");
            printArray(array);
        }
    }

    public static void printArray(int[] array) {
        for (int number : array) {
            System.out.print(number + "\t");
        }
        System.out.println();
    }
}
