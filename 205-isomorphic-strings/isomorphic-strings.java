// class Solution {
//     public boolean isIsomorphic(String s, String t) {
//        if(t.length() != s.length()) return false;


//        HashMap<Character,Character> map = new HashMap<>();
//        HashSet<Character> set = new HashSet<>();

//        for(int i=0;i<s.length(); i++){
//         if(map.containsKey(s.charAt(i))){
//             if(t.charAt(i) != map.get(s.charAt(i))) return false;
//         }
//         else{
//             if(set.contains(t.charAt(i))) return false;
//             map.put(s.charAt(i), t.charAt(i));
//             set.add(t.charAt(i));
//         }
//        }

//        return true; 
//     }
// }

class Solution {
    public boolean isIsomorphic(String s, String t) {

        int[] mapS = new int[256];
        int[] mapT = new int[256];

        for (int i = 0; i < s.length(); i++) {

            char a = s.charAt(i);
            char b = t.charAt(i);

            if (mapS[a] != mapT[b])
                return false;

            mapS[a] = i + 1;
            mapT[b] = i + 1;
        }

        return true;
    }
}