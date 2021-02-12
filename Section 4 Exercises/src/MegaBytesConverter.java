public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kilobytes){

        if(kilobytes < 0){
            System.out.println("Invalid Value");
        } else {
            int megabytes = (kilobytes/1024);
            //Modulo operator is sometimes referred to as the remainder operator.
            //Ex. [2500 mod 1024] or [2500 / 1024] = a remainder of 452
            int RemainingKilobytes = (kilobytes%1024);
            System.out.println(kilobytes + " KB = " + megabytes + " MB and " + RemainingKilobytes + " KB");
        }
    }

}
