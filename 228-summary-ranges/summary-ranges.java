class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> numarr= new ArrayList<>();
        int i=0;
        while(i<nums.length){
            int start=nums[i];
            int j=i;

            while(j+1<nums.length && nums[j+1]==nums[j]+1){
                j++;
            }
            if(nums[j]==nums[i]){
                numarr.add(String.valueOf(start));
            }else{
              StringBuilder sb=new StringBuilder();
              sb.append(start).append("->").append(nums[j]);
              numarr.add(sb.toString());
            }
            
            i=j+1;
        }
        return numarr;
    }
}