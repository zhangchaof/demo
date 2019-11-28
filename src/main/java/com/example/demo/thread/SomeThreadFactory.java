package com.example.demo.thread;

import java.util.HashMap;
import java.util.Map;

/**
 * @author
 */
public class SomeThreadFactory {
    public void twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i< nums.length;i++) {
            for(int j = i + 1; j < nums.length;j++) {
                if(nums[i] + nums[j] == target) {
                    System.out.println("i = " + i);
                    System.out.println("j=" + j);
                }
            }
        }

    }
}
