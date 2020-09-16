class Solution {
    public int findDuplicate(int[] nums) {

        Set<Integer> mySet = new HashSet<Integer>();

        for(int i=0; i< nums.length; i++){

            if(mySet.contains(nums[i])){
                return nums[i];
            }else{
                mySet.add(nums[i]);
            }
        }
        return -1;
    }
}