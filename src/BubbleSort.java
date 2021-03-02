public class BubbleSort implements Sorter {

    public void sort(int[] arr) {
        for (int last = arr.length-2; last > 0; last--) {
            for (int j = 0; j <= last; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
