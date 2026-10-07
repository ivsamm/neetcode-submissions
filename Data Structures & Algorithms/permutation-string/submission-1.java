class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();

        if (len1 > len2) {
            return false;
        }

        Map<Character, Integer> targetMap = new HashMap<>();
        Map<Character, Integer> windowMap = new HashMap<>();

        for (int i = 0; i < len1; i++){
            char targetChar = s1.charAt(i);
            targetMap.put(targetChar, targetMap.getOrDefault(targetChar, 0) + 1);

            char windowChar = s2.charAt(i);
            windowMap.put(windowChar, windowMap.getOrDefault(windowChar, 0) + 1);
        }

        if (targetMap.equals(windowMap)){
            return true;
        }

        for (int i = len1; i < len2; i++){
            char nextChar = s2.charAt(i);
            windowMap.put(nextChar, windowMap.getOrDefault(nextChar, 0) + 1);

            char prevChar = s2.charAt(i - len1);
            if (windowMap.get(prevChar) == 1){
                windowMap.remove(prevChar);
            }
            else{
                windowMap.put(prevChar, windowMap.get(prevChar) - 1);
            }

            if (windowMap.equals(targetMap)){
                return true;
            }
        }
        return false;
    }
}
