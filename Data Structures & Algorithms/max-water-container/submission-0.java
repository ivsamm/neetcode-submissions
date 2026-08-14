class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int maxWater = 0;

        while (left < right){
            int weight = right - left;
            int h = Math.min(heights[right], heights[left]);
            int currentWater = weight * h;
            maxWater = Math.max(currentWater, maxWater);
            if (heights[left] < heights[right]){
                left++;
            }
            else {
                right --;
            }
        }
        return maxWater;
    }
}
