package imooc.sorting_advance.quick_sort_random;

import java.util.Random;

public class QuickSortRandom {

    public static int[] sort (int[] arr, int l, int r) {
        quickSort (arr, l, r);
        return arr;
    }

    private static void quickSort(int[] arr, int l, int r) {

        if (l >= r) {
            return;   //将判断条件改为r-l<=3,再在这个小区间内进行插入排序
        }

        int p = partition (arr, l, r);
        quickSort(arr, l, p-1);
        quickSort(arr, p+1, r);

    }

    private static int partition(int[] arr, int l, int r) {
        Random random = new Random();
        swap(arr,l,random.nextInt(r-l)+l); //改进点，随机选择要比较的数

        int j = l+1;
        for (int i = l+1; i <= r; i++) {

            if (arr[i] < arr[l]) {
                swap(arr, i, j);
                j++;
            }
        }
        swap(arr,l,j-1);
        return j-1;
    }

    private static void swap (int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
