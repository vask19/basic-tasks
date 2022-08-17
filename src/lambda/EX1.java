package lambda;

public class EX1 {

    public static int result(int a,int b,Comparator comparator){
        return comparator.compareTo(a,b);

    }

    public static void main(String[] args) {
        System.out.println(result(5,6,((a, b) -> {return a + b;})));
        System.out.println(result(10,11,(a,b) ->{return a % b;}));
    }


}



interface Comparator{
    int compareTo(int a,int b);
}
