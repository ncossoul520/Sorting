public class InsertionSort implements Sorter {

    public void sort(int[] arr) {
        int key, key_idx;
        for (int i = 1; i < arr.length; i++) {
            key = arr[i];
            key_idx = i;
            while (key_idx != 0 && key < arr[key_idx-1]) {
                arr[key_idx] = arr[key_idx-1];
                key_idx--;
            }
            arr[key_idx] = key;
        }
    }
}
