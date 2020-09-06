package com.company;
import java.util.ArrayList; // import the ArrayList class
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int[] test = new int[]{1,1,1,2,2,2,3};
        Solution sl = new Solution();

        int ans = sl.removeDuplicates(test);

        System.out.println(ans);

        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
        }


// [1,1,2,2,3]

    }
}


class Solution {
    public int removeDuplicates(int[] nums) {

        int lastIndexOfReturnArray = 2;
        for(int i=2; i<nums.length; i++){
            System.out.println("j :"+i);
            System.out.println("i :"+lastIndexOfReturnArray );
            System.out.println("********************");
            if(nums[lastIndexOfReturnArray-2] != nums[i]){

                nums[lastIndexOfReturnArray]=nums[i];
                lastIndexOfReturnArray++;
            }
        }

        return lastIndexOfReturnArray;

    }
}












