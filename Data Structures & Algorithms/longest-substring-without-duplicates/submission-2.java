class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int leftPointer = 0, rightPointer = 0, ans = 0;
        int stringLength = s.length();
        while (leftPointer < stringLength && rightPointer < stringLength){
            if (set.add(s.charAt(rightPointer))){
                rightPointer++;
                ans = Math.max(ans, rightPointer - leftPointer);
            }
            else {
                set.remove(s.charAt(leftPointer));
                leftPointer++;
            }
        }
        return ans;
    }
}
