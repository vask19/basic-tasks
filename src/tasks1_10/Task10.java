package tasks1_10;


/*• define a function that take two integer variables and return they
sum
• call previously defined function with parameters values 345 and 6
• print result on console*/

public class Task10 {



    public static void run(int a,int b){
        System.out.println(sum(a,b));
    }




    private static int sum(int a,int b){
        return a+b;

    }
}

