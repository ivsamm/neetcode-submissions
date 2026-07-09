public class Solution {
    public boolean hasDuplicate(int[] nums){
        HashSet<Integer> setNums = new HashSet<>();
        for (int num : nums){
            if (!setNums.add(num)){
                return true;
            }
        }
        return false;
    }
}
