class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map1 = addHashMapElements(s);
        Map<Character, Integer> map2 = addHashMapElements(t);
        return map1.equals(map2);
    }

    public Map<Character, Integer> addHashMapElements(String s){
        Map<Character, Integer> map = new HashMap<>();
        for (Character ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        return map;
    }
}
