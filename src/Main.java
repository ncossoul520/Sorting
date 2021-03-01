import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        sortCircles();
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
