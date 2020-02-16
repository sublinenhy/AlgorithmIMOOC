package imooc.sorting_advance.merge_sort;

public class MergeSort {

    public static int[] sort (int[] arr) {
        mergeSort(arr,0,arr.length-1);
        return arr;
    }

    private static void mergeSort(int[] arr, int l, int r) {

        if (l >= r) {
            return;
        }

        int mid = (l+r) / 2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
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
