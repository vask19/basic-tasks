package loop.tasks10_20;

public class Ex17 {
    public static void main(String[] args) {
        int num = 22213233;

        var c = (int)Math.pow(10,(num + "").length()-1);
        int last = num%10;
        int first =(num/c);
        int newNum = num - (first * c) - last + first + (last * c);

        System.out.println(newNum);





    }
}
