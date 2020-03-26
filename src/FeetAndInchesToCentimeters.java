public class FeetAndInchesToCentimeters {
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if((feet < 0) || ((inches < 0) && (inches > 12))) {
            System.out.println("Error, please input valid measurements");
            return -1;
        }

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " + feet, " + " inches " + centimeters + " cm");
        return centimeters;
    }
}
