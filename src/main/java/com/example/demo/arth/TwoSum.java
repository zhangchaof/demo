package com.example.demo.arth;

import java.util.HashMap;
import java.util.Map;

/**
 * @author clark
 * @Description:
 * @date 2020/5/6 15:02
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("findTwoIndex= " + findTwoIndex(array, 13));
    }

    public static int[] findTwoIndex(int[] array, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0, len = array.length; i < len; i++) {
            int part = target - array[i];
            if (map.containsKey(part)) {
                System.out.println("i = " + i + ",j:" + map.get(part));
                return new int[]{map.get(part), i};
            }
            map.put(array[i], i);
        }
        throw new RuntimeException();
    }
}
