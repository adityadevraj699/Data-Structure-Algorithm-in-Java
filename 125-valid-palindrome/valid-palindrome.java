class Solution {
    public boolean isPalindrome(String s) {

        int start=0,end=s.length()-1;

        // StringBuilder sb1 = new StringBuilder();
        // StringBuilder sb2 = new StringBuilder();

        if(s.isEmpty()) return true;
        if(s.length()-1 <1) return true;

        while(start<end){
            

            while (start < end && !Character.isLetterOrDigit(s.charAt(start))) {
    start++;
}

while (start < end && !Character.isLetterOrDigit(s.charAt(end))) {
    end--;
}
            
            if(start<end){

            if(Character.toLowerCase(s.charAt(start))!=(Character.toLowerCase(s.charAt(end)))){
                return false;
            }
            }
            

           

            start++;end--;
        }

        return true;
        
    }
}