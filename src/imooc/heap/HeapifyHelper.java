package imooc.heap;

public class HeapifyHelper {

    public static void main(String[] args) {

//        int[] array = HeapHelper.generateArray(1,11);
        int[] array = {6,1,4,2,10,1,1,11,3,9,9};
        HeapHelper.output(array);
        MaxHeap heapify = new MaxHeap(array,11);
        heapify.output();
    }

}
