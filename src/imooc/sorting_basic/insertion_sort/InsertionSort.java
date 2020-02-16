package imooc.sorting_basic.insertion_sort;

public class InsertionSort {

    public static int[] sort (int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j --) {
                if (arr[j] < arr[j-1]) {
                    swap(arr,j,j-1);
                }
                else {
                    break;
                }
            }

        }
        return arr;
    }

    private static void swap (int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

}
