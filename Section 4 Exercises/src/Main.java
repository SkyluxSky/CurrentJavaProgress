public class Main {

    public static void main(String[] args) {

        MegaBytesConverter.printMegaBytesAndKiloBytes(4200);

        boolean wakeUp = BarkingDog.shouldWakeUp(true,23);
        System.out.println(wakeUp);

        boolean Leap = LeapYear.isLeapYear(4266);
        System.out.println("Leap Year = " + Leap);

        EqualSumChecker.hasEqualSum(7,6,13);
    }
}
