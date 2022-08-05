package tasks_11_20;

import java.util.Random;

public class Task16 {


    /*
    * Write  a  program  that  generate  random  number  in  range  from  1  to  10  and
    check  if  generated  value  more  than  5  print  ”yes”  otherwise  print  ”no”
    *
    * */

    public static void run() {
        System.out.println(checkIfValMoreOfFive(generateValue(10)));
    }



    private static int generateValue(int limit){
        Random random = new Random();
        return random.nextInt(limit);
    }
    private static String  checkIfValMoreOfFive(int v){
        return v > 5 ? "yes" : "no";

    }
}
