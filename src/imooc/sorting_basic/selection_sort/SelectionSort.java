package imooc.sorting_basic.selection_sort;

public class SelectionSort {

    public static int[] sort (int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int minIndex = i;
                if (array[j] < array[i]) {
                    minIndex = j;
                }
                swap(array,i,minIndex);
            }
        }
        return array;
    }

    private static void swap (int[] arr, int i, int minIndex) {
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;

    }

}
