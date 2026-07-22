class Solution {
    public int lengthOfLastWord(String s) {

        String[] stringarr = s.trim().split("\\s+");

        String last = stringarr[stringarr.length-1];


        return last.length();
        
    }
}