package imooc.sorting_advance.quick_sort_double;

import java.util.Random;

public class QuickSortDouble {

    public static int[] sort (int[] arr, int l, int r) {
        quickSortDouble(arr,l,r);
        return arr;
    }

    private static void quickSortDouble(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }
        int p = partition(arr,l,r);
        quickSortDouble(arr,l,p-1);
        quickSortDouble(arr,p+1,r);

    }

    private static int partition(int[] arr, int l, int r) {
        Random random = new Random();
        int n = random.nextInt(r-l)+l;
        int i= l+1;
        int j = r;
        swap(arr,l,n);
        int v = arr[l];
        while(true) {

            // 注意这里的边界, arr[i] < v, 不能是arr[i] <= v
            // 因为当出现连续的相同的数的话，取了等号会造成i持续左移，而j不动，造成子树不平衡
            // 所以要么两个都不取等，要么都取等
            while (i <= r && arr[i] < v ) {
                i++;
            }

            while (j >= l+1 && arr[j] > v) {
                j--;
            }

            if (i > j) {
                break;
            }
            swap(arr,i,j);
            i++;
            j--;
        }
        swap(arr,l,j);
        return j;

    }

    private static void swap(int[] arr, int l, int n) {
        int temp = arr[l];
        arr[l] = arr[n];
        arr[n] = temp;
    }

}
