package imooc.heap;

public class MaxHeap {

    private int[] data;
    private int count;

    public MaxHeap(int capacity) {
        data = new int[capacity+1];
        count = 0;
    }

    public MaxHeap(int[] arr, int n) {
        data = new int[n+1];
        for (int i = 0; i < n ; i++) {
            data[i+1] = arr[i];
        }
        count = n;

        for (int i = count/2; i >= 1; i--) {
            shiftDown(i);
        }
    }

    public int getSize() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void insert (int newElement) {
        data[count+1] = newElement;
        count++;
        shiftUp(count);
    }

    public int extractMax() {
        assert(!isEmpty());
        int max = data[1];
        shiftDown();
        count--;
        return max;
    }

    private void shiftDown() {
        swap(data,1,count);
        int i = 1;
        while (i+i+1<count) { //只要还有子节点就要进入循环
            if (i+i == count && data[i+i] > data [i]) {
                swap(data,i,i+i);
                break;
            }

            if (data[i] > data[i+i] && data[i] > data[i+i+1]) {
                break;
            }

            if (data[i+i] > data[i+i+1]) {
                swap(data,i,i+i);
                i = i+i;
            }else {
                swap(data,i,i+i+1);
                i = i+i+1;
            }
        }
    }

    private void shiftDown(int position) {
        int i = position;
        while (i+i+1<=count) { //只要还有子节点就要进入循环
            if (i+i == count && data[i+i] > data [i]) {
                swap(data,i,i+i);
                break;
            }

            if (data[i] > data[i+i] && data[i] > data[i+i+1]) {
                break;
            }

            if (data[i+i] > data[i+i+1]) {
                swap(data,i,i+i);
                i = i+i;
            }else {
                swap(data,i,i+i+1);
                i = i+i+1;
            }
        }
    }

    private void shiftUp(int currentCount) {

        while (currentCount > 0 ) {
            if (getParent(currentCount) == 0 || data[getParent(currentCount)] > data[currentCount]) {
                break;
            }
            swap(data,getParent(currentCount),currentCount);
            currentCount = getParent(currentCount);
        }

    }

    private int getParent(int currentCount) {
        return currentCount/2;
    }

    private static void swap(int[] arr, int l, int n) {
        int temp = arr[l];
        arr[l] = arr[n];
        arr[n] = temp;
    }

    public void output() {
        int n = (int) Math.ceil(Math.log(count)/Math.log(2));
        int printNum = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n+Math.pow(2,i)-i; j++) {
                if (j < n-i){
                    System.out.print("  ");
                }else if (printNum <= count){
                    System.out.print(data[printNum] + " ");
                    printNum++;
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("--------------------------");
        for (int i = 1; i <= count; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
