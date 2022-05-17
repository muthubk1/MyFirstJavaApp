package com.java.arrays;

public class EvenNumDigits {

    public static int findNumbers(int[] nums) {
        int evenCount=0;
        for(int num:nums){
            int temp = String.valueOf(num).length();
            if(temp%2 == 0){
                evenCount=evenCount+1;
            }
        }
        return evenCount;
    }

    public static void main(String[] args) {
        int[] nums = {555,901,482,1771};
        int result = findNumbers(nums);
        System.out.println(result);
    }
}
