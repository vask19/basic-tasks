package tasks_11_20;

public class Task14 {


    public static void run(){
        System.out.println(equation(123,324,30));
    }


    private static double equation(int a, int b, int c){
        if (c == 0) return -1;
        return a * b / c;
    }
}
