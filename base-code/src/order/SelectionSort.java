package order;

/**
 * 选择排序
 */
public class SelectionSort extends AbstratSelection {

    public SelectionSort(int[] arr) {
        super(arr);
    }

    @Override
    public void sort() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if(more(arr[i],arr[j])){
                    exch(i,j);
                }
            }
        }
    }

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort(null);

        selectionSort.sort();

        selectionSort.show();
    }
}
