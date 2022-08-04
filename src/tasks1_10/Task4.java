package tasks1_10;

public class Task4 {

    public static void run(){
        float a = 1.1f;
        float b = 2.3f;

        System.out.println("Multiplication: " + multiplication(a,b));
        System.out.println("Sum: " + sum(a,b));
        System.out.println("Difference: " + multiplication(a,b));
    }

    private static float multiplication(float a, float b){
        return a * b;

    }
    private static float sum(float a, float b){
        return a + b;

    }
    private static float difference(float a, float b){

        return a - b;

    }
}
