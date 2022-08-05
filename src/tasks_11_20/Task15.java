package tasks_11_20;

public class Task15 {





    private static int findMaxValue(int a,int b, int c){
        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;

        return max;

    }
}
