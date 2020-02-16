package imooc.sorting_basic.insertion_sort_improved;

public class InsertionSortImproved {

    public static int[] sort (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int e = arr[i];
            int j = i;
            for ( ; j > 0; j--) {
                if (arr[j-1] > e) {
                    arr[j] = arr[j-1];
                }
                else {
                    break;
                }
            }
            arr[j] = e;
        }
        return arr;
    }

}
