class Solution {
    public boolean canJump(int[] nums) {
        int finalvalue=nums.length-1;

        for(int i=nums.length-2;i>=0;i--){
            if(i+nums[i]>=finalvalue){
                finalvalue=i;
            }
        }

    return finalvalue==0;
        
    }


}