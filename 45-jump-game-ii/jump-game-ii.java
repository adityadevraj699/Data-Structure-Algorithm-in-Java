class Solution {
    public int jump(int[] nums) {

        int end=nums.length-1, cover=0,lastindex=0, jump=0;
        
        if(nums.length ==1) return 0;

        for(int i=0;i<nums.length;i++){
            cover = Math.max(cover,i+nums[i]);

            if(i==lastindex){
                lastindex= cover;
                jump++;

                if(cover >=end) return jump;
            }

            
        }
        return jump;
        
    }
}