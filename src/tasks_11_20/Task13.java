package tasks_11_20;

public class Task13 {



    public static void run(){
        System.out.println(divide(12,4));
    }


    private static int divide(int a, int b){
        if (b != 0){
            return -1;
        }
        return a/b;
    }
}
