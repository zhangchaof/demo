package com.example.demo.arth;

/**
 * @author clark
 * @Description:
 * @date 2020/4/27 20:41
 */
public class FindMaxFromTwoNums {

    public static void main(String[] args) {
        int[] arrays = {4, 5, 6,8, 1, 2, 3};
        int max2 = findMax2(arrays);
        System.out.println("max2 = " + max2);
    }

    /**
     * 从两段有序的数字中找出最大，时间复杂度log(n)
     *
     * @param arr
     * @return
     */
    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int len = arr.length;
        if (len == 1) {
            return arr[0];
        } else {
            int left = 0;
            int right = len - 1;

            return 0;
        }
    }
    public static int findMax2(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }
        int left = 0;
        int right = nums.length - 1;
        while(left < right) {
            int mid = (left + right) / 2;
            if(nums[mid] > nums[mid+1]){
                return nums[mid];
            }
            if(nums[mid] >= nums[left] && nums[mid] < nums[right]) {
                left = mid + 1;
            }else if(nums[mid] <= nums[left] && nums[mid] < nums[right]) {
                right = mid - 1;
            }else if(nums[mid] >= nums[left] && nums[mid] > nums[right]){
                right = mid - 1;
            }
        }
        return nums[right];
    }
}
