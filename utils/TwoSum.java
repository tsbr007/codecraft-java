package utils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    private static int[] getTwoSum(int[] num, int target) {

        Map<Integer, Integer> pair = new HashMap<Integer, Integer>();

        for (int i = 0; i < num.length; i++) {
            if (pair.keySet().contains(num[i])) {
                return new int[]{pair.get(num[i]), i};
            } else {
                pair.put(target - num[i], i);

            }

        }
        return new int[]{};
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(getTwoSum(new int[]{2, 7, 11, 15}, 9)));

    }
}
