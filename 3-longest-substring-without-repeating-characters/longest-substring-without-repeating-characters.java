class Solution {
    public int lengthOfLongestSubstring(String s) {

        int left=0, right=0, max=0;

        while(left<s.length() && right<s.length()){
            if(s.substring(left,right).indexOf(s.charAt(right))== -1){
                max = Math.max(max,right-left+1);

            }
            else{
                left += s.substring(left,right).indexOf(s.charAt(right)) +1;
            }
            right++;
        }

        return max;
        
    }
}