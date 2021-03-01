public class Circle implements Comparable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public int compareTo(Comparable circle2) {
        Circle c2 = (Circle) circle2;
        if ( this.radius > c2.getRadius() ) {
            return 1;
        }
        if ( this.radius < c2.getRadius() ) {
            return -1;
        }
        return 0;
    }
}
