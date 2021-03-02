public class DoubleSelectionSort implements Sorter {

    public void sort(int[] arr) {
        int size = arr.length, temp;
        for (int i = 0; i < size/2 - 1; i++) {
            int min_idx = i, max_idx = size-1-i;
            for (int j = i + 1; j < size-i; j++) {
                if ( arr[j]        <  arr[min_idx] ) { min_idx = j; }
                if ( arr[size-j-1] >  arr[max_idx] ) { max_idx = size-j-1; }

            }
            temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;

            temp = arr[max_idx];
            arr[max_idx] = arr[size-1-i];
            arr[size-1-i] = temp;
        }
    }
}
