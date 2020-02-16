package imooc.sorting_basic.selection_sort;

import java.util.Random;

public class SortTestHelper {

    public static void main(String[] args) {
        int[] arr = generateArray(14,33);
        output(arr);
        int[] res = SelectionSort.sort(arr);
        output(res);
    }

    public static void output (int[] arr) {
        for (int i: arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static int[] generateArray (int rangL, int rangR) {
        int n = rangR - rangL + 1;
        int[] arr = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(n) + rangL;
        }
        return arr;
    }

}
