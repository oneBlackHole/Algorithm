package order;

import java.util.Arrays;

public abstract class AbstratSelection {

    private static final int[] DEFAULT_ARR = {1,6,6,5,3,4,12,32,48,4,9,10};

    int[] arr;

    public AbstratSelection(int[] arr) {
        if(arr == null || arr.length == 0){
            this.arr = DEFAULT_ARR;
        }else{
            this.arr = arr;
        }

    }

    public abstract void sort();

    public int compareTo(int a, int b){
        if(a == b){
            return 0;
        }
        return a < b ? -1 : 1;
    }

    public boolean less(int a, int b){
        return compareTo(a,b) < 0;
    }

    public boolean more(int a, int b){
        return compareTo(a,b) > 0;
    }

    public void exch(int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public void show() {
        String info = "[ " + this.getClass().getSimpleName() + " ]" + "\tSelection{" + "arr=" + Arrays.toString(arr) + '}';
        System.out.println(info);
    }
}
