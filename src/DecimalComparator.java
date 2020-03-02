public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double numberOne, double numberTwo) {
        int num1 = (int)(numberOne*1000);
        int num2 = (int)(numberTwo*1000); // Using casting (int) to make the numbers behave as the same number type
        return num1 == num2;
    }
}
