class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans=0, l=0, r=0;
        while (l<n && r < n){
            if (!set.contains(s.charAt(r))){
                set.add(s.charAt(r++));
                ans = Math.max(ans, r - l);
            }
            else{
                set.remove(s.charAt(l++));
            }
        }
        return ans;
    }
}
