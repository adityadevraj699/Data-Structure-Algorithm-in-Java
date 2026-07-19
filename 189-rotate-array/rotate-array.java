class Solution {
    public void rotate(int[] nums, int k) {

        k = k%nums.length;

        rotate(nums,0,nums.length-1);
        rotate(nums,0,k-1);
        rotate(nums,k,nums.length-1);
        
    }

    public static void rotate(int[] nums, int start, int end){
        while(start<end){
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] =temp;

            start++; end--;
        }

    }
}