class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;
        Map<Character, Integer> count = new HashMap<>();

        for (int right = 0; right < s.length(); right++){
            char rightChar = s.charAt(right);
            count.put(rightChar, count.getOrDefault(rightChar, 0) + 1);
            maxFreq = Math.max(maxFreq, count.get(rightChar));
            while((right - left + 1) - maxFreq > k){
                char leftChar = s.charAt(left);
                count.put(leftChar, count.get(leftChar) - 1);
                left++;
            }
            maxLength = Math.max(maxFreq, (right - left + 1));
        }
        return maxLength;
    }
}
