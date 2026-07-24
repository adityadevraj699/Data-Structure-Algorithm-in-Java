import java.util.*;

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {

        List<Integer> result = new ArrayList<>();

        if (s == null || s.length() == 0 || words == null || words.length == 0) {
            return result;
        }

        int wordLen = words[0].length();
        int wordCount = words.length;
        int totalLen = wordLen * wordCount;

        if (s.length() < totalLen) {
            return result;
        }

        // Frequency map of words
        Map<String, Integer> need = new HashMap<>();
        for (String word : words) {
            need.put(word, need.getOrDefault(word, 0) + 1);
        }

        // Try every possible offset
        for (int offset = 0; offset < wordLen; offset++) {

            int left = offset;
            int count = 0;

            Map<String, Integer> window = new HashMap<>();

            for (int right = offset; right + wordLen <= s.length(); right += wordLen) {

                String word = s.substring(right, right + wordLen);

                // Invalid word
                if (!need.containsKey(word)) {
                    window.clear();
                    count = 0;
                    left = right + wordLen;
                    continue;
                }

                // Add current word
                window.put(word, window.getOrDefault(word, 0) + 1);
                count++;

                // Too many occurrences -> shrink window
                while (window.get(word) > need.get(word)) {

                    String leftWord = s.substring(left, left + wordLen);

                    window.put(leftWord, window.get(leftWord) - 1);
                    left += wordLen;
                    count--;
                }

                // Found valid window
                if (count == wordCount) {
                    result.add(left);

                    // Move left for next possible answer
                    String leftWord = s.substring(left, left + wordLen);
                    window.put(leftWord, window.get(leftWord) - 1);
                    left += wordLen;
                    count--;
                }
            }
        }

        return result;
    }
}