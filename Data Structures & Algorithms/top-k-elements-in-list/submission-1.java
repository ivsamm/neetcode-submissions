class Solution{
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> countWord = new HashMap<>();
        for (int num : nums){
            countWord.put(num, countWord.getOrDefault(num, 0) + 1);
        }
        List<int[]> arr = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : countWord.entrySet()){
            arr.add(new int[] {entry.getKey(), entry.getValue()});
        }
        
        arr.sort((a, b) -> b[1] - a[1]);
        
        int[] result = new int[k];
        for (int i = 0; i < k; i++){
            result[i] = arr.get(i)[0];
        }
        return result;
    }
}