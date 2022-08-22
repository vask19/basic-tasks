package loop.tasks10_20;

import java.util.Arrays;

public class Ex16 {


    public static void main(String[] args) {
        int num = 876432;
        int length = (num + "").length();
        int sum;
        int newNumber;
        int count = 0;
        int[] arr = new int[length];

        for (int i =0;i<length-1;i++){
            int div = 1;
            for (int j=i;j<length-1;j++)
                div *= 10;
            newNumber = num/div;
            num = num - (newNumber * div);
            arr[count++] = newNumber;
        }
        arr[count++] = num;
        sum = Arrays.stream(arr).reduce((ac,el) -> ac*el).getAsInt();
        System.out.println(sum);

    }}

