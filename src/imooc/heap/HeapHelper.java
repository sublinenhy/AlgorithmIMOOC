package imooc.heap;

import java.util.Random;

public class HeapHelper {

    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(100);
        int[] array = generateArray(1,11);
//        int[] array = {3,10,5,3,3,1,3,4,1,7};
        for (int item : array) {
            System.out.print(item + " ");
        }
        System.out.println("###################");

        for (int value : array) {
            maxHeap.insert(value);
        }
        maxHeap.output();
        System.out.println("##################");

        System.out.println(maxHeap.extractMax());
        maxHeap.output();

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

    public static void output (int[] arr) {
        for (int i: arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }


}
