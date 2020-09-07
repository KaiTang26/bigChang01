class Solution {
    public void rotate(int[] nums, int k) {
        
        int temp = k % nums.length;

        if(temp==0){
            return;
        }



        int[] newNums = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            if(i+temp<nums.length){
                newNums[i+temp] = nums[i];
            }else{
                newNums[i+temp-nums.length] = nums[i];
            }
        }

        for(int i=0; i<nums.length; i++){

            nums[i] = newNums[i];
        }
        
    }
}
