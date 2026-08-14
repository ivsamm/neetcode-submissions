class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> integersWithoutDuplicate = new HashSet<>();
        for (int num : nums){
            if (!integersWithoutDuplicate.add(num)){
                return true;
            }
        }
        return false;
    }
}