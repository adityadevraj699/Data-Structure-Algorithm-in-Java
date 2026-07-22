class Solution {
    public String convert(String s, int numRows) {
        String[] ans = new String[numRows];

        for(int i=0;i<numRows;i++){
            ans[i] ="";
        }
        int i=0;

        while(i<s.length()){
            for(int index=0;index<numRows && i<s.length();index++){
                ans[index]+= s.charAt(i++);
            }
            for(int index = numRows-2;index>0 && i<s.length();index--){
                ans[index]+= s.charAt(i++);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(String ch : ans){
            sb.append(ch);
        }

        return sb.toString();
    }
}