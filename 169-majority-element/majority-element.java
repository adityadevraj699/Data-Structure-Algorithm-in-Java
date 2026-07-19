class Solution {
    public int majorityElement(int[] nums) {

        int cab =0, count=0;

        for(int i=0;i<nums.length;i++){
            if(cab==nums[i]){
                count++;
            }
           else{
            if(count==0){
                cab=nums[i];
                count++;
            }
            else{
                count--;
            }
           }
        }

        return cab;
        
    }
}