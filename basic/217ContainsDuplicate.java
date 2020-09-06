import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> hash_Set
                = new HashSet<Integer>();

        for(int i=0; i<nums.length; i++){

            if(hash_Set.contains(nums[i])){
                return true;
            }else{
                hash_Set.add(nums[i]);
            }
        }

        return false;

    }
}