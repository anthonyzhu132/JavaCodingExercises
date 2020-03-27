public class AreaCalculator {
    public static double area (double radius) {
    if (radius < 0) {
        return -1;
    }
    double totalArea = radius * radius * Math.PI;
    return totalArea;
    }

}
