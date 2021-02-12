public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double myFirstDouble, double mySecondDouble){

        //Casting int
        int myFirstCheck = (int)(myFirstDouble * 1000);
        int mySecondCheck = (int)(mySecondDouble * 1000);

        if(myFirstCheck == mySecondCheck){
           return true;
        } else {
           return false;
        }

    }

}
