class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map1 = fillMap(s);
        Map<Character, Integer> map2 = fillMap(t);
        return map1.equals(map2);
    }
    
    public Map<Character, Integer> fillMap(String s){
        Map<Character, Integer> map = new HashMap<>();
        for (char ch: s.toCharArray()){
            map.merge(ch, 1, Integer::sum);
        }
        return map;
    }
}
