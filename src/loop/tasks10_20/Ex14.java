package loop.tasks10_20;

public class Ex14 {

    public static void main(String[] args) {
        int num = 229345;
        int numLength  = (num + "").length();
        int n = 1;
        for (int i =0;i<numLength-1;i++){
            n *= 10;
        }
        int first = num/n;
        int last = (num) - (num/10) * 10;
        System.out.println("first: " + first);
        System.out.println("last: " + last);



    }
}
