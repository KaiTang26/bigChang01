
public class Main {

    public static void main(String[] args) {

        int[] test = new int[]{0,1,2,2,3,0,4,2};

        Solution sl = new Solution();

        int ans = sl.removeElement(test, 2);

        System.out.println(ans);

    }
}


class Solution {
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            while(left<=right && nums[right]==val){
                right--;
            }
            while (left<=right && nums[left]!=val){
                left++;
            }
            if(left<=right){
                nums[left] = nums[right];
                nums[right]=val;
                right--;
                left++;
            }
        }
        return right+1;
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
// partition array: right side all ele == val, left side ele != val
// [0,1,2,2,3,0,4,2] => [0,1,3,0,4,2,2,2]




 




