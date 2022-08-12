package tasks21_30;

public class Task26 {

    public void run(){
        System.out.println(Rectangle.perimeter(40,100));
    }



}

class Rectangle{


    public static long perimeter(int a,int b){
        return 2 * (a + b);
    }
}
