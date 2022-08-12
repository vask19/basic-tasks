package loop.tasks10_20;

public class Ex10 {

    public static void main(String[] args) {
        for (int i = 0; i< 5; i++){
            System.out.print("* ");
        }

        System.out.println();
        System.out.println();

        for (int i = 0;i< 2; i++){
            for (int j = 0;j<5; j++){
                System.out.print("* ");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println();

        for (int i = 0;i<5;i++){
            System.out.println("*");
        }

        System.out.println();
        for (int i = 0 ;i<5;i++){
            for (int j =0;j<2;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();



        for (int i = 0;i<5;i++){
            for (int j =0;j<i;j++){
                System.out.println("-");
            }
            System.out.println("*");
        }


        System.out.println();


        for (int i =0;i<5;i++){
            for (int j =0;j<i;j++){
                System.out.print("-");
            }
            System.out.print("*");
        }

        for (int i = 0;i<=5;i++){
            if (i%2 == 0)
                System.out.print(" ");
            for (int j = 0;j<7;j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }



}
