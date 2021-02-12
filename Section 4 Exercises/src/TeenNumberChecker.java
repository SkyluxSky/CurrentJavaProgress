public class TeenNumberChecker {

    //checks if number is in the range of teens
    public static boolean hasTeen(int valueOne, int valueTwo, int valueThree){
        return isTeen(valueOne) || isTeen(valueTwo) || isTeen(valueThree);
    }

    public static boolean isTeen(int inRange){
        return (inRange >= 13 && inRange <= 19);
    }
}
