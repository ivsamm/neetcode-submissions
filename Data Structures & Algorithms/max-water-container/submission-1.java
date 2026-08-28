class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int maxArea = 0;
        while (left < right){
            int width = right - left;
            int currentArea = width * Math.min(heights[left], heights[right]);
            if (currentArea > maxArea){
                maxArea = currentArea;
            }
            else{
                if (heights[left] > heights[right]){
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return maxArea;

    }
}
