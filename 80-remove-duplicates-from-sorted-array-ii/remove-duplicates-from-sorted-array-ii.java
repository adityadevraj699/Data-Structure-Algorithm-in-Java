class Solution {
    public int removeDuplicates(int[] nums) {

        int index=0;
        int freq=1;

       int[] arr= new int[nums.length];
        arr[index] = nums[0];

       for(int i=1;i<nums.length;i++){
        if(nums[i] == arr[index] && freq <2){
            arr[++index] =nums[i];
            freq++;
        }
        else if(nums[i]!=arr[index]){
            arr[++index] = nums[i];
            freq =1;
        }
       }

       for(int i=0;i<nums.length;i++){
        nums[i] = arr[i];
       }

        return index+1;
        
    }
}