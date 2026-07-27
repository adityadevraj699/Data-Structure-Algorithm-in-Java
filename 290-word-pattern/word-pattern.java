class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] arr = s.trim().split("\\s+");

        if(pattern.length() != arr.length)
            return false;

        String[] freq = new String[26];
        HashSet<String> set = new HashSet<>();

        for(int i = 0; i < pattern.length(); i++) {

            char ch = pattern.charAt(i);

            if(freq[ch-'a'] == null){

                if(set.contains(arr[i]))
                    return false;

                freq[ch-'a'] = arr[i];
                set.add(arr[i]);
            }
            else{

                if(!freq[ch-'a'].equals(arr[i]))
                    return false;
            }
        }

        return true;
    }
}