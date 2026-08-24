class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> res1 = fillMap(s);
        Map<Character, Integer> res2 = fillMap(t);
        return res1.equals(res2);
    }
    
    public Map<Character, Integer> fillMap(String s){
        Map<Character, Integer> result = new HashMap<>();
        for (Character ch : s.toCharArray()){
            result.put(ch, result.getOrDefault(ch, 0) + 1);
        }
        return result;
    }
}
