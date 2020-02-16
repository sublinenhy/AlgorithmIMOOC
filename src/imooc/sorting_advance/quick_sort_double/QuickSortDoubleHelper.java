package imooc.sorting_advance.quick_sort_double;

import java.util.Random;

public class QuickSortDoubleHelper {

    public static void main(String[] args) {
        int[] arr = generateArray(1,10);
//        int[] arr = {4,6,9,10,3,4,5,7,6,5};

        output(arr);
        int[] res = QuickSortDouble.sort(arr,0, arr.length-1);
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
