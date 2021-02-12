public class BarkingDog {

    public static boolean shouldWakeUp (boolean isBarking, int hoursOfDay){

        if(hoursOfDay > 23 || hoursOfDay < 0){
            return false;

        } else {

            if (isBarking && hoursOfDay < 8 || isBarking && hoursOfDay > 22) {
                return true;

            } else {
                return false;
            }
        }
    }
}
