public class Main {

    public static void main(String[] args) {

    }
}

class Solution {
    public int removeDuplicates(int[] nums) {

        int lastIndexOfReturnArray = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=nums[lastIndexOfReturnArray]){
                lastIndexOfReturnArray++;
                nums[lastIndexOfReturnArray]=nums[i];
            }
        }

        return lastIndexOfReturnArray+1;

    }
}


// class Solution {
//     public int removeElement(int[] nums, int val) {

//         int lastIndexOfReturnArray = 0;
//         for(int i=0; i<nums.length; i++){

//             if(nums[i]!=val){
//                 nums[lastIndexOfReturnArray] = nums[i];
//                 lastIndexOfReturnArray++;
//             }

//         }

//         return lastIndexOfReturnArray;


//     }
// }


// Time complexity: O(n)
// Space complexity: O(1)
// slow and fast pointer: slow one (new array last element), fast one
// [0,0,1,1,1,2,2,3,3,4] => [0,1,2,3,4,2,2,3,3,4]