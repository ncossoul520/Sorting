import java.util.ArrayList;
import  java.lang.*;
import java.util.Arrays;

public class Main {
    private static final int NUM_TRIALS = 1000;

    public static void main(String[] args) {
//        sortCircles();
        ArrayList<Sorter> sorters = new ArrayList<>();
        sorters.add( new SelectionSort() );
        sorters.add( new DoubleSelectionSort() );
        sorters.add( new InsertionSort() );
        sorters.add( new BubbleSort() );

        for (Sorter sort : sorters) {
//            double time = testOnSize(sort, 20, 1);
//            System.out.println("------------" + sort.getName() + "-------------");
            for (int size = 2; size <= 20; size += 1) {
                double time = testOnSize(sort, size, NUM_TRIALS);
                System.out.println(size + ", " + time);
            }
        }

    }

    private static double testOnSize(Sorter sort, int size, int numTrials) {
        double ellapsedTime = 0.0;
        for (int i = 0; i < numTrials; i++) {
            int[] testArr = generateRandomArray(size, 10);
            long start = System.nanoTime();
            sort.sort(testArr);
//            System.out.println( Arrays.toString( testArr ) );
            long time = System.nanoTime() - start;
            ellapsedTime += time / 1000000.0;  // convert to milliseconds
        }
        return ellapsedTime;
    }

    private static int[] generateRandomArray(int size, int MAX_VAL) {
        int[] out = new int[size];
        for (int i = 0; i < out.length; i++) {
            out[i] = (int) (Math.random() * MAX_VAL);
        }
        return out;
    }

    public static void selectionSort(Comparable[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if ( arr[j].compareTo( arr[min_idx] ) < 0 ) {
                    min_idx = j;
                }
            }
            Comparable temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void sortCircles() {
        Comparable[] circles = new Comparable[10];
        for (int i = 0; i < 10; i++) {
            double radius = Math.random() * 10;
            circles[i] = new Circle(radius);
        }
        selectionSort(circles);
        for (Comparable circle : circles) {
            Circle c = (Circle) (circle);
            System.out.println("Radius: " + c.getRadius());
        }
    }
}
