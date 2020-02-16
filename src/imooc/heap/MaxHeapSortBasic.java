package imooc.heap;

public class MaxHeapSortBasic {

    public static void main(String[] args) {
        MaxHeap maxHeapSortBasic = new MaxHeap(30);
        int[] array = HeapHelper.generateArray(1,11);
//        int[] array = {3,10,5,3,3,1,3,4,1,7};
       
        HeapHelper.output(array);
        System.out.println("###################");

        for (int value : array) {
            maxHeapSortBasic.insert(value);
        }
        maxHeapSortBasic.output();

        for (int i = 10; i >= 0 ; i--) {
            array[i] = maxHeapSortBasic.extractMax();
        }
        HeapHelper.output(array);

    }

}
