package loop.tasks10_20;

import java.util.Arrays;

public class Ex18 {
    public static void main(String[] args) {
        int num = 12324345;
        int numLength = (num + "").length();
        int newNum = 0;
        int pow = numLength-1;
        int[] arr = new int[numLength];
        int count = 0;
        for (int i = 0;i<numLength-1;i++){
            int powParam = (int) Math.pow(10,pow);
            pow--;
            newNum = (num/powParam);
            num = num - (newNum * powParam);
            arr[count++] = newNum;
        }
        arr[count++] = num;
        System.out.println(Arrays.toString(arr));


    }
}
