class Solution {
    public String reverseWords(String s) {
        String[] words= s.trim().split("\\s+");
        String newstring ="";

        for(int i=0;i<words.length;i++){
            newstring = words[i]+" "+newstring;
        }

        return newstring.trim();
    }
}