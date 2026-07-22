class Solution {
    public boolean isSubsequence(String s, String t) {

        int lastindex=-1;

        for(int i=0;i<s.length();i++){
            if(t.contains(String.valueOf(s.charAt(i)))){
                if(t.indexOf(s.charAt(i),lastindex+1)==-1){
                    return false;
                }
                lastindex = t.indexOf(s.charAt(i),lastindex+1);
                
            }else{
                return false;
            }
        }
        return true;
        
    }
}