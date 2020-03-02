public class TeenNumberChecker {
    public static boolean hasTeen(int one, int two, int three) {
        if(isTeen(one) || isTeen(two) || isTeen(three)) { // If either of the 3 integers are true, then return true, otherwise return false
            return true; // uses isTeen to check if the age is correct for each, minimizing code
        }
        return false;
    }

    public static boolean isTeen(int age) {
        if(age >= 13 && age <= 19) { //method takes one parameter and checks if the integer is between 13 and 19, if it is then return true, leads to hasTeen to check easier
            return true;
        }
        return false;
    }
}
