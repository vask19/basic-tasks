package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] testArray = new int[]{1,4,3,7,0,0,2,3,1,2,3,11,22,33,4,2,1,43,23,43,2,3,2,35};
        System.out.println(Arrays.toString(twoSum(testArray, 7)));
    }

    private static int[] twoSum(int[] arr,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length;i++){
            map.put(arr[i],i);
        }

        for (int i = 0; i < arr.length; i++){
            int requiredNumber = ( target - arr[i]);
            if (map.containsKey(requiredNumber) && map.get(requiredNumber) != null){
                return new int[]{i,map.get(requiredNumber)};
            }
        }

        return new int[]{};

    }
}
