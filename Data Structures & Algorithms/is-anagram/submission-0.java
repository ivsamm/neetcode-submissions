public class Solution{
    public boolean isAnagram(String s, String t){
        Map<Character, Integer> mapFirstWord = fillMap(s);
        Map<Character, Integer> mapSecondWord = fillMap(t);
        return mapFirstWord.equals(mapSecondWord);
    }

    public Map<Character, Integer> fillMap(String s){
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()){
            map.merge(ch, 1, Integer::sum);
        }
        return map;
    }
}