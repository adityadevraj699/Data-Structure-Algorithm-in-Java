class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        if (magazine.length() < ransomNote.length()) return false;

       List<Character> list = new ArrayList<>();
       for(char ch : magazine.toCharArray()){
        list.add(ch);
       }
       for(char ch : ransomNote.toCharArray()){
        if(list.contains(ch)){
            list.remove(Character.valueOf(ch));
        }
        else{
            return false;
        }
       }

       return true;
    }
}