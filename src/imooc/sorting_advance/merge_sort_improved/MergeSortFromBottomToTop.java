package imooc.sorting_advance.merge_sort_improved;

public class MergeSortFromBottomToTop {

    public static int[] sort (int[] arr) {
        for (int size = 1; size <= arr.length; size += size) {
            for (int i = 0; i+size < arr.length; i += size+size) {
                merge(arr,i,i+size-1,Math.min(i+size+size-1,arr.length-1));
            }
        }
        return arr;
    }

    private static void merge(int[] arr, int l, int mid, int r) {
        int[] aux = new int[r-l+1];
        for (int i = l; i <= r; i++) {
            aux[i-l] = arr[i];
        }
        int k = l;
        int p = l;
        int q = mid+1;
        for (; k <= r; k++) {
            if (p > mid) {
                arr[k] = aux[q-l];
                q++;
            }else if (q > r) {
                arr[k] = aux[p-l];
                p++;
            }else if (aux[p-l] < aux[q-l]) {
                arr[k] = aux[p-l];
                p++;
            }else {
                arr[k] = aux[q-l];
                q++;
            }
        }

    }

}
