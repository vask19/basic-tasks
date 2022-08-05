package tasks_11_20;

public class Task11 {

    /*
    * Write a program that subtract one variable from other:
• define a function that take two integer variables and return they
subtraction result
• call previously defined function with parameters values 123 and 111
• print result on console*/


    public static void run(){
        System.out.println(subtract(123,111));
    }

    public  static int subtract(int a,int b){
        return a-b;

    }
}
