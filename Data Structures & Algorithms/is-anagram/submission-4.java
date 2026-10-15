class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> s1 = fillMap(s);
        Map<Character, Integer> s2 = fillMap(t);
        return s1.equals(s2);
    }

    public Map<Character, Integer> fillMap(String str){
        Map<Character, Integer> result = new HashMap<>();
        for (Character ch : str.toCharArray()){
            result.put(ch, result.getOrDefault(ch, 0) + 1);
        }
        return result;
    }
}
