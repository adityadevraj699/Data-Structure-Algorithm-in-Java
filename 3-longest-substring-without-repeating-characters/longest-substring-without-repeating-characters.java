class Solution {
    public int lengthOfLongestSubstring(String s) {

        int left=0, right=0, max=0;
        HashMap<Character, Integer> map = new HashMap<>();

        while(left<s.length() && right<s.length()){
           if(map.containsKey(s.charAt(right))){
            left = Math.max(left,map.get(s.charAt(right))+1);
            map.remove(s.charAt(right));
           }
           map.put(s.charAt(right),right);
           max = Math.max(max,right-left+1);
           right++;
        }

        return max;
        
    }
}