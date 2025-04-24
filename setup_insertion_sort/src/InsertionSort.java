public class InsertionSort {
    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int current = list[i];
            int j = i - 1;

            // Dịch chuyển các phần tử lớn hơn current sang phải
            while (j >= 0 && list[j] > current) {
                list[j + 1] = list[j];
                j--;
            }

            // Chèn current vào đúng vị trí
            list[j + 1] = current;
        }
    }


    public static void main(String[] args) {
        int[] list = {5, 3, 1, 4, 2};

        System.out.println("Trước khi sắp xếp:");
        printArray(list);

        insertionSort(list);

        System.out.println("Sau khi sắp xếp:");
        printArray(list);
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
