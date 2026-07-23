class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int left=0,right=0;
        int result=0,minLength = Integer.MAX_VALUE;

        while(left<nums.length && right<nums.length){
            result +=nums[right];


            while(result >=target){
                int lenght = right - left + 1;
                minLength = Math.min(minLength,lenght);

                result -= nums[left];
                left++;
            }
                       right++;
           

        }

        if (minLength == Integer.MAX_VALUE) {
    return 0;
}

        return minLength;
    }
}