class Solution {
    public int removeDuplicates(int[] nums) {

        int[] arr =new int[nums.length];
        int index=0;

        arr[index] = nums[0];

        for(int i=1;i<nums.length;i++){
            if(arr[index]!=nums[i]){

                arr[++index] = nums[i];
                
            }
        }

        for(int i=0;i<nums.length;i++){
            nums[i] = arr[i];
        }
         return index+1;
    }
}