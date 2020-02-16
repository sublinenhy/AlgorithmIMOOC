package imooc.sorting_advance.quick_sort_random;

import java.util.Random;

public class QuickSortRandomHelper {

    public static void main(String[] args) {
        int[] arr = generateArray(1,10);
        output(arr);
        int[] res = QuickSortRandom.sort(arr,0, arr.length-1);
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
