package tasks_11_20;

import java.util.Scanner;

public class Task22 {



    public static void run(){
        Scanner scanner = new Scanner(System.in);
        int a,b;
        System.out.println("Enter a: ");
        a = scanner.nextInt();
        System.out.println("Enter b: ");
        b = scanner.nextInt();

        if (a > b )
            System.out.println("a is more than b");
        else if (a < b)
            System.out.println("a is less than b");
        else System.out.println("a is equal b");

    }



}
