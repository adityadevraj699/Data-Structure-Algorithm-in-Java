class Solution {
    public String minWindow(String s, String t) {

        if(t.length() >s.length()) return "";
        

        HashMap<Character, Integer> need  = new HashMap<>();

        for (char ch : t.toCharArray()) {
            need.put(ch, need.getOrDefault(ch, 0) + 1);
        }

        HashMap<Character, Integer> window = new HashMap<>();

        int have =0,needCount=need.size(), left=0,start=0,minLength=Integer.MAX_VALUE;

        for(int right=0; right<s.length();right++){
            char ch = s.charAt(right);

            window.put(ch,window.getOrDefault(ch, 0) + 1);

            if(need.containsKey(ch) && (window.get(ch).intValue() == need.get(ch).intValue())){
                have++;
            }

            while(have==needCount){
                if((right-left+1)<minLength){
                    minLength = right - left + 1;
                    start =left;
                }

                char leftchar = s.charAt(left);

                window.put(leftchar, window.get(leftchar) - 1);
                

                if(need.containsKey(leftchar) && window.get(leftchar) < need.get(leftchar)){
                    have--;
                }
                left++;
            }
        }


        return minLength==Integer.MAX_VALUE ? "" : s.substring(start,start + minLength);
        
    }
}