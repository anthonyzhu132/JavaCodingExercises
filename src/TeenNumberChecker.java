public class TeenNumberChecker {
    public static boolean hasTeen(int one, int two, int three) {
        if(isTeen(one) || isTeen(two) || isTeen(three)) {
            return true;
        }
        return false;
    }

    public static boolean isTeen(int age) {
        if(age >= 13 && age <= 19) {
            return true;
        }
        return false;
    }
}
