public class Main {

    public static void main(String[] args) {

        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
        BarkingDog.shouldWakeUp(true, 9);
        LeapYear.isLeapYear(2020);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored" + score + " points");
        return score * 1000;
    }
}